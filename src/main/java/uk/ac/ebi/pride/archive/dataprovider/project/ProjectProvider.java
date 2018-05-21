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
public interface ProjectProvider extends AbstractPrideProject {

    /**
     * @return  general sample processing
     */
    String getSampleProcessingProtocol();

    /**
     * @return general testdata protocol
     */
    String getDataProcessingProtocol();

    /**
     * @return List of Instruments used in the dataset
     */
    Collection<? extends String> getInstruments();

    /**
     * DOI of the dataset.
     * //If all the datasets that get a DOI are complete submissions, we should evaluate the idea of moving this method.
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
     * The experimental factors are used in the system to classified which variables are under study in the original project.
     * Different Experimental factors can be used in the analysis sections.
     * @return Experimental Factors for study.
     */
    Collection<? extends String> getExperimentalFactors();

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
