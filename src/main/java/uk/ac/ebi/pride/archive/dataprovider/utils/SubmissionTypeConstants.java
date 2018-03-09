package uk.ac.ebi.pride.archive.dataprovider.utils;

/**
 * {@code SubmissionTypeConstants} defines a set of submission types
 *
 * @author : Yasset Perez-Riverol
 */
public enum SubmissionTypeConstants {

    COMPLETE (0L, "COMPLETE"),
    PARTIAL  (1L, "PARTIAL"),
    RAW      (2L, "RAW"),
    PRIDE    (3L, "PRIDE");

    String name;
    Long id;

    SubmissionTypeConstants(Long id, String name){
        this.name = name;
        this.id = id;
    }

    public static SubmissionTypeConstants fromString(String submissionType) {
        if (submissionType != null) {
            for (SubmissionTypeConstants s : SubmissionTypeConstants.values()) {
                if (s.toString().equalsIgnoreCase(submissionType.trim())) {
                    return s;
                }
            }
        }
        return null;
    }

    /**
     * Return the Id of the SubmissionType in PRIDE
     * @return id
     */

    public Long getId() {
        return id;
    }

    /**
     * Return the name of the Submission Type in PRIDE
     * @return
     */
    public String getName() {
        return name;
    }
}
