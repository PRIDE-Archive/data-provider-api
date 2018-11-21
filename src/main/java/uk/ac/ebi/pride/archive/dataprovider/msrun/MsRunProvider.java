package uk.ac.ebi.pride.archive.dataprovider.msrun;


import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;

import java.util.Collection;

/**
 * The MSRun Provider describe the RAW file obtained by the user in the experiment.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface MsRunProvider extends ParamGroupProvider{

    /**
     * The file properties store general information if the File. Date of creation.
     * @return List of {@link CvParamProvider}
     */
    Collection<? extends CvParamProvider> getFileProperties();

    /**
     * The instrument properties contains the Model, version, serial of the Instrument
      * @return Collection of {@link CvParamProvider}
     */
    Collection<? extends  CvParamProvider> getInstrumentProperties();

    /**
     * Retrieve the MSData contains general information  about the MSData such as:
     *  - Number of Scans
     *  - RT, mz, charge limits.
     * @return Collection of {@link CvParamProvider}
     */
    Collection<? extends CvParamProvider> getMsData();

    /**
     * This is a more generic implementation of about how to retrieve the {@link CvParamProvider} that are group by an specific property.
     * For example:
     *  Activation Type: HCD
     *  Activation Type: ETD
     *
     * @return return a list of groups of groups of CVParams.
     */
    Collection<? extends CvParamProvider> getScanSettings();

    /**
     * This is a more generic implementation of about how to retrieve the IdSettings.
     * The IdSettings store some metadata about identification protocols realted with the MSRun.
     * The protocol contains the information of the parameters that where used to perform the peptide/protein identification:
     * For example:
     *  Post-Translation modifications divided in two groups Fixed and Variables
     *  Tolerances: Precursor and Fragment Tolerances.
     *  Enzyme. This information is needed to perform peptide digestion in database search.
     *
     * @return return a list of id settings objects.
     */
    Collection<? extends Object> getIdSettings();

}
