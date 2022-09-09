package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import uk.ac.ebi.pride.archive.dataprovider.param.Param;

import java.util.List;
import java.util.Set;


@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class SummaryArchiveSpectrum{

    /** Generated accession **/
    @JsonIgnore
    private String id;

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

    public SummaryArchiveSpectrum() {
    }
}
