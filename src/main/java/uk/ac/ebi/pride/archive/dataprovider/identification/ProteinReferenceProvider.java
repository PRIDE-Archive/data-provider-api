package uk.ac.ebi.pride.archive.dataprovider.identification;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface ProteinReferenceProvider extends EntityProvider{

    /**
     * Return the accession used by the user / software to report the protein.
     * @return Reported protein accession.
     */
    String getAccession();

    /**
     * Get the name of the protein as reported by the user/software tool
     * @return
     */
    String getName();
}
