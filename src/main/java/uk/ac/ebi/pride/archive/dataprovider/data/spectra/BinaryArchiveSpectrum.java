package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import uk.ac.ebi.pride.archive.dataprovider.data.ptm.IdentifiedModification;
import uk.ac.ebi.pride.archive.dataprovider.param.Param;

import java.util.Collection;
import java.util.Set;

@Data
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class BinaryArchiveSpectrum extends SummaryArchiveSpectrum{

    Integer msLevel;
    Double retentionTime;
    Integer missedCleavages;
    Collection<IdentifiedModification> modifications;
    Set<Param> qualityEstimationMethods;
    Set<Param> properties;
    @JsonSerialize(using = SpectrumNumberArraySerielizer.class)
    @JsonDeserialize(using = SpectrumNumberArrayDeserializer.class)
    Double[] masses;
    @JsonSerialize(using = SpectrumNumberArraySerielizer.class)
    @JsonDeserialize(using = SpectrumNumberArrayDeserializer.class)
    Double[] intensities;

    public BinaryArchiveSpectrum() {
        super();
    }
}
