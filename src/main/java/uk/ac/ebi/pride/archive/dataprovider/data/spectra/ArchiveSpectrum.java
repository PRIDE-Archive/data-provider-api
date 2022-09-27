package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * The {@link ArchiveSpectrum} is a Java class with json annotations that will be used by multiple tools including
 * the pride api, b.proxi api and other tools. The ArchiveSpectrum contains a PSM information as product of a complete submission
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

    public ArchiveSpectrum(BinaryArchiveSpectrum b) {
        super(b.usi, b.spectraUsi, b.assayAccession, b.projectAccession, b.reanalysisAccession, b.proteinAccessions, b.peptideSequence, b.peptidoform, b.scores, b.sampleProperties, b.isDecoy, b.isValid, b.precursorCharge, b.precursorMz, b.bestSearchEngineScore, b.numPeaks, b.msLevel, b.retentionTime, b.missedCleavages, b.modifications, b.qualityEstimationMethods, b.properties, b.masses, b.intensities);
        this.masses = b.getMasses();
        this.intensities = b.getIntensities();
    }
}
