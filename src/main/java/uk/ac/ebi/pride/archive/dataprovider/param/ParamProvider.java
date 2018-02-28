package uk.ac.ebi.pride.archive.dataprovider.param;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * {@code ParamProvider} Cv Param anh how is handle in PRIDE context:
 *
 * Name: Name of the User Param
 * Value: Value of the User Param
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface ParamProvider extends EntityProvider {

    // Name of the CVParam
    String getName();

    // Value of the CVParam
    String getValue();
}
