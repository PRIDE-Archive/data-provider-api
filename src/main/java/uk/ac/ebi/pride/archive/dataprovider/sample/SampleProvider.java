package uk.ac.ebi.pride.archive.dataprovider.sample;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.msrun.MsRunProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

/**
 * The sample provider is the link between the @{@link GeneralSampleProvider} and the final {@link uk.ac.ebi.pride.archive.dataprovider.msrun.MsRunProvider}. For those links
 * some additional information is needed like the fraction or the technical replicate.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 *
 */
public interface SampleProvider extends GeneralSampleProvider{

    /**
     * Get the labeling information, for label free experiments the label is not needed becuase not labeling has been applied.
     * Labeling is used mainly for multiplex experiments where the same information Sample can be found in the same MSRun (RAW file). Possible value for ITRAQ labeling
     * - [MS, MS:1002626, ITRAQ reagent, ]
     *
     * @return Label
     */
    CvParamProvider getLabeling();

    /**
     * Get the fraction identifier, if not fractionation is applied, the fraction should be only 0 only one fraction.
     * The fraction will be annotated using the CVTerm [MS, MS:1000858, fraction identifier, value ]
     */
    CvParamProvider getFractionNumber();

    /**
     * Get the number of the technical replicate is the experiment. For technical replicate the CVterm that would be used would be
     * [MS, MS:1001808, technical replicate, value]
     * @return
     */
    CvParamProvider getTechnicalReplicateNumber();

    /**
     * The MSRun Provider is used to organize the RAW data from the file. In this case the final MSRun link to the actual sample.
     * For multiplex sample, multiple Sample can make use of the sample MSRun (RAW) file.
     * @return MsRunProvider
     */
    MsRunProvider getMsRunProvider();

}
