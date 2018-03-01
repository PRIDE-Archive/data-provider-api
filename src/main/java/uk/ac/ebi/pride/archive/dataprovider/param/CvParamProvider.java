package uk.ac.ebi.pride.archive.dataprovider.param;

/**
 * {@code CvParamProvider} defines an interface for accessing the details of a CV param
 *
 * @author Rui Wang
 * @version $Id$
 */

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
