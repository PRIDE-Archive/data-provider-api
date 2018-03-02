package uk.ac.ebi.pride.archive.dataprovider.project;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
@Deprecated
public interface ProjectTagProvider extends EntityProvider {

    String getTag();

}
