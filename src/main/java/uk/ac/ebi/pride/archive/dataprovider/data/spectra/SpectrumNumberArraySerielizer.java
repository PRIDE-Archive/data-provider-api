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
        jsonGenerator.writeBinary(compressArrayDouble(value));
    }

    public static byte[] compressArrayDouble(Double[] value){

        ByteBuffer buffer = ByteBuffer.allocate(value.length * 8);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        for (double aDoubleArray : value) {
            buffer.putDouble(aDoubleArray);
        }
        byte[] data = buffer.array();

        byte[] temp = new byte[data.length / 2];
        int compressedBytes = temp.length;
        while (compressedBytes == temp.length) {
            // compress
            temp = new byte[temp.length * 2];
            Deflater compressor = new Deflater();
            compressor.setInput(data);
            compressor.finish();
            compressedBytes = compressor.deflate(temp);
        }

        // create a new array with the size of the compressed data (compressedBytes)
        data = new byte[compressedBytes];
        System.arraycopy(temp, 0, data, 0, compressedBytes);
        return data;
    }
}
