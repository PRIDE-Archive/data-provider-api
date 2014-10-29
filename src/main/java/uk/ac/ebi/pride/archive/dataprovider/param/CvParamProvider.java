package uk.ac.ebi.pride.archive.dataprovider.param;

/**
 * {@code CvParamProvider} defines an interface for accessing the details of a CV param
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface CvParamProvider extends ParamProvider {

    public String getCvLabel();
    public String getAccession();
}
