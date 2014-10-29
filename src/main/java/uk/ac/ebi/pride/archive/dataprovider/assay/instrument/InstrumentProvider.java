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
    public <T extends CvParamProvider> T getModel();
    public Collection<? extends InstrumentComponentProvider> getSources();
    public Collection<? extends InstrumentComponentProvider> getAnalyzers();
    public Collection<? extends InstrumentComponentProvider> getDetectors();
}
