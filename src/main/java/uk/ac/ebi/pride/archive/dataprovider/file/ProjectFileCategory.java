package uk.ac.ebi.pride.archive.dataprovider.file;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.utils.ProjectFileCategoryConstants;

/**
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface ProjectFileCategory extends EntityProvider{

    /**
     * Get the name of the fileType the most common and constant are defined in {@link ProjectFileCategoryConstants}
     * @return FileType
     */
    String getName();

}
