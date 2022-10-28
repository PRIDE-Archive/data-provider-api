package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.module.paranamer.ParanamerModule;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import uk.ac.ebi.pride.archive.dataprovider.data.ptm.IdentifiedModification;
import uk.ac.ebi.pride.archive.dataprovider.param.Param;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Data
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class BinaryArchiveSpectrum extends SummaryArchiveSpectrum {

    private static final ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new ParanamerModule());
    }

    Integer msLevel;
    Double retentionTime;
    Integer missedCleavages;
    Collection<IdentifiedModification> modifications;
    Set<Param> qualityEstimationMethods;
    Set<Param> properties;

//    @JsonSerialize(using = SpectrumNumberArraySerielizer.class)
//    @JsonDeserialize(using = SpectrumNumberArrayDeserializer.class)
    Double[] masses;

//    @JsonSerialize(using = SpectrumNumberArraySerielizer.class)
//    @JsonDeserialize(using = SpectrumNumberArrayDeserializer.class)
    Double[] intensities;

    public BinaryArchiveSpectrum() {
        super();
    }

    public BinaryArchiveSpectrum(String usi, String spectraUsi, String assayAccession, String projectAccession,
                                 String reanalysisAccession, List<String> proteinAccessions, String peptideSequence,
                                 String peptidoform, Set<Param> scores, Set<Param> sampleProperties,
                                 Boolean isDecoy, Boolean isValid, Integer precursorCharge, Double precursorMz,
                                 Param bestSearchEngineScore, Integer numPeaks, Integer msLevel,
                                 Double retentionTime, Integer missedCleavages,
                                 Collection<IdentifiedModification> modifications, Set<Param> qualityEstimationMethods,
                                 Set<Param> properties, Double[] masses, Double[] intensities) {
        super(usi, spectraUsi, assayAccession, projectAccession, reanalysisAccession, proteinAccessions,
                peptideSequence, peptidoform, scores, sampleProperties, isDecoy, isValid, precursorCharge,
                precursorMz, bestSearchEngineScore, numPeaks);
        this.msLevel = msLevel;
        this.retentionTime = retentionTime;
        this.missedCleavages = missedCleavages;
        this.modifications = modifications;
        this.qualityEstimationMethods = qualityEstimationMethods;
        this.properties = properties;
        this.masses = masses;
        this.intensities = intensities;
    }

    public static String writeJson(BinaryArchiveSpectrum binaryArchiveSpectrum) throws IOException {
        return objectMapper.writeValueAsString(binaryArchiveSpectrum);
    }

    public static BinaryArchiveSpectrum readJson(String binaryArchiveSpectrumLine) throws IOException {
        return objectMapper.readValue(binaryArchiveSpectrumLine, BinaryArchiveSpectrum.class);
    }
}
