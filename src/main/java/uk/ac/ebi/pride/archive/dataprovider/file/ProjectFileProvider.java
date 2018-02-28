package uk.ac.ebi.pride.archive.dataprovider.file;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.utils.ProjectFileCategoryConstants;
import uk.ac.ebi.pride.archive.dataprovider.utils.ProjectFolderSourceConstants;

import java.net.URI;

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
     * The FileTypeCategory are different categories to group different files in PRIDE. The Constants File Types can be found here {@link ProjectFileCategoryConstants}
     * @return Project File Type
     */
    ProjectFileCategory getFileCategory();

    /**
     * @return The path of the File in the PRIDE File System.
     */
    ProjectFolderSourceConstants getFolderSource();

    /**
     * This return a File Name in an URI format, it can be used to distribute the file using different protocols.
     * @return
     */
    URI getPublicFileLocation();

    /**
     * The file size should be provided in bytes.
     * @return  Get file Size
     */
    long getFileSizeInBytes();


    /**
     * @return Get the file name of the File.
     */
    String getFileName();

    /**
     * @return Get Internal File Path in PRIDE Archive for each dataset.
     */
    String getFilePath();


}
