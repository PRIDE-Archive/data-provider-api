package uk.ac.ebi.pride.archive.dataprovider.entity;

import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;

/**
 * This interface only helps to add properties and attributes to each entity as CVParam/UserParam. For example, if the Spectrum has additional information like the
 * Fragmentation type, Instrument, etc, then it can be store as attributes.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$

 */
public interface EntityParamGroupProvider extends EntityProvider, ParamGroupProvider{

}
