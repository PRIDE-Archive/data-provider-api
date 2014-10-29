package uk.ac.ebi.pride.archive.dataprovider.project;

/**
 * {@code SubmissionType} defines a set of submission types
 *
 * @author : Dani Rios
 */
public enum SubmissionType {
    COMPLETE,
    PARTIAL,
    RAW,
    PRIDE;


    public static SubmissionType fromString(String submissionType) {
        if (submissionType != null) {
            for (SubmissionType s : SubmissionType.values()) {
                if (s.toString().equalsIgnoreCase(submissionType.trim())) {
                    return s;
                }
            }
        }
        return null;
    }

}
