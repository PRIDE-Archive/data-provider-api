package uk.ac.ebi.pride.archive.dataprovider.param;

import java.io.Serializable;
import java.util.Collection;

/**
 * {@code ParamGroupProvider} defines an interface for accessing the details of a collection of params
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface ParamGroupProvider extends Serializable {
    public Collection<? extends ParamProvider> getParams();
}
