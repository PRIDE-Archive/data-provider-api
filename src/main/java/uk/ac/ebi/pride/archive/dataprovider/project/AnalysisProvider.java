package uk.ac.ebi.pride.archive.dataprovider.project;


import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.user.ContactProvider;

import java.util.List;


/**
 * {@code AnalysisProvider} Assay store information of a particular Assay Level mainly from mzIdentML and mzTab.
 * An assay is an abstract concept that provides information of the relation between results + samples + msruns and
 * the project.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface AnalysisProvider extends AbstractPrideProject {

    /**
     * @return Get project Accession
     */
    List<Comparable> getProjectAccessions();

    /**
     * This function return if the analysis was originally provided by the original submitter of the testdata.
     * @return
     */
    boolean isOriginallySubmitted();

    /**
     * This function returns the information of the Submitter of the Analysis. For analysis that are performed by the same submitter, this contact is the same that the provided
     * by the project. For reanalysis, this can be related to who has performed the reanalysis.
     *
     * @return Submitter contact information
     */
    <T extends ContactProvider> T getSubmitter();
}
