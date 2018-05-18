package uk.ac.ebi.pride.archive.dataprovider.file;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.utils.MSFileTypeConstants;
import uk.ac.ebi.pride.archive.dataprovider.utils.ProjectFileCategoryConstants;
import uk.ac.ebi.pride.archive.dataprovider.utils.ProjectFolderSourceConstants;

import java.net.URI;
import java.util.List;

/**
 * {@code FileProvider} defines an interface for accessing the details of a file in PRIDE project. IT can be a generated file or generated file in PRIDE.
 *
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface FileProvider extends EntityProvider, ParamGroupProvider {

    /**
     * @return Get Project Identifier
     */
    String getAccession();

    /**
     * The FileTypeCategory are different categories to group different files in PRIDE. The Constants File Types can be found here {@link ProjectFileCategoryConstants}
     * @return Project File Type
     */
    CvParamProvider getFileCategory();

    /**
     * @return The path of the File in the PRIDE File System.
     */
    String getFolderSource();

    /**
     * This is the list of public URLs for the File in different protocols The CVTerm is the protocol and the value is the URL.
     * @return public file location
     */
    List<CvParamProvider> getPublicFileLocation();

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
     * @return Get the File Extension
     */
    String getFileExtension();

    /**
     * @return Provide an Md5 for each file
     */
    String getMd5Checksum();

}
