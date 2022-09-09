package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.Data;
import uk.ac.ebi.pride.archive.dataprovider.data.peptide.PSMProvider;
import uk.ac.ebi.pride.archive.dataprovider.data.ptm.IdentifiedModification;
import uk.ac.ebi.pride.archive.dataprovider.param.Param;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamProvider;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The {@link ArchiveSpectrum} is a Java class with json annotations that will be used by multiple tools including
 * the pride api, proxi api and other tools. The ArchiveSpectrum contains a PSM information as product of a complete submission
 * a reanalysis performed by external collaborators or PRIDE and also the PRIDE team.
 *
 * @author ypriverol
 */
@JsonRootName("ArchiveSpectrum")
@JsonTypeName("ArchiveSpectrum")
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArchiveSpectrum implements PSMProvider {

    String usi;

    String spectraUsi;

    String projectAccession;

    String reanalysisAccession;

    String assayAccession;

    String spectrumFile;

    String sourceID;

    String spectrumTitle;

    Double[] masses;

    Double[] intensities;

    Integer numPeaks;

    Integer msLevel;

    Integer precursorCharge;

    Double precursorMz;

    Double retentionTime;

    String peptideSequence;

    String peptidoform;

    List<String> proteinAccessions;

    Integer missedCleavages;

    Collection<IdentifiedModification> modifications;

    Boolean isDecoy;

    private Set<Param> qualityEstimationMethods;

    private Boolean isValid;

    Param bestSearchEngineScore;

    private Set<Param> scores;

    Set<Param> properties;

    private Set<Param> sampleProperties;

    public ArchiveSpectrum() { }

    public ArchiveSpectrum(String usi, String spectraUsi, String projectAccession, String reanalysisAccession,
                           String assayAccession, String spectrumFile, String sourceID, String spectrumTitle,
                           Double[] masses, Double[] intensities, Integer numPeaks, Integer msLevel,
                           Integer precursorCharge, Double precursorMz, Double retentionTime, String peptideSequence,
                           String peptidoform, List<String> proteinAccessions, Integer missedCleavages,
                           Collection<IdentifiedModification> modifications, Boolean isDecoy,
                           Set<Param> qualityEstimationMethods, Boolean isValid, Param bestSearchEngineScore,
                           Set<Param> scores, Set<Param> properties, Set<Param> sampleProperties) {
        this.usi = usi;
        this.spectraUsi = spectraUsi;
        this.projectAccession = projectAccession;
        this.reanalysisAccession = reanalysisAccession;
        this.assayAccession = assayAccession;
        this.spectrumFile = spectrumFile;
        this.sourceID = sourceID;
        this.spectrumTitle = spectrumTitle;
        this.masses = masses;
        this.intensities = intensities;
        this.numPeaks = numPeaks;
        this.msLevel = msLevel;
        this.precursorCharge = precursorCharge;
        this.precursorMz = precursorMz;
        this.retentionTime = retentionTime;
        this.peptideSequence = peptideSequence;
        this.peptidoform = peptidoform;
        this.proteinAccessions = proteinAccessions;
        this.missedCleavages = missedCleavages;
        this.modifications = modifications;
        this.isDecoy = isDecoy;
        this.qualityEstimationMethods = qualityEstimationMethods;
        this.isValid = isValid;
        this.bestSearchEngineScore = bestSearchEngineScore;
        this.scores = scores;
        this.properties = properties;
        this.sampleProperties = sampleProperties;
    }

    @Override
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public Collection<? extends String> getAdditionalAttributesStrings() {
        return properties.stream().map(Param::getName).collect(Collectors.toList());
    }

    @Override
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public Collection<String> getModificationNames() {
        return modifications.stream().map(x -> x.getModificationCvTerm().getName()).collect(Collectors.toList());
    }

    @Override
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public Integer getNumberModifiedSites() {
        return modifications.size();
    }

    @Override
    public Boolean isDecoy() {
        return isDecoy;
    }

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public Collection<? extends ParamProvider> getAttributes() {
        return properties;
    }

    @Override
    public Boolean isValid() {
        return isValid;
    }
}
