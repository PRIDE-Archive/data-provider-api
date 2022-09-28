package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.xerial.snappy.Snappy;

import java.io.IOException;
import java.util.Base64;
import java.util.stream.Stream;

public class SpectrumNumberArraySerielizer extends JsonSerializer {

    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Double[] value = (Double[]) o;
        jsonGenerator.writeString(Base64.getEncoder().encodeToString(compressArrayDouble(value)));
    }

    public static byte[] compressArrayDouble(Double[] values) throws IOException {
        return Snappy.compress(Stream.of(values).mapToDouble(Double::doubleValue).toArray());
    }
}
