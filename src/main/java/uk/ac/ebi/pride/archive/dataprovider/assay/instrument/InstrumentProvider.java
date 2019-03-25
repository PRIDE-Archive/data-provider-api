package uk.ac.ebi.pride.archive.dataprovider.assay.instrument;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

import java.util.Collection;

/**
 * {@code InstrumentProvider} defines an interface for accessing the details of a mass spec instrument
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface InstrumentProvider extends EntityProvider{
    <T extends CvParamProvider> T getModel();
    Collection<? extends InstrumentComponentProvider> getSources();
    Collection<? extends InstrumentComponentProvider> getAnalyzers();
    Collection<? extends InstrumentComponentProvider> getDetectors();
}