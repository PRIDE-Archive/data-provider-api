package uk.ac.ebi.pride.archive.dataprovider.msrun;


import uk.ac.ebi.pride.archive.dataprovider.data.ptm.GlobalModificationProvider;
import uk.ac.ebi.pride.archive.dataprovider.file.FileProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.utils.Tuple;

import java.util.Collection;
import java.util.Map;

/**
 * The MSRun Provider describe the RAW file obtained by the user in the experiment.
 * The MSRun is a concept and the testdata associated with it but not the file.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface MsRunProvider extends ParamGroupProvider{

    /**
     * Get the Project Accession related with the following MSRun.
     * @return PX Accession
     */
    String getProjectAccession();

    /**
     * Each MSRun is associated with only one RAW File in the Experiment.
     * This value can be null for datasets where no raw testdata is provided.
     *
     * @return Project File.
     */
    FileProvider getRAWFile();

    /**
     * Get the instrument that was use to capture the following RAW file. If more information is needed at the level
     * of the Instrument, the corresponding Analyzer, etc. This can be done using the Params.
     * @return Return the instrument for an MSRun.
     */
    CvParamProvider getInstrument();

    /**
     * This is a more generic implementation of about how to retrieve the CVparams that are group by an specific property.
     * For example:
     * Scan Event Details 1 :
          Activation Type: HCD
     * Scan Event Details 2:
     *   Activation Type: ETD
     *
     * @return return a list of groups of groups of CVParams.
     */
    Map<CvParamProvider, Collection<? extends CvParamProvider>> getRunCollectionGroupParams();


    /**
     * The attributes at the level of the MSRun are the realted with the way the RAW has been acquired. For example for of the attributes can be storage here are the following.
     *   - <cvParam cvRef="MS" accession="MS:1000580" name="MSn spectrum" value=""/> Label of MS Level in the RAW testdata
     *   - <cvParam cvRef="MS" accession="MS:1000130" name="positive scan" value=""/> Type of the scan positive or negative .
     * This can be used to store more general information around each MSRun.
     *
     * @return additional information for the MSRun
     */
    @Override
    Collection<? extends String> getAdditionalAttributesStrings();

    /**
     * For some file we should be great to store the actual precursor mass tolerance. Because the mass can be done in multiple units, we have selected to represent this as a tuple
     * where the Key is the measure unit and the Value of the tuple is the actual value of the error.
     * @return precursor mass
     */
    Tuple<CvParamProvider, Double> getPrecursorMassTolerance();


    /**
     * For some file we should be great to store the actual fragment mass tolerance. Because the mass can be done in multiple units, we have selected to reprecent this as a tuple
     * where the Key is the measure unit and the Value of the tuple is the actual value of the error.
     * @return precursor mass
     */
    Tuple<CvParamProvider, Double> getFragmentMassTolerance();

    /**
     * The Original Fixed Ptms as declared by the user or PRIDE pipelines. This PTMS should be as much independent as possible from the
     * analysis performed. The PTMs can also included the
     *
     * @return Fixed PTMs
     */
    Collection<? extends GlobalModificationProvider> getOriginalFixedPTMs();
}
