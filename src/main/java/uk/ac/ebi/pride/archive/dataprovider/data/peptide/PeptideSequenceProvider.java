package uk.ac.ebi.pride.archive.dataprovider.data.peptide;

import uk.ac.ebi.pride.archive.dataprovider.data.ptm.IdentifiedModificationProvider;
import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;

import java.util.Collection;
import java.util.Map;

/**
 * PeptideSequence is an interface to Provide the Peptide Sequence + modifications of the PSMs.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 *
 */
public interface PeptideSequenceProvider extends ParamGroupProvider {

    /**
     * @return return the peptide sequence.
     */
    String getPeptideSequence();

    /**
     * This function provides a way to retrieve all the Peptide Modifications.
     * @return Peptide Modifications.
     */
    Collection<? extends IdentifiedModificationProvider> getModifications();

    /**
     * Get the List of modifications names present in the Peptide.
     * @return Modification Names list.
     */
    Collection<String> getModificationNames();

    /**
     * Return the number of modifications present in the peptide.
     * This only provides the types of modifications present in the peptide.
     * For example: If the peptides has two residues modified with the same
     * modification, then it counts as one modification.
     * @return
     */
    Integer getNumberModifiedSites();

    /** Getter for the missed cleavages */
    Integer getMissedCleavages();

    /** If the Peptide is Decoy **/
    Boolean isDecoy();

}
