package uk.ac.ebi.pride.archive.dataprovider.utils;

import uk.ac.ebi.pride.archive.dataprovider.file.ProjectFileCategory;

/**
 * {@code ProjectFileCategoryConstants} defines a set of accepted project file types
 *
 * @author Yasset Perez-Riverol
 */
public enum ProjectFileCategoryConstants implements ProjectFileCategory {

    RESULT(0L, "RESULT", 0), // result files, such as: pride xml, mzIdentML and mzTab

    PEAK(1L, "PEAK", 1),   // peak list files, such as: mgf, pkl

    /**
     * Search results are results from the corresponding search engine in the native file format.
     */
    SEARCH(2L, "SEARCH", 2), // search engine output files, such as: Mascot DAT

    /**
     * RAW testdata is the RAW testdata from the original instrument
     */
    RAW(3L, "RAW", 3),    // mass spec instrument output files, such as: binary raw files

    /**
     * Quant information is the files from the quantification results, this needs to be defined for example, an mzTab can be RESULTS and int can be
     */
    QUANT(4L, "QUANT", 4), // quantification analysis output files, such as: MaxQuant output

    /**
     * The GEL information
     */
    GEL(5L, "GEL", 5),    // gel image files, such as: PNG, JPEG

    /**
     * FASTA File containing the information of the DB sequences
     */
    FASTA(6L, "FASTA", 6),  // sequence database

    /**
     * SPECTRUM Libraries used to perform the testdata in spectral searches
     */
    SPECTRUM_LIBRARY(7L, "SPECTRUM_LIBRARY", 7), // spectra library file

    /**
     * The image Data for ms image information
     */
    MS_IMAGE_DATA(8L, "MS_IMAGE_DATA", 8), // MS image testdata

    /**
     * Optional IMAGE in the
     */
    OPTICAL_IMAGE(9L, "OPTICAL_IMAGE", 9), // Optical image

    /**
     * Other type of information that is not included in the previous classification
     */
    OTHER(11L, "OTHER", 11);

    private Long id;
    private String name;
    private int sortOrder;

    /**
     * Default constructor for each ProjectFileCategory
     * @param id the Id of the category
     * @param name name of the category
     * @param index index of the category
     */
    ProjectFileCategoryConstants(Long id, String name, int index) {
        this.name = name;
        this.sortOrder = index;
        this.id = id;
    }

    /**
     * @return Order of the Category
     */
    public int getSortOrder() {
        return sortOrder;
    }

    /**
     * This method try to find a category by name in the list of categories
     * @param fileType category name.
     * @return Category
     */
    public static ProjectFileCategoryConstants findCategory(String fileType) {
        for (ProjectFileCategoryConstants type: values()) {
            if (type.toString().equalsIgnoreCase(fileType.trim())) {
                return type;
            }
        }
        return null;
    }

    /**
     * @return the Id of the category
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * @return the name of the category
     */
    @Override
    public String getName() {
        return name;
    }
}
