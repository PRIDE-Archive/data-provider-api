package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import uk.ac.ebi.pride.archive.dataprovider.param.ParamProvider;

import java.util.Set;

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
    Double[] getMasses();

    /** Get intensities of the Spectrum **/
    Double[] getIntensities();

    /** Get msLevel of the spectrum **/
    Integer getMsLevel();

    /** Get Additional Metadata **/
    Set<? extends ParamProvider> getProperties();

    /** Sample Properties are key value pair properties associated with each Spectrum **/
    Set<? extends ParamProvider> getSampleProperties();

    /** Retention time or scan start time **/
    Double getRetentionTime();

    /** Get Precursor charge **/
    Integer getPrecursorCharge();

    /** Get Precursor mz value **/
    Double getPrecursorMz();
}
