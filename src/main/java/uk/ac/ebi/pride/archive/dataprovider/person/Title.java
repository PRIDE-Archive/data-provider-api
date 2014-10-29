package uk.ac.ebi.pride.archive.dataprovider.person;

/**
 * {@code Title} defines a set of titles
 *
 * @author Rui Wang
 * @version $Id$
 */
public enum Title {
    UNKNOWN(""),
    Mr("Mr"),
    Ms("Ms"),
    Miss("Miss"),
    Mrs("Mrs"),
    Dr("Dr"),
    Professor("Professor");

    private String title;

    private Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static Title fromString(String title) {
        if (title != null) {
            for (Title u : Title.values()) {
                if (u.getTitle().equalsIgnoreCase(title.trim()) || u.getTitle().equalsIgnoreCase(title.trim() + ".")) {
                    return u;
                }
            }
        }
        return Title.UNKNOWN;
    }
}
