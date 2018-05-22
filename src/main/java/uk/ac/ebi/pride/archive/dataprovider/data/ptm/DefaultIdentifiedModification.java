package uk.ac.ebi.pride.archive.dataprovider.data.ptm;

import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.DefaultCvParam;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ypriverol
 */
public class DefaultIdentifiedModification implements IdentifiedModificationProvider {


    private CvParamProvider neutralLoss;
    private Map<Integer, List<CvParamProvider>> positionMap;
    private CvParamProvider modification;
    private List<CvParamProvider> attributes;

    /**
     * Default constructor
     */
    public DefaultIdentifiedModification() { }

    /**
     * Constructor with all parameters
     *
     * @param neutralLoss neutral loss {@link CvParamProvider}
     * @param positionMap Map Position and List of {@link CvParamProvider}
     * @param modification modification as {@link CvParamProvider}
     * @param attributes Attributes
     */
    public DefaultIdentifiedModification(CvParamProvider neutralLoss, Map<Integer, List<CvParamProvider>> positionMap, CvParamProvider modification, List<CvParamProvider> attributes) {
        this.neutralLoss = neutralLoss;
        this.positionMap = positionMap;
        this.modification = modification;
        this.attributes = attributes;
    }

    /**
     * Default Constructor for Identified Modifications with {@link CvParamProvider} and list of positions
     * @param modification CvTerm for the modification
     * @param positions positions of the modification
     */
    public DefaultIdentifiedModification(CvParamProvider modification, List<Integer> positions) {
        this.modification = modification;
        this.positionMap = new HashMap<>();
        positions.forEach(position -> this.positionMap.put(position, new ArrayList<>()));
    }

    /**
     * Default Constructor for Identified Modifications with {@link CvParamProvider} and list of positions
     * @param modification Cv Term for the Modification
     * @param neutralLoss  Cv Term for the Neutral Loss
     * @apram List of positions
     */
    public DefaultIdentifiedModification(CvParamProvider modification, CvParamProvider neutralLoss, List<Integer> positions) {
        this.modification = modification;
        this.positionMap = new HashMap<>();
        this.neutralLoss = neutralLoss;
        positions.forEach(position -> this.positionMap.put(position, new ArrayList<>()));
    }

    @Override
    public CvParamProvider getNeutralLoss() {
        return this.neutralLoss;
    }

    @Override
    public Map<Integer, List<CvParamProvider>> getPositionMap() {
        return this.positionMap;
    }

    @Override
    public CvParamProvider getModificationCvTerm() {
        return modification;
    }

    @Override
    public Collection<? extends String> getAdditionalAttributesStrings() {
        List<String> attributes = Collections.EMPTY_LIST;
        if(this.attributes != null && !this.attributes.isEmpty())
            attributes = this.attributes.stream().map(CvParamProvider::getName).collect(Collectors.toList());
        return attributes;
    }
}
