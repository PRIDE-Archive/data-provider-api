package uk.ac.ebi.pride.archive.dataprovider.assay.instrument;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;

/**
 * {@code InstrumentComponentProvider} defines an interface for accessing the details of a instrument component
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface InstrumentComponentProvider extends ParamGroupProvider, EntityProvider{
    public int getOrder();
}
