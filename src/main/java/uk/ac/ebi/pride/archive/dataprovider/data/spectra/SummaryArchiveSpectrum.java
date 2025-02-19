package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import uk.ac.ebi.pride.archive.dataprovider.data.ptm.IdentifiedModification;
import uk.ac.ebi.pride.archive.dataprovider.param.Param;

import java.util.Collection;
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
    Collection<IdentifiedModification> modifications;
    Set<Param> scores;
    Set<Param> sampleProperties;
    Boolean isDecoy;
    Boolean isValid;
    Integer precursorCharge;
    Double precursorMz;
    Param bestSearchEngineScore;
    Integer numPeaks;
    String provider;

    @JsonProperty("project_accession")
    public void setProjectAccession(String projectAccession) {
        this.projectAccession = projectAccession;
    }

    @JsonProperty("num_peaks")
    public void setNumPeaks(Integer numPeaks) {
        this.numPeaks = numPeaks;
    }

    @JsonProperty("spectra_usi")
    public void setSpectraUsi(String spectraUsi) {
        this.spectraUsi = spectraUsi;
    }

    @JsonProperty("peptide_sequence")
    public void setPeptideSequence(String peptideSequence) {
        this.peptideSequence = peptideSequence;
    }

    @JsonProperty("precursor_charge")
    public void setPrecursorCharge(Integer precursorCharge) {
        this.precursorCharge = precursorCharge;
    }

    @JsonProperty("protein_accessions")
    public void setProteinAccessions(List<String> proteinAccessions) {
        this.proteinAccessions = proteinAccessions;
    }

    @JsonProperty("sample_properties")
    public void setSampleProperties(Set<Param> sampleProperties) {
        this.sampleProperties = sampleProperties;
    }

    @JsonProperty("precursor_mz")
    public void setPrecursorMz(Double precursorMz) {
        this.precursorMz = precursorMz;
    }

    @JsonProperty("best_search_engine_score")
    public void setBestSearchEngineScore(Param bestSearchEngineScore) {
        this.bestSearchEngineScore = bestSearchEngineScore;
    }

    public SummaryArchiveSpectrum() {
    }

    public SummaryArchiveSpectrum(String usi, String spectraUsi, String assayAccession, String projectAccession,
                                  String reanalysisAccession, List<String> proteinAccessions, String peptideSequence,
                                  String peptidoform, Set<Param> scores, Set<Param> sampleProperties, Boolean isDecoy,
                                  Boolean isValid, Integer precursorCharge, Double precursorMz,
                                  Param bestSearchEngineScore, Integer numPeaks) {
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
