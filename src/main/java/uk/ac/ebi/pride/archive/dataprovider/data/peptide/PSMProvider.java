package uk.ac.ebi.pride.archive.dataprovider.data.peptide;

/**
 * A PSM provider contains information about the peptide that has been identified + the reference to the spectra. In addition each PSM contains information
 * about the scores from search engines in the Additional fields.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface PSMProvider extends PeptideSequenceProvider{

    /**
     * Reference to the spectra withing PRIDE context. It is important to notice that if this will be used
     * in file, the spectrum can be used in combination such as:
     *
     * - spectrum_file_name:index=1
     *
     *
     * @return reference to spectra.
     */
    String getSpectrumIdentifier();

}
