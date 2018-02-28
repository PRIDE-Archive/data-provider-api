package uk.ac.ebi.pride.archive.dataprovider.assay;

import uk.ac.ebi.pride.archive.dataprovider.assay.instrument.InstrumentProvider;
import uk.ac.ebi.pride.archive.dataprovider.assay.software.SoftwareProvider;
import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.user.ContactProvider;

import java.util.Collection;

/**
 * {@code AssayProvider} Assay store information of a particular Assay Level mainly from mzIdentML and mzTab.
 * Todo:// A major refactoring should be implemented here to enable the annotations in the future.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface AssayProvider extends ParamGroupProvider, EntityProvider {

    /**
     * @return Get project Accession
     */
    Comparable getProjectId();

    /**
     * @return get Assay Accession
     */
    String getAccession();

    /**
     * @return Title of the Assay.
     */
    String getTitle();

    /**
     * @return Short description of the Assay.
     */
    String getDescription();

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
     * @return
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
     * @return
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
     * @return
     */
    Collection<? extends CvParamProvider> getPtms();

    /**
     * Quantification Method used in the Experiment
     * @return
     */
    Collection<? extends CvParamProvider> getQuantificationMethods();

    /**
     * Contacts for the particular assay.
     * @return
     */
    Collection<? extends ContactProvider> getContacts();

}
