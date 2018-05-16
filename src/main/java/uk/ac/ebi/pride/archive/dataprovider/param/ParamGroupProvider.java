package uk.ac.ebi.pride.archive.dataprovider.param;

import java.io.Serializable;
import java.util.Collection;

/**
 * {@code ParamGroupProvider} defines an interface for accessing the details of a collection of params
 * CVParams or Users Params
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface ParamGroupProvider extends Serializable {

    /**
     * List of params that can be User or CVParams.
     * @return
     */
    Collection<? extends String> getAdditionalAttributes();
}
