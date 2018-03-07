package uk.ac.ebi.pride.archive.dataprovider.assay;


import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.user.ContactProvider;


/**
 * {@code AnalysisProvider} Assay store information of a particular Assay Level mainly from mzIdentML and mzTab.
 * An assay is an abstract concept that provides information of the relation between results + samples + msruns and
 * the project.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface AnalysisProvider extends EntityParamGroupProvider {

    /**
     * @return Get project Accession
     */
    Comparable getProjectAccession();

    /**
     * @return get Analysis Provider
     */
    String getAccession();

    /**
     * Title of the Analysis can be used to define the multiple analysis that can be performed in the data. For example, for the default identification analysis
     * we can add:
     *   - Peptide/Protein Identification Analysis
     * @return
     */
    String getTitle();

    /**
     * Short description of the Analysis that was performed on the dataset. For example, this can be used if two analysis are performed for protein identification, this can be used to described the protocol of analysis.
     * @return Description
     */
    String getDescription();

    /**
     * This function return if the analysis was originally provided by the original submitter of the data.
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
