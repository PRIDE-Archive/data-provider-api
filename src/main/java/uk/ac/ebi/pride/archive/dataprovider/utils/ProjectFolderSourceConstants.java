package uk.ac.ebi.pride.archive.dataprovider.utils;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * {@code ProjectFolderSourceConstants} defines a set of accepted project file sources or origins
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public enum ProjectFolderSourceConstants implements EntityProvider{

    SUBMITTED(0L, "submitted", "SUBMITTED"),
    GENERATED(1L, "generated", "GENERATED"),
    INTERNAL( 2L, "internal",  "INTERNAL"),
    ORIGINAL(3L,  "original",  "ORIGINAL");


    private String type;
    private String folderName;
    private Long id;

    ProjectFolderSourceConstants(Long id, String folderName, String type) {
        this.id = id;
        this.folderName = folderName;
        this.type = type;
    }

    public String getFolderName() {
        return folderName;
    }

    public static ProjectFolderSourceConstants fromTypeString(String type) {
        for (ProjectFolderSourceConstants projectFileSource: ProjectFolderSourceConstants.values()) {
            if (projectFileSource.type.equalsIgnoreCase(type.trim())) {
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
