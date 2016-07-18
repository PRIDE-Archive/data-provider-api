package uk.ac.ebi.pride.archive.dataprovider.assay;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.assay.instrument.InstrumentProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.person.ContactProvider;
import uk.ac.ebi.pride.archive.dataprovider.assay.software.SoftwareProvider;

import java.util.Collection;

/**
 * {@code AssayProvider} defines an interface for accessing assay related details
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface AssayProvider extends ParamGroupProvider, EntityProvider{

    Long getProjectId();

    String getAccession();

    String getTitle();

    String getShortLabel();

    String getExperimentalFactor();

    int getProteinCount();

    int getPeptideCount();

    int getUniquePeptideCount();

    int getIdentifiedSpectrumCount();

    int getTotalSpectrumCount();

    boolean hasMs2Annotation();

    boolean hasChromatogram();

    Collection<? extends CvParamProvider> getSamples();

    Collection<? extends InstrumentProvider> getInstruments();

    Collection<? extends SoftwareProvider> getSoftwares();

    Collection<? extends CvParamProvider> getPtms();

    Collection<? extends CvParamProvider> getQuantificationMethods();

    Collection<? extends ContactProvider> getContacts();

}
