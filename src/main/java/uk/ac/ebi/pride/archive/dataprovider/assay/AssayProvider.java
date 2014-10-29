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

    public Long getProjectId();

    public String getAccession();

    public String getTitle();

    public String getShortLabel();

    public String getExperimentalFactor();

    public int getProteinCount();

    public int getPeptideCount();

    public int getUniquePeptideCount();

    public int getIdentifiedSpectrumCount();

    public int getTotalSpectrumCount();

    public boolean hasMs2Annotation();

    public boolean hasChromatogram();

    public Collection<? extends CvParamProvider> getSamples();

    public Collection<? extends InstrumentProvider> getInstruments();

    public Collection<? extends SoftwareProvider> getSoftwares();

    public Collection<? extends CvParamProvider> getPtms();

    public Collection<? extends CvParamProvider> getQuantificationMethods();

    public Collection<? extends ContactProvider> getContacts();

}
