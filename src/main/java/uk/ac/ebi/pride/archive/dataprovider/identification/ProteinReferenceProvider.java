package uk.ac.ebi.pride.archive.dataprovider.identification;

import java.util.Set;

/**
 * @author Jose A. Dianes
 * @version $Id$
 */
public interface ProteinReferenceProvider {
    String getAccession();
    String getUniprotMapping();
    String getEnsemblMapping();
    Set<String> getOtherMappings();
    String getSubmittedSequence();
    String getInferredSequence();
}
