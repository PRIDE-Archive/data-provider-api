package uk.ac.ebi.pride.archive.dataprovider.data.peptide;

import uk.ac.ebi.pride.archive.dataprovider.data.spectra.SpectrumProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

import java.util.Collection;

/**
 * A PSM provider contains information about the peptide that has been identified + the reference to the spectra. In addition each PSM contains information
 * about the scores from search engines in the Additional fields.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface PSMProvider extends PeptideSequenceProvider, SpectrumProvider {

    Collection<? extends CvParamProvider> getAttributes();

    Boolean isValid();

    Collection<? extends CvParamProvider> getQualityEstimationMethods();


}
