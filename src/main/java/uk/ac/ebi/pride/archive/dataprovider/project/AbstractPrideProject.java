package uk.ac.ebi.pride.archive.dataprovider.project;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.utils.SubmissionTypeConstants;

import java.util.Collection;
import java.util.Date;

/**
 * This code is licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * ==Overview==
 * <p>
 * This class
 * <p>
 * Created by ypriverol (ypriverol@gmail.com) on 21/05/2018.
 */
public interface AbstractPrideProject  extends EntityParamGroupProvider {

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
    String getDescription();

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
    Collection<? extends Object> getProjectTags();

    /**
     * @return General List of PTMs related with the current dataset
     */
    Collection<? extends Object> getPtms();

    /**
     * @return List of software used in the dataset
     */
    Collection<? extends String> getSoftwares();

    /**
     * @return List of Quantification methods
     */
    Collection<? extends Object> getQuantificationMethods();

    /**
     * The list of references related with the current dataset.
     * @return References
     */
    Collection<? extends Object> getReferences();

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




}
