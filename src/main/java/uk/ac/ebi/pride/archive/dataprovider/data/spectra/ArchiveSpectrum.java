package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import uk.ac.ebi.pride.archive.dataprovider.data.ptm.IdentifiedModification;
import uk.ac.ebi.pride.archive.dataprovider.param.Param;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * The {@link ArchiveSpectrum} is a Java class with json annotations that will be used by multiple tools including
 * the pride api, proxi api and other tools. The ArchiveSpectrum contains a PSM information as product of a complete submission
 * a reanalysis performed by external collaborators or PRIDE and also the PRIDE team.
 *
 * @author ypriverol
 */
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArchiveSpectrum {

    String usi;

    String spectraUsi;

    String assayAccession;

    String projectAccession;

    String reanalysisAccession;

    List<String> proteinAccessions;

    String peptideSequence;

    String modifiedPeptideSequence;

    String peptidoform;

    Set<Param> scores;

    Set<Param> sampleProperties;

    Boolean isDecoy;

    Boolean isValid;

    Integer precursorCharge;

    Double precursorMz;

    String spectrumFile;

    Param bestSearchEngineScore;

    Integer numPeaks;

    String sourceID;

    String spectrumTitle;

    Double[] masses;

    Double[] intensities;

    Integer msLevel;

    Double retentionTime;

    Integer missedCleavages;

    Collection<IdentifiedModification> modifications;

    private Set<Param> qualityEstimationMethods;

    Set<Param> properties;
}
