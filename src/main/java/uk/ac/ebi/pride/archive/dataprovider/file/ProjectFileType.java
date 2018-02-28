package uk.ac.ebi.pride.archive.dataprovider.file;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface ProjectFileType extends EntityProvider{

    /**
     * Get the name of the fileType the most common and constant are defined in {@link ProjectFileTypeConstants}
     * @return FileType
     */
    String getFileType();

}
