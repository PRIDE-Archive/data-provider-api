package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

import java.util.List;

/**
 * The spectrum provider defines the functions that will return an specific Spectrum in PRIDE.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface SpectrumProvider {

    /** Unified Spectra Identifier **/
    String getUsi();

    /** Get masses for the Spectrum **/
    double[] getMasses();

    /** Get intensities of the Spectrum **/
    double[] getIntensities();

    /** Get msLevel of the spectrum **/
    int getMsLevel();

    /** Get Additional Metadata **/
    List<? extends CvParamProvider> getProperties();

    /** Mass spectrum capture mode CENTROID or PROFILE **/
    String getMsMode();

    /** Lowest Observed Mz Value **/
    double getLowestObservedMz();

    /** Highest Observed Mz Value **/
    double getHighestObservedMz();

    /** Base Peak Mz **/
    double getBasePeakMz();

    /** Base Peak Intensity **/
    double  getBasePeakInt();

    /** Total ion count **/
    double getTic();

    /** Retention time or scan start time **/
    double getRetentionTime();

    /** Get Precursor charge **/
    int getPrecursorCharge();

    /** Get Precursor mz value **/
    double getPrecursorMz();
}
