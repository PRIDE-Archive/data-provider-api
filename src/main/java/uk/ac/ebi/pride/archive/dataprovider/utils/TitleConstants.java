package uk.ac.ebi.pride.archive.dataprovider.utils;

/**
 * {@code TitleConstants} defines a set of titles
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public enum TitleConstants {

    UNKNOWN(""),
    Mr("Mr"),
    Ms("Ms"),
    Miss("Miss"),
    Mrs("Mrs"),
    Dr("Dr"),
    Professor("Professor");

    private String title;

    TitleConstants(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static TitleConstants fromString(String title) {
        if (title != null) {
            for (TitleConstants u : TitleConstants.values()) {
                if (u.getTitle().equalsIgnoreCase(title.trim()) || u.getTitle().equalsIgnoreCase(title.trim() + ".")) {
                    return u;
                }
            }
        }
        return TitleConstants.UNKNOWN;
    }
}
