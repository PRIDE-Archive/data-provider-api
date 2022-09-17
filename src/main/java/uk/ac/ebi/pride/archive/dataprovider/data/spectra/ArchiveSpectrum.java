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

/**
 * The {@link ArchiveSpectrum} is a Java class with json annotations that will be used by multiple tools including
 * the pride api, proxi api and other tools. The ArchiveSpectrum contains a PSM information as product of a complete submission
 * a reanalysis performed by external collaborators or PRIDE and also the PRIDE team.
 *
 * @author ypriverol
 */
@Data
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArchiveSpectrum extends BinaryArchiveSpectrum {

    Double[] masses;

    Double[] intensities;

    public ArchiveSpectrum() {
        super();
    }

    public ArchiveSpectrum(BinaryArchiveSpectrum binaryArchiveSpectrum) {
        super();
        this.msLevel = binaryArchiveSpectrum.msLevel;
        this.retentionTime = binaryArchiveSpectrum.retentionTime;
        this.missedCleavages = binaryArchiveSpectrum.missedCleavages;
        this.modifications = binaryArchiveSpectrum.modifications;
        this.qualityEstimationMethods = binaryArchiveSpectrum.qualityEstimationMethods;
        this.properties = binaryArchiveSpectrum.properties;
        this.masses = binaryArchiveSpectrum.masses;
        this.intensities = binaryArchiveSpectrum.intensities;
    }

}
