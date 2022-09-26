package uk.ac.ebi.pride.archive.dataprovider.data.protein;

import java.util.Collection;
import java.util.Set;

/**

 @author Yasset Perez-Riverol
 @version $Id$
 */
public interface ProteinDetailProvider extends ProteinReferenceProvider {

    /**
     * Get the ptms for the identified protein
     */
    Collection<String> getIdentifiedModifications();

}
