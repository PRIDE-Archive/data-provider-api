package uk.ac.ebi.pride.archive.dataprovider.assay.instrument;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamProvider;

import java.util.Collection;

/**
 * {@code InstrumentProvider} defines an interface for accessing the details of a mass spec instrument
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface InstrumentProvider extends EntityParamGroupProvider {

    /**
     * @return Instrument model
     */
    <T extends CvParamProvider> T getModel();

    /**
     * The instruments Params would be used to store more information related wit the Intrument. For example, if we want to handle in the future information
     * around the analyzer, source, etc. Can be done with the instruments information.
     * @return
     */
    @Override
    Collection<? extends ParamProvider> getParams();
}
