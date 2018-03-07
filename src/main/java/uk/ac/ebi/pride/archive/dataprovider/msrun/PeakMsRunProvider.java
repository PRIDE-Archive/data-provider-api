package uk.ac.ebi.pride.archive.dataprovider.msrun;

import uk.ac.ebi.pride.archive.dataprovider.file.FileProvider;

/**
 * The {@link PeakMsRunProvider} handle the information of a peak list file including all the spectra related with it.
 *
 */
public interface PeakMsRunProvider extends MsRunProvider{

    /**
     * @return  Get the list of Peak List files
     */
    FileProvider getPeakList();

    /**
     * It is important to retrieve the number of MS2 Spectra from
     * the each MSRun. Because they are the one used for identification.
     * @return Number of MS2
     */
    int getNumberOfMS2Spectra();
}
