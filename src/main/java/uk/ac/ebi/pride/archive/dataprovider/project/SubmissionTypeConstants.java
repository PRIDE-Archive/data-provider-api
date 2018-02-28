package uk.ac.ebi.pride.archive.dataprovider.project;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * {@code SubmissionTypeConstants} defines a set of submission types
 *
 * @author : Yasset Perez-Riverol
 */
public enum SubmissionTypeConstants implements EntityProvider {

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


    @Override
    public Long getId() {
        return id;
    }
}
