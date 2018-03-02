package uk.ac.ebi.pride.archive.dataprovider.data;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * The spectrum provider defines the functions that will return an specific Spectrum in PRIDE.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface SpectrumProvider extends EntityParamGroupProvider{

    /**
     * @return the intensity values of one spectrum
     */
    double[] getIntensityValues();

    /**
     * @return the mz values for each peak
     */
    double[] getMzValues();

    /**
     * @return the precursor mz value of the spectrum
     */
    double getPrecursorMz();

    /**
     * @return the original charge of the spectrum
     */
    int getPrecursorCharge();

    /**
     * Get the MS Level of the Spectrum  2, 3, ..
     * @return
     */
    int getMSLevel();

    /**
     * Retrieve true if the spectrum has been identified
     * @return
     */
    boolean isIdentified();

}
