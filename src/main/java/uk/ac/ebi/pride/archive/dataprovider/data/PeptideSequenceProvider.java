package uk.ac.ebi.pride.archive.dataprovider.data;

import uk.ac.ebi.pride.archive.dataprovider.data.ModificationProvider;
import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

import java.util.Collection;

/**
 * PeptideSequence is an interface to Provide the Peptide Sequence + modifications of the PSMs.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 *
 */
public interface PeptideSequenceProvider extends EntityProvider{

    /**
     * @return return the peptide sequence.
     */
    String getPeptideSequence();

    /**
     * This function provides a way to retrieve all the Peptide Modifications.
     * @return Peptide Modifications.
     */
    Collection<? extends ModificationProvider> getPTMs();

    /**
     * Get the List of modifications names present in the Peptide.
     * @return Modification Names list.
     */
    Collection<String> getModificationNames();
}
