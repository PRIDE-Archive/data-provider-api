package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.Deflater;

public class SpectrumNumberArraySerielizer extends JsonSerializer {

    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Double[] value = (Double[]) o;
        jsonGenerator.writeString(compressArrayDouble(value));
    }

    public static String compressArrayDouble(Double[] values) {
        int dataLength;
        ByteBuffer buffer = ByteBuffer.allocate(values.length * 8);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        for (double aDoubleArray : values) {
            buffer.putDouble(aDoubleArray);
        }
        byte[] data = buffer.array();
        byte[] dataBytes = compress(data);
        return org.apache.commons.codec.binary.Base64.encodeBase64String(dataBytes);
    }

    private static byte[] compress(byte[] uncompressedData) {
        byte[] data; // Decompress the data

        // create a temporary byte array big enough to hold the compressed data
        // with the worst compression (the length of the initial (uncompressed) data)
        // EDIT: if it turns out this byte array was not big enough, then double its size and try again.
        byte[] temp = new byte[uncompressedData.length / 2];
        int compressedBytes = temp.length;
        while (compressedBytes == temp.length) {
            // compress
            temp = new byte[temp.length * 2];
            Deflater compresser = new Deflater();
            compresser.setInput(uncompressedData);
            compresser.finish();
            compressedBytes = compresser.deflate(temp);
        }

        // create a new array with the size of the compressed data (compressedBytes)
        data = new byte[compressedBytes];
        System.arraycopy(temp, 0, data, 0, compressedBytes);

        return data;
    }
}
