package uk.ac.ebi.pride.archive.dataprovider.param;

import java.io.Serializable;
import java.util.Collection;

/**
 * {@code ParamGroupProvider} defines an interface for accessing the details of a collection of params
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface ParamGroupProvider extends Serializable {

    Collection<? extends ParamProvider> getParams();
}
