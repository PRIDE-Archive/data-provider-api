package uk.ac.ebi.pride.archive.dataprovider.data.ptm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import uk.ac.ebi.pride.archive.dataprovider.common.Tuple;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ypriverol
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IdentifiedModification implements IdentifiedModificationProvider {


    private CvParamProvider neutralLoss;
    private List<Tuple<Integer, Set<? extends CvParamProvider>>> positionMap;
    private CvParamProvider modification;
    private Set<? extends  CvParamProvider> attributes;

    /**
     * Default constructor
     */
    public IdentifiedModification() { }

    /**
     * Constructor with all parameters
     *  @param neutralLoss neutral loss {@link CvParamProvider}
     * @param positionMap Map Position and List of {@link CvParamProvider}
     * @param modification modification as {@link CvParamProvider}
     * @param attributes Attributes
     */
    public IdentifiedModification(CvParamProvider neutralLoss, List<Tuple<Integer, Set<? extends CvParamProvider>>> positionMap, CvParamProvider modification, Set<CvParamProvider> attributes) {
        this.neutralLoss = neutralLoss;
        this.positionMap = positionMap;
        this.modification = modification;
        this.attributes = attributes;
    }

    public void setNeutralLoss(CvParamProvider neutralLoss) {
        this.neutralLoss = neutralLoss;
    }

    public void setPositionMap(List<Tuple<Integer, Set<? extends CvParamProvider>>> positionMap) {
        this.positionMap = positionMap;
    }

    public void setModification(CvParamProvider modification) {
        this.modification = modification;
    }

    public void setAttributes(Set<? extends  CvParamProvider> attributes) {
        this.attributes = attributes;
    }

    @Override
    public CvParamProvider getNeutralLoss() {
        return this.neutralLoss;
    }

    @Override
    public List<Tuple<Integer, Set<? extends  CvParamProvider>>> getPositionMap() {
        return this.positionMap;
    }

    @Override
    @JsonIgnore
    public CvParamProvider getModificationCvTerm() {
        return modification;
    }

    @Override
    @JsonIgnore
    public Collection<? extends String> getAdditionalAttributesStrings() {
        List<String> attributes = Collections.emptyList();
        if(this.attributes != null && !this.attributes.isEmpty())
            attributes = this.attributes.stream().map(CvParamProvider::getName).collect(Collectors.toList());
        return attributes;
    }

    public CvParamProvider getModification() {
        return modification;
    }

    public Set<? extends  CvParamProvider> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "IdentifiedModification{" +
                "neutralLoss=" + neutralLoss +
                ", positionMap=" + positionMap +
                ", modification=" + modification +
                ", attributes=" + attributes +
                '}';
    }

    public void addPosition(int proteinPosition, Set<? extends  CvParamProvider> score) {
        if(positionMap == null)
            positionMap = new ArrayList<>();
        Tuple<Integer, Set<? extends CvParamProvider>> scoreTuple = new Tuple<>(proteinPosition, score);
        positionMap.add(scoreTuple);
    }
}
