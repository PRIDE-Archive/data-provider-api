package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class SpectrumNumberArrayDeserializer extends JsonDeserializer {
    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec oc = jsonParser.getCodec();
        JsonNode node = oc.readTree(jsonParser);
        try {
            return decompress(node.textValue());
        } catch (DataFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public static Double[] decompress(String peaks) throws IOException, DataFormatException {
        byte[] decoded;

        decoded = org.apache.commons.codec.binary.Base64.decodeBase64(peaks);
        decoded = zlibUncompressBuffer(decoded);

        int decodedLen = decoded.length; // in bytes
        int chunkSize = 64 / 8;
        int numPeaks = decodedLen / chunkSize;
        double[] retAry = new double[numPeaks];
        long asLong;
        double asDouble;
        int offset;

        for (int i = 0; i < numPeaks; i++) {
            offset = i * chunkSize;

            asLong = ( (long) (decoded[offset + 0] & 0xFF)) // zero shift
                    | ((long) (decoded[offset + 1] & 0xFF) << 8)
                    | ((long) (decoded[offset + 2] & 0xFF) << 16)
                    | ((long) (decoded[offset + 3] & 0xFF) << 24)
                    | ((long) (decoded[offset + 4] & 0xFF) << 32)
                    | ((long) (decoded[offset + 5] & 0xFF) << 40)
                    | ((long) (decoded[offset + 6] & 0xFF) << 48)
                    | ((long) (decoded[offset + 7] & 0xFF) << 56);
            asDouble = Double.longBitsToDouble(asLong);

            retAry[i] = asDouble;
        }
        return Arrays.stream(retAry).boxed().toArray(Double[]::new);
    }

    /** https://github.com/dfermin/lucXor/blob/master/src/lucxor/mzMLreader.java
     * Inflates zLib compressed byte[].
     * @param compressed zLib compressed bytes
     * @return inflated byte array
     * @throws IOException should never happen, ByteArrayOutputStream is in-memory
     */
    public static byte[] zlibUncompressBuffer(byte[] compressed) throws IOException, DataFormatException {

        Inflater decompressor = new Inflater();
        decompressor.setInput(compressed);

        ByteArrayOutputStream bos = new ByteArrayOutputStream(compressed.length);
        byte[] buf = new byte[decompressor.getRemaining() * 2];
        try {
            while (decompressor.getRemaining() > 0) {
                int count = decompressor.inflate(buf);
                bos.write(buf, 0, count);
            }
        } finally {
            bos.close();
        }
        decompressor.end();
        return bos.toByteArray();
    }
}
