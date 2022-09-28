package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import org.xerial.snappy.Snappy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;

public class SpectrumNumberArrayDeserializer extends JsonDeserializer {
    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        ObjectCodec oc = jsonParser.getCodec();
        JsonNode node = oc.readTree(jsonParser);
        return decompress(Base64.getDecoder().decode(node.asText().getBytes()));
    }

    public static Double[] decompress(byte[] compressedData) throws IOException {
        double[] boxed = Snappy.uncompressDoubleArray(compressedData);
        return Arrays.stream(boxed).boxed().toArray(Double[]::new);
    }
}
