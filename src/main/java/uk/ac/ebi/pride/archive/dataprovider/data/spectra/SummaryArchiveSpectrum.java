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

    public SummaryArchiveSpectrum(String usi, String spectraUsi, String assayAccession, String projectAccession, String reanalysisAccession, List<String> proteinAccessions, String peptideSequence, String peptidoform, Set<Param> scores, Set<Param> sampleProperties, Boolean isDecoy, Boolean isValid, Integer precursorCharge, Double precursorMz, Param bestSearchEngineScore, Integer numPeaks) {
        this.usi = usi;
        this.spectraUsi = spectraUsi;
        this.assayAccession = assayAccession;
        this.projectAccession = projectAccession;
        this.reanalysisAccession = reanalysisAccession;
        this.proteinAccessions = proteinAccessions;
        this.peptideSequence = peptideSequence;
        this.peptidoform = peptidoform;
        this.scores = scores;
        this.sampleProperties = sampleProperties;
        this.isDecoy = isDecoy;
        this.isValid = isValid;
        this.precursorCharge = precursorCharge;
        this.precursorMz = precursorMz;
        this.bestSearchEngineScore = bestSearchEngineScore;
        this.numPeaks = numPeaks;
    }
}
