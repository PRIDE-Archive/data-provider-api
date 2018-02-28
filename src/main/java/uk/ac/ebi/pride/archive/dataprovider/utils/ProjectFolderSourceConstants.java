package uk.ac.ebi.pride.archive.dataprovider.utils;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * {@code ProjectFolderSourceConstants} defines a set of accepted project file sources or origins
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public enum ProjectFolderSourceConstants implements EntityProvider{

    SUBMITTED(0L, "submitted"),
    GENERATED(1L, "generated"),
    INTERNAL( 2L, "internal"),
    ORIGINAL(3L, "original");


    private String folderName;
    private Long id;

    ProjectFolderSourceConstants(Long id, String folderName) {
        this.id = id;
        this.folderName = folderName;
    }

    public String getFolderName() {
        return folderName;
    }

    public static ProjectFolderSourceConstants fromString(String fileSource) {
        for (ProjectFolderSourceConstants projectFileSource: ProjectFolderSourceConstants.values()) {
            if (projectFileSource.toString().equalsIgnoreCase(fileSource.trim())) {
                return projectFileSource;
            }
        }

        return null;
    }


    @Override
    public Long getId() {
        return id;
    }
}
