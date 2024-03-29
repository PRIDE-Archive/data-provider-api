package uk.ac.ebi.pride.archive.dataprovider.data.protein;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import uk.ac.ebi.pride.archive.dataprovider.data.ptm.IdentifiedModificationProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParam;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.Param;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The {@link ArchiveProteinEvidence} contains the information of a protein identification in an specific experiment/dataset.
 * It contains the
 */

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArchiveProteinEvidence implements ProteinDetailProvider {

    /** Generated accession **/
    @JsonIgnore
    private String id;
    private String reportedAccession;
    private String assayAccession;
    private String projectAccession;
    private String reanalysisAccession;
    private List<String> modificationsNames;
    private Param bestSearchEngineScore;
    private Set<Param> sampleProperties;
    private Set<Param> properties;
    private Set<Param> qualityEstimationMethods;
    private Boolean isValid;
    private boolean isDecoy;
    private Integer numberPeptides;
    private Integer numberPSMs;
    private Set<PeptideSpectrumOverview> psmAccessions;

    @JsonIgnore
    public Collection<String> getIdentifiedModifications() {
        return modificationsNames;
    }

    @Override
    @JsonIgnore
    public String getAccession() {
        return reportedAccession;
    }

    @Override
    @JsonIgnore
    public Comparable getId() {
        return id;
    }

    @Override
    @JsonIgnore
    public Collection<? extends String> getAdditionalAttributesStrings() {
        return (properties != null)? properties
                .stream()
                .map(Param::getValue)
                .collect(Collectors.toList()): Collections.emptyList() ;
    }

    /**
     * This method add an attribute as {@link CvParamProvider} to the list of attributes.
     * @param attribute Attribute in {@link CvParamProvider}
     */
    public void addAttribute(CvParam attribute){
        if(properties == null)
            properties = new HashSet<>();
        properties.add(new Param(attribute.getAccession(), attribute.getName(),
                attribute.getValue()));
    }

    /**
     * Add to the list of modifications of a Protein.
     * @param modification {@link IdentifiedModificationProvider}
     */
    public void addIdentifiedModification(String modification){
        if(modificationsNames == null)
            modificationsNames = new ArrayList<>();
        modificationsNames.add(modification);
    }

    @Override
    public String toString() {
        return "PrideMongoProteinEvidence{" +
                "id=" + id +
                ", reportedAccession='" + reportedAccession + '\'' +
                ", assayAccession='" + assayAccession + '\'' +
                ", projectAccession='" + projectAccession + '\'' +
                ", reanalysisAccession='" + reanalysisAccession + '\'' +
                ", additionalAttributes=" + properties +
                ", ptms=" + modificationsNames +
                ", bestSearchEngineScore=" + bestSearchEngineScore +
                ", sampleProperties=" + sampleProperties +
                ", qualityEstimationMethods=" + qualityEstimationMethods +
                ", isValid=" + isValid +
                ", isDecoy=" + isDecoy +
                ", numberPeptides=" + numberPeptides +
                ", numberPSMs=" + numberPSMs +
                '}';
    }
}
