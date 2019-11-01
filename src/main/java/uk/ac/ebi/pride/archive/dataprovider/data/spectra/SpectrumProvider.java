package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

import java.util.List;
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
    Set<? extends  CvParamProvider> getProperties();

    /** Retention time or scan start time **/
    Double getRetentionTime();

    /** Get Precursor charge **/
    Integer getPrecursorCharge();

    /** Get Precursor mz value **/
    Double getPrecursorMz();
}
