package uk.ac.ebi.pride.archive.dataprovider.assay.identification;

import uk.ac.ebi.pride.archive.dataprovider.assay.msrun.MsRunProvider;
import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.file.ProjectFileProvider;

import java.util.Collection;

/**
 * The IDResultRun is a file containing the results of the identification of an or multiple MSRun. I the current
 * Setup of PRIDE an IDResultRun can be a PRIDE XML, mzIdentML or an mzTab file.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface IDResultRun extends EntityProvider{

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

}
