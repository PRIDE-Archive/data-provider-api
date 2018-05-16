package uk.ac.ebi.pride.archive.dataprovider.project;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.utils.SubmissionTypeConstants;

import java.util.*;

/**
 * {@code ProjectProvider} defines an interface for accessing the details of a project.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface ProjectProvider extends EntityParamGroupProvider {

    /**
     * @return project accession
     */
    String getAccession();

    /**
     * @return project tile
     */
    String getTitle();

    /**
     * @return general project description
     */
    String getProjectDescription();

    /**
     * @return  general sample processing
     */
    String getSampleProcessingProtocol();

    /**
     * @return general testdata protocol
     */
    String getDataProcessingProtocol();

    /**
     * This function returns the information of the Submitter.
     * @return Submitter user Contact Information
     */
    Collection<? extends String> getSubmitters();

    /**
     * Get  the information for the Head of the Lab or PI
     * @return Head of the Lab User Profile
     */
    Collection<? extends String> getHeadLab();

    /**
     * Get the list of keywords for one dataset.
     * @return Keywords
     */
    Collection<? extends String> getKeywords();

    /**
     * Tags are provided by internal curators of PRIDE.
     * @return Project Tags
     */
    Collection<? extends String> getProjectTags();

    /**
     * @return General List of PTMs related with the current dataset
     */
    Collection<? extends String> getPtms();

    /**
     * @return List of Instruments used in the dataset
     */
    Collection<? extends String> getInstruments();

    /**
     * @return List of software used in the dataset
     */
    Collection<? extends String> getSoftwares();

    /**
     * @return List of Quantification methods
     */
    Collection<? extends String> getQuantificationMethods();

    /**
     * The list of references related with the current dataset.
     * @return References
     */
    Collection<? extends String> getReferences();

    /**
     * DOI of the dataset.
     * //If all the datasets that get a DOI are complete submissions, we should evaluate the idea of moving this method to {@link ProjectIdentificationProvider}
     * @return DOI
     */
    Optional<String> getDoi();

    /**
     * List of other datasets that are link to this dataset.
     * @return other omics links
     */
    Collection<? extends String> getOtherOmicsLink();

    /**
     * If this method is true the project is Public, if not is Private.
     * @return Public Project
     */
    boolean isPublicProject();

    /**
     * Submission Type is the internal classification PRIDE give to datasets depending on the testdata availability:
     * {@link SubmissionTypeConstants} is used to classified the most used classifications: PRIDE, RAW , COMPLETE, PARTIAL
     * @return submission type
     */
    String getSubmissionType();

    /**
     * @return Submission Date
     */
    Date getSubmissionDate();

    /**
     * @return Publication Date
     */
    Date getPublicationDate();

    /**
     * @return Last Update date.
     */
    Date getUpdateDate();

    /**
     * The experimental factors are used in the system to classified which variables are under study in the original project.
     * Different Experimental factors can be used in the analysis sections.
     * @return Experimental Factors for study.
     */
    Collection<? extends String> getExperimentalFactors();


    /** The following functions are helpers that enable project to retrirve the information related with a project. */

    /**
     * Get the Countries related with a project. This function agrregate the information from the Submitter + Lab Head Countries into
     * a List of Countries. The default implementation of the method agrregates the information at submitter and headLab .
     * @return Countries
     */
    Collection<? extends String> getCountries();


    /**
     * Get the Countries related with a project. This function agrregate the information from the Submitter + Lab Head Countries into
     * a List of Countries. The default implementation of the method agrregates the information at submitter and headLab .
     * @return Countries
     */
    Collection<? extends String> getAllAffiliations();

    /**
     * Sample attributes are captured at the level of the project.
     * @return
     */
    Collection<? extends String> getSampleAttributes();


}
