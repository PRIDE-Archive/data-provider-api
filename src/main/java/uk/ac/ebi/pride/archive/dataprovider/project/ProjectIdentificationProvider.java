package uk.ac.ebi.pride.archive.dataprovider.project;

import uk.ac.ebi.pride.archive.dataprovider.identification.PeptideSequenceProvider;
import uk.ac.ebi.pride.archive.dataprovider.identification.ProteinIdentificationProvider;

import java.util.Collection;
import java.util.Map;

/**
 * User: ntoro
 * Date: 09/04/2014
 * Time: 11:11
 */
public interface ProjectIdentificationProvider {

    /**
     * Provides a map from accessions to list of protein identifications
     * @return a map from accessions to list of protein identifications. It can be null if not available.
     */
    public Map<String, Collection<ProteinIdentificationProvider>> getProteinIdentifications();

    /**
     * Provides a set of peptide sequences
     * @return a set of peptide sequences. It can be null if not available.
     */
    public Collection<? extends PeptideSequenceProvider> getPeptideSequences();
}
