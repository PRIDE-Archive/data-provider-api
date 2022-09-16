package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class SpectrumNumberArrayDeserializer extends JsonDeserializer {
    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        ObjectCodec oc = jsonParser.getCodec();
        JsonNode node = oc.readTree(jsonParser);
        byte[] compressedData = node.binaryValue();
        return decompress(compressedData);
    }

    public static Double[] decompress(byte[] compressedData){
        // using a ByteArrayOutputStream to not having to define the result array size beforehand
        Inflater decompressor = new Inflater();

        decompressor.setInput(compressedData);
        // Create an expandable byte array to hold the decompressed data
        ByteArrayOutputStream bos = new ByteArrayOutputStream(compressedData.length);
        byte[] buf = new byte[1024];
        while (!decompressor.finished()) {
            try {
                int count = decompressor.inflate(buf);
                if (count == 0 && decompressor.needsInput()) {
                    break;
                }
                bos.write(buf, 0, count);
            } catch (DataFormatException e) {
                throw new IllegalStateException("Encountered wrong data format " +
                        "while trying to decompress binary data!", e);
            }
        }
        try {
            bos.close();
        } catch (IOException e) {
            // ToDo: add logging
            e.printStackTrace();
        }
        // Get the decompressed data
        byte [] decompressedData = bos.toByteArray();

        Double[] resultArray = new Double[decompressedData.length / 8];
        // create a buffer around the data array for easier retrieval
        ByteBuffer bb = ByteBuffer.wrap(decompressedData);
        bb.order(ByteOrder.LITTLE_ENDIAN); // the order is always LITTLE_ENDIAN
        // progress in steps of 4/8 bytes according to the set step
        for (int indexOut = 0; indexOut < decompressedData.length; indexOut += 8) {
            // Note that the 'getFloat(index)' and getInt(index) methods read the next 4 bytes
            // and the 'getDouble(index)' and getLong(index) methods read the next 8 bytes.
            Double num = bb.getDouble(indexOut);
            resultArray[indexOut / 8] = num;
        }
        return resultArray;
    }
}
