package uk.ac.ebi.pride.archive.dataprovider.file;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * {@code ProjectFileTypeConstants} defines a set of accepted project file types
 *
 * @author Yasset Perez-Riverol
 */
public enum ProjectFileTypeConstants implements EntityProvider {

    RESULT(0L, "RESULT", 0), // result files, such as: pride xml, mzIdentML and mzTab
    PEAK(1L, "PEAK", 1),   // peak list files, such as: mgf, pkl
    SEARCH(2L, "SEARCH", 2), // search engine output files, such as: Mascot DAT
    RAW(3L, "RAW", 3),    // mass spec instrument output files, such as: binary raw files
    QUANT(4L, "QUANT", 4), // quantification analysis output files, such as: MaxQuant output
    GEL(5L, "GEL", 5),    // gel image files, such as: PNG, JPEG
    FASTA(6L, "FASTA", 6),  // sequence database
    SPECTRUM_LIBRARY(7L, "SPECTRUM_LIBRARY", 7), // spectra library file
    MS_IMAGE_DATA(8L, "MS_IMAGE_DATA", 8), // MS image data
    OPTICAL_IMAGE(9L, "OPTICAL_IMAGE", 9), // Optical image
    OTHER(10L, "OTHER", 10);  // any other files that are not in the other predefined categories

    private Long id;
    private String name;
    private int sortOrder;

    ProjectFileTypeConstants(Long id, String name, int index) {
        this.name = name;
        this.sortOrder = index;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public static ProjectFileTypeConstants fromString(String fileType) {
        for (ProjectFileTypeConstants type: values()) {
            if (type.toString().equalsIgnoreCase(fileType.trim())) {
                return type;
            }
        }
        return null;
    }

    @Override
    public Long getId() {
        return id;
    }
}
