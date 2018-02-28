package uk.ac.ebi.pride.archive.dataprovider.identification;

import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

import java.util.Collection;
import java.util.Set;

/**

 @author Yasset Perez-Riverol
 @version $Id$
 */
public interface ProteinDetailProvider extends ProteinReferenceProvider{

    /**
     * Return the mapped UniProt identifier for the corresponding reported protein.
     * @return Uniprot Identifier
     */
    String getUniprotMapping();

    /**
     * Return the mapped ENSEMBL identifier for the corresponding reported protein.
     * @return ENSEMBL Identifier
     */
    String getEnsemblMapping();

    /**
     * Other Identifiers that can be used to map the corresponding reported protein.
     * //Todo: We need to check where this is used, we shouldn't map to more than one protein the actual reported protein. I think this is used to mape gene names.
     * @return protein identifiers.
     */
    Set<String> getOtherMappings();

    /**
     * Submitted sequence for the reported protein.
     * @return Sequence
     */
    String getSubmittedSequence();

    /**
     * Get the sequence in Uniprot for the mapped sequence.
     * @return Protein Sequence
     */
    String getUniprotSequence();

    /**
     * Get the ENSEMBL Protein Sequence.
     * @return
     */
    String getEnsemblSequence();

    /**
     * Get the corresponding properties for the protein. This method is used in the future to store as CVParam the scores related with the identification
     * and other properties.
     *
     * @return
     */
    Collection<? extends CvParamProvider> getProperties();
}
