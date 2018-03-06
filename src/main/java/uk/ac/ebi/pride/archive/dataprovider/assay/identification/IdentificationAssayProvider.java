package uk.ac.ebi.pride.archive.dataprovider.assay.identification;

import uk.ac.ebi.pride.archive.dataprovider.assay.AssayProvider;
import uk.ac.ebi.pride.archive.dataprovider.assay.instrument.InstrumentProvider;
import uk.ac.ebi.pride.archive.dataprovider.msrun.MsRunProvider;
import uk.ac.ebi.pride.archive.dataprovider.assay.software.SoftwareProvider;
import uk.ac.ebi.pride.archive.dataprovider.file.ProjectFileProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.user.ContactProvider;

import java.util.Collection;

/**
 * The IdentificationAssayProvider is an Identification Assay containing the results of the identification of an or multiple MSRun. I the current
 * Setup of PRIDE an IdentificationAssayProvider can be a PRIDE XML, mzIdentML or an mzTab file.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface IdentificationAssayProvider extends AssayProvider{

    /**
     * Some of the Identification files contains an accession provided
     * by the old PRIDE implementation that would be important to preserve.
     * Those accessions where used in previous publications.
     * @return Old PRIDE Assay Accession
     */
    String getOldPRIDEAssayAccession();

    /**
     * @return return the Identification Result File
     */
    ProjectFileProvider getIdentificationResultFile();

    /**
     * List of the {@link MsRunProvider} of all the MSRuns identified
     * in the experiment.
     * @return list of MSRun
     */
    Collection<? extends MsRunProvider> getMSRunList();

    /**
     * @return number of identified proteins
     */
    int getProteinCount();

    /**
     * @return number of identified peptides sequences.
     */
    int getPeptideCount();

    /**
     * The number of unique peptides is the number of unique peptides that map to a unique protein.
     * //Todo: This needs to be checked with ms-data-core-api.
     * @return Unique peptide sequences.
     */
    int getUniquePeptideCount();

    /**
     * Number of PSMs in the assay, a PSM is Peptide Spectrum Match, we need to count all of them on each
     * assay.
     * @return PSM count
     */
    int getPSMsCount();

    /**
     * @return Get the number of MS2 spectra
     */
    int getTotalSpectrumCount();

    boolean hasMs2Annotation();

    /**
     * Get the information around the samples.
     * //Todo: This should be leave empty until the Experimental design is implemented.
     * @return Sample information
     */
    Collection<? extends CvParamProvider> getSamples();

    /**
     * @return List of instruments used.
     */
    Collection<? extends InstrumentProvider> getInstruments();

    /**
     * @return List of Softwares used in the Experiment.
     */
    Collection<? extends SoftwareProvider> getSoftwares();

    /**
     * Identified PTMs in the particular Assay.
     * @return PTM information
     */
    Collection<? extends CvParamProvider> getPtms();

    /**
     * Quantification Method used in the Experiment
     * @return Quantification method
     */
    Collection<? extends CvParamProvider> getQuantificationMethods();

    /**
     * Contacts for the particular assay.
     * @return contacts
     */
    Collection<? extends ContactProvider> getContacts();

}
