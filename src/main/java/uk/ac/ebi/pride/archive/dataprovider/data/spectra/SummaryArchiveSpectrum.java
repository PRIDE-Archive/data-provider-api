package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    /** Accession Provided by PRIDE Pipelines **/
    String usi;

    /** Accession Provided by PRIDE Pipelines **/
    String spectraUsi;

    /** Accession in Reported File **/
    private String assayAccession;

    /** External Project that contains the PSM **/
    private String projectAccession;

    /** External Project that contains the PSM **/
    private String reanalysisAccession;

    /** Protein accessions **/
    List<String> proteinAccessions;

    /** Peptide Sequence **/
    private String peptideSequence;

    /** Modified  Sequence **/
    private String modifiedPeptideSequence;

    /** Peptidoform including the charge state**/
    private String peptidoform;

    /** Scores for the PSM SpectrumArchive **/
    private Set<Param> scores;

    /** Additional Attributes **/
    private Set<Param> sampleProperties;

    /** Is a decoy peptide **/
    private Boolean isDecoy;

    /** Is valid PSM following different metrics FDR, etc**/
    private Boolean isValid;

    /** charge state **/
    private Integer charge;

    /** Precursor mass **/
    private Double precursorMass;

    /** File name containing the PSM **/
    private String fileName;

    /** Best search engine score**/
    private Param bestSearchEngineScore;

}
