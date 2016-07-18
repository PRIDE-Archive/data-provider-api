package uk.ac.ebi.pride.archive.dataprovider.project;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.person.ContactProvider;
import uk.ac.ebi.pride.archive.dataprovider.person.UserProvider;
import uk.ac.ebi.pride.archive.dataprovider.reference.ReferenceProvider;

import java.util.Collection;
import java.util.Date;

/**
 * {@code ProjectProvider} defines an interface for accessing the details of a project
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface ProjectProvider extends ParamGroupProvider, ProjectIdentificationProvider , EntityProvider{

    String getAccession();

    String getDoi();

    String getTitle();

    String getProjectDescription();

    String getSampleProcessingProtocol();

    String getDataProcessingProtocol();

    String getOtherOmicsLink();

    <T extends UserProvider> T getSubmitter();

    Collection<? extends UserProvider> getUsers();

    String getKeywords();

    int getNumAssays();

    String getReanalysis();

    Collection<? extends CvParamProvider> getExperimentTypes();

    SubmissionType getSubmissionType();

    Date getSubmissionDate();

    Date getPublicationDate();

    Date getUpdateDate();

    Collection<? extends ReferenceProvider> getReferences();

    Collection<? extends ProjectTagProvider> getProjectTags();

    Collection<? extends ContactProvider> getLabHeads();

    Collection<? extends CvParamProvider> getPtms();

    Collection<? extends CvParamProvider> getSamples();

    Collection<? extends CvParamProvider> getInstruments();

    Collection<? extends CvParamProvider> getSoftware();

    Collection<? extends CvParamProvider> getQuantificationMethods();

    boolean isPublicProject();
}
