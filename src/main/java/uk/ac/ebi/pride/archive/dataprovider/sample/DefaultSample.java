package uk.ac.ebi.pride.archive.dataprovider.sample;

import uk.ac.ebi.pride.archive.dataprovider.common.ITuple;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

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
 * @author ypriverol on 14/02/2019.
 */
public class DefaultSample implements SampleProvider{

    /**
     * Sample accession
     */
    String sampleAccession;

    /**
     * Sample properties;
     */
    Collection<?extends  ITuple<? extends CvParamProvider, ? extends CvParamProvider>> properties;

    /**
     * Parametrized constructor.
     * @param sampleAccession sample accession.
     * @param properties
     */

    public DefaultSample(String sampleAccession, Collection<? extends ITuple< ? extends CvParamProvider, ? extends CvParamProvider>> properties) {
        this.sampleAccession = sampleAccession;
        this.properties = properties;
    }

    @Override
    public Comparable getAccession() {
        return sampleAccession;
    }

    @Override
    public Collection<? extends ITuple<? extends CvParamProvider, ?extends  CvParamProvider>> getSampleProperties() {
        return properties;
    }
}
