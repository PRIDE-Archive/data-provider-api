package uk.ac.ebi.pride.archive.dataprovider.param;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * {@code ParamProvider} CvParam or User Param are encoded using the ParamProvider
 *
 * The Name of the param is used for both User and CvParam; the Value is used in both.
 *
 * Name: Name of the User Param
 * Value: Value of the User Param
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface ParamProvider extends EntityProvider {

    /**
     * @return Name of the CVparam or UserPAram
     */
    String getName();

    /**
     * @return Value of the CVParam or UserParam
     */
    String getValue();
}
