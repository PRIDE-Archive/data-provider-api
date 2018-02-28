package uk.ac.ebi.pride.archive.dataprovider.file;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * {@code ProjectFileProvider} defines an interface for accessing the details of a project file
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface ProjectFileProvider extends EntityProvider {

    /**
     * Get Project Identifier
     * @return
     */
    Comparable getProjectId();

    /**
     * Get Assay Identifier
     * @return
     */
    Comparable getAssayId();

    /**
     * Project File Type
     * @return
     */
    ProjectFileType getFileType();

    ProjectFolderSourceConstants getFileSource();

    long getFileSize();

    String getFileName();

    String getFilePath();

}
