package uk.ac.ebi.pride.archive.dataprovider.project;

import uk.ac.ebi.pride.archive.dataprovider.data.peptide.PeptideSequenceProvider;
import uk.ac.ebi.pride.archive.dataprovider.data.protein.ProteinDetailProvider;

import java.util.Collection;
import java.util.Map;

/**
 * The project Identification Provider implements a set of functions that are needed to retrieve the list of
 * Peptides, Proteins for one specific project.
 *
 * @author: Yasset Perez-Riverol
 * @version $Id$
 *
 */
public interface ProjectIdentificationProvider extends ProjectProvider {

    /**
     * Provides a map from accessions to list of protein identifications
     * @return a map from accessions to list of protein identifications. It can be empty if not available.
     */
     Map<String, Collection<ProteinDetailProvider>> getProteinIdentifications();

    /**
     * Provides a set of peptide sequences
     * @return a set of peptide sequences. It can be empty if not available.
     */
    Collection<? extends PeptideSequenceProvider> getPeptideSequences();

}
