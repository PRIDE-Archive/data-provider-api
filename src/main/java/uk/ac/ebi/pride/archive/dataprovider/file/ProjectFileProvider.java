package uk.ac.ebi.pride.archive.dataprovider.file;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * {@code ProjectFileProvider} defines an interface for accessing the details of a project file
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface ProjectFileProvider extends EntityProvider{

    Long getProjectId();

    Long getAssayId();

    ProjectFileType getFileType();

    ProjectFileSource getFileSource();

    long getFileSize();

    String getFileName();

    String getFilePath();

}
