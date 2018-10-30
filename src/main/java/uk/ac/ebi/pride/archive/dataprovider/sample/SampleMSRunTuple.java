package uk.ac.ebi.pride.archive.dataprovider.sample;

import uk.ac.ebi.pride.archive.dataprovider.common.ITuple;
import uk.ac.ebi.pride.archive.dataprovider.msrun.MsRunProvider;
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
 * @author ypriverol on 29/10/2018.
 */
public interface  SampleMSRunTuple extends ITuple {

    /**
     * Accession of the {@link uk.ac.ebi.pride.archive.dataprovider.sample.SampleProvider}.
     * @return SampleProvider accession
     */
    @Override
    Comparable getKey();

    /**
     * Get the Accession of the {@link uk.ac.ebi.pride.archive.dataprovider.msrun.MsRunProvider} for the Tuple.
     * @return Accession of the Tuple for the relation.
     */
    @Override
    Comparable getValue();

    /**
     * Get the labeling information, for label free experiments the label is not needed becuase not labeling has been applied.
     * Labeling is used mainly for multiplex experiments where the same information Sample can be found in the same MSRun (RAW file). Possible value for ITRAQ labeling
     * - [MS, MS:1002626, ITRAQ reagent, ]
     *
     * @return Label
     */
    CvParamProvider getSampleLabel();

    /**
     * Get the fraction identifier, if not fractionation is applied, the fraction should be only 0 only one fraction.
     * The fraction will be annotated using the CVTerm [MS, MS:1000858, fraction identifier, value ]
     */
    CvParamProvider getFractionIdentifier();

    /**
     * Get the number of the technical replicate is the experiment. For technical replicate the CVterm that would be used would be
     * [MS, MS:1001808, technical replicate, value]
     * @return
     */
    CvParamProvider getTechnicalReplicateIdentifier();

    /**
     * Get additional Properties fpr the relation.
     * @return Collection of Additional Properties.
     */
    Collection<? extends ITuple<? extends CvParamProvider, ? extends CvParamProvider>> getAdditionalProperties();
}
