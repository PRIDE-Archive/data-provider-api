package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.xerial.snappy.Snappy;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import java.util.zip.Deflater;

public class SpectrumNumberArraySerielizer extends JsonSerializer {

    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Double[] value = (Double[]) o;
        jsonGenerator.writeBinary(compressArrayDouble(value));
    }

    public static byte[] compressArrayDouble(Double[] values) throws IOException {
        return Snappy.compress(Stream.of(values).mapToDouble(Double::doubleValue).toArray());
    }
}
