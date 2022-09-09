package uk.ac.ebi.pride.archive.dataprovider.assay;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
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
 * @author ypriverol on 01/11/2018.
 */
public interface AssayProvider extends EntityProvider {

    /**
     * Get the Type of Assay from AssayType
     * @return Get Assay Type
     */
    AssayType getAssayType();

    /**
     * Get the additional properties for this specific Assay for example number of identified proteins
     * @return Collection Sample properties
     */
    Collection<? extends CvParamProvider> getAdditionalProperties();

}
