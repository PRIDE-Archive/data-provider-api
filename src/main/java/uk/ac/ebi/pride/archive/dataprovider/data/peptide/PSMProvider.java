package uk.ac.ebi.pride.archive.dataprovider.data.peptide;

import uk.ac.ebi.pride.archive.dataprovider.data.spectra.SpectrumProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamProvider;

import java.util.Collection;

/**
 * A PSM provider contains information about the peptide that has been identified + the reference to the spectra. In addition each PSM contains information
 * about the scores from search engines in the Additional fields.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface PSMProvider extends PeptideSequenceProvider, SpectrumProvider {

    /**
     * PSM scores store the information of all the scores for PSM identification.
     * @return
     */
    Collection<? extends ParamProvider> getScores();

    /**
     * Quality identification method used to validate the peptide identification.
      * @return
     */
    Collection<? extends ParamProvider> getQualityEstimationMethods();

    Boolean isValid();


}
