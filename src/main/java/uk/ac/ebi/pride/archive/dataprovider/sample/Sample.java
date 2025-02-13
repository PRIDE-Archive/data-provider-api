package uk.ac.ebi.pride.archive.dataprovider.sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sample {

    /**
     * Sample accession
     */
    String sampleAccession;

    /**
     * Sample properties;
     */
    Collection<?extends  ITuple<? extends CvParamProvider, ? extends CvParamProvider>> properties;

}
