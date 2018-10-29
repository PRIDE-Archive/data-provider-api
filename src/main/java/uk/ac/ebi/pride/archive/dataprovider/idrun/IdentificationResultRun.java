package uk.ac.ebi.pride.archive.dataprovider.idrun;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.file.FileProvider;
import uk.ac.ebi.pride.archive.dataprovider.msrun.MsRunProvider;
import uk.ac.ebi.pride.archive.dataprovider.msrun.PeakMsRunProvider;
import uk.ac.ebi.pride.archive.dataprovider.common.Tuple;

import java.util.Collection;

/**
  The {@link IdentificationResultRun} stores the information for a result file containing all the information related with peptide/protein identification.

 */
public interface IdentificationResultRun extends EntityParamGroupProvider{

    /**
     * The result provider file containing the peptide/protein information.
     * @return
     */
    FileProvider getResultFileProvider();

    /**
     * List of the {@link MsRunProvider} of all the MSRuns identified
     * in the experiment. This collection helps to store all the peaksList associated with a result file and the corresponding
     * mgf as a result of the conversion.
     * @return list of MSRun
     */
    Collection<? extends Tuple<MsRunProvider, PeakMsRunProvider>> getMSRunList();

    /**
     * Each Result file is converted into an internal mzTab representation in PRIDE ecosystem. With this model we can trace this relation.
     * @return mztabFiles.
     */
    FileProvider getPRIDEInternalMzTabProvider();

    /**
     * @return Get the number of MS2 spectra identified across
     */
    int getTotalSpectrumCount();

    /**
     * @return number of identified proteins
     */
    int getProteinCount();

    /**
     * @return number of identified peptides sequences.
     */
    int getPeptideCount();

    /**
     * The number of unique peptides is the number of unique peptides that map to a unique protein.
     * //Todo: This needs to be checked with ms-testdata-core-api.
     * @return Unique peptide sequences.
     */
    int getUniquePeptideCount();

    /**
     * Number of PSMs in the assay, a PSM is Peptide Spectrum Match, we need to count all of them on each
     * assay.
     * @return PSM count
     */
    int getPSMsCount();


}
