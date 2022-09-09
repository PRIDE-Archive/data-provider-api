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

    private String assayAccession;

    private String projectAccession;
    
    private String reanalysisAccession;

    List<String> proteinAccessions;

    private String peptideSequence;

    private String modifiedPeptideSequence;

    private String peptidoform;

    private Set<Param> scores;

    private Set<Param> sampleProperties;

    private Boolean isDecoy;

    private Boolean isValid;

    private Integer precursorCharge;

    private Double precursorMz;

    private String spectrumFile;

    private Param bestSearchEngineScore;

    Integer numPeaks;

}
