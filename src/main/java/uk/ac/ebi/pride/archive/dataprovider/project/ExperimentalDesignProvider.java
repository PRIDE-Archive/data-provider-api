package uk.ac.ebi.pride.archive.dataprovider.project;

import uk.ac.ebi.pride.archive.dataprovider.sample.SampleProvider;
import uk.ac.ebi.pride.archive.dataprovider.common.Tuple;

import java.util.Collection;

/**
 * This code is licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * ==Overview==
 *
 * @author ypriverol on 29/10/2018.
 */
public interface ExperimentalDesignProvider {

    /** Get project accession or Analysis Accession that contains
     * the experimental design.
     * @return Project or Analysis Accession
     */
    String getProjectAccession();

    /**
     * This method retrieve a Map of the original sample information with Accession of the Sample as {@link Comparable} and a list of
     * {@link Tuple} where the Key is the Column CvTerm and the Value is the CvTerm in that Sample.
     *
     * @return Map for the Sample
     */
    Collection<? extends SampleProvider> getSamples();


}
