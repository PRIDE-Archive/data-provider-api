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

    /** Retention time or scan start time **/
    double getRetentionTime();

    /** Get Precursor charge **/
    int getPrecursorCharge();

    /** Get Precursor mz value **/
    double getPrecursorMz();
}
