package uk.ac.ebi.pride.archive.dataprovider.file;

/**
 * {@code ProjectFileType} defines a set of accepted project file types
 *
 * @author Rui Wang
 */
@SuppressWarnings("unused")
public enum ProjectFileType {
    RESULT("RESULT", 1), // result files, such as: pride xml, mzIdentML
    PEAK("PEAK", 2),   // peak list files, such as: mgf, pkl
    SEARCH("SEARCH", 3), // search engine output files, such as: Mascot DAT
    RAW("RAW", 4),    // mass spec instrument output files, such as: binary raw files
    QUANT("QUANT", 5), // quantification analysis output files, such as: MaxQuant output
    GEL("GEL", 6),    // gel image files, such as: PNG, JPEG
    FASTA("FASTA", 7),  // sequence database
    SPECTRUM_LIBRARY("SPECTRUM_LIBRARY", 8), // spectra library file
    MS_IMAGE_DATA("MS_IMAGE_DATA", 9), // MS image data
    OPTICAL_IMAGE("OPTICAL_IMAGE", 10), // Optical image
    OTHER("OTHER", 11);  // any other files that are not in the other predefined categories

    private String name;
    private int sortOrder;

    private ProjectFileType(String name, int index) {
        this.name = name;
        this.sortOrder = index;
    }

    public String getName() {
        return name;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public static ProjectFileType fromString(String fileType) {
        for (ProjectFileType type: values()) {
            if (type.toString().equalsIgnoreCase(fileType.trim())) {
                return type;
            }
        }
        return null;
    }
}
