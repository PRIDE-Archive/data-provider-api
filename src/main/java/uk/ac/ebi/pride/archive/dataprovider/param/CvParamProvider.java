package uk.ac.ebi.pride.archive.dataprovider.param;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * {@code CvParamProvider} defines an interface for accessing the details of a CV param
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CvParam.class, name = "CvParam")}
)
public interface CvParamProvider extends ParamProvider {

    /**
     * The CVLabel is used by the ontologies to identified the ontology
     * that provides the term.
     * @return CVLabel
     */
    String getCvLabel();

    /**
     * The accession of the term in the ontology
     * @return accession
     */
    String getAccession();
}
