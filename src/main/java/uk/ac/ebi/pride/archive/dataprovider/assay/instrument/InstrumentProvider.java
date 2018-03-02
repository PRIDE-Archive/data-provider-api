package uk.ac.ebi.pride.archive.dataprovider.assay.instrument;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

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
     * @return List of source information for the instrument
     */
    Collection<? extends InstrumentComponentProvider> getSources();

    /**
     * @return List of analyzers information for the instrument
     */
    Collection<? extends InstrumentComponentProvider> getAnalyzers();

    /**
     * @return List of detectors information for the instrument
     */
    Collection<? extends InstrumentComponentProvider> getDetectors();
}
