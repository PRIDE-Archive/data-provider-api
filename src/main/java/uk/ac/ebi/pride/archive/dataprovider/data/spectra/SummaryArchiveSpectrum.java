package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import uk.ac.ebi.pride.archive.dataprovider.param.Param;

import java.util.List;
import java.util.Set;


@Data
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class SummaryArchiveSpectrum {

    String usi;
    String spectraUsi;
    String assayAccession;
    String projectAccession;
    String reanalysisAccession;
    List<String> proteinAccessions;
    String peptideSequence;
    String peptidoform;
    Set<Param> scores;
    Set<Param> sampleProperties;
    Boolean isDecoy;
    Boolean isValid;
    Integer precursorCharge;
    Double precursorMz;
    Param bestSearchEngineScore;
    Integer numPeaks;

    public SummaryArchiveSpectrum() {
    }
}
