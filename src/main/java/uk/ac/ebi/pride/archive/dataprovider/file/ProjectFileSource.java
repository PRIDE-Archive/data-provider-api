package uk.ac.ebi.pride.archive.dataprovider.file;

/**
 * {@code ProjectFileSource} defines a set of accepted project file sources or origins
 *
 * @author Jose A. Dianes
 * @version $Id$
 */
public enum ProjectFileSource {
    SUBMITTED("submitted"),
    GENERATED("generated"),
    INTERNAL("internal");

    private String folderName;

    private ProjectFileSource(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderName() {
        return folderName;
    }

    public static ProjectFileSource fromString(String fileSource) {
        for (ProjectFileSource projectFileSource: ProjectFileSource.values()) {
            if (projectFileSource.toString().equalsIgnoreCase(fileSource.trim())) {
                return projectFileSource;
            }
        }

        return null;
    }
}
