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

    public String getAccession();

    public String getDoi();

    public String getTitle();

    public String getProjectDescription();

    public String getSampleProcessingProtocol();

    public String getDataProcessingProtocol();

    public String getOtherOmicsLink();

    public <T extends UserProvider> T getSubmitter();

    public Collection<? extends UserProvider> getUsers();

    public String getKeywords();

    public int getNumAssays();

    public String getReanalysis();

    public Collection<? extends CvParamProvider> getExperimentTypes();

    public SubmissionType getSubmissionType();

    public Date getSubmissionDate();

    public Date getPublicationDate();

    public Date getUpdateDate();

    public Collection<? extends ReferenceProvider> getReferences();

    public Collection<? extends ProjectTagProvider> getProjectTags();

    public Collection<? extends ContactProvider> getLabHeads();

    public Collection<? extends CvParamProvider> getPtms();

    public Collection<? extends CvParamProvider> getSamples();

    public Collection<? extends CvParamProvider> getInstruments();

    public Collection<? extends CvParamProvider> getSoftware();

    public Collection<? extends CvParamProvider> getQuantificationMethods();

    public boolean isPublicProject();
}
