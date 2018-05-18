package uk.ac.ebi.pride.archive.dataprovider.utils;

import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.DefaultCvParam;

/**
 * {@code ProjectFileCategoryConstants} defines a set of accepted project file types
 *
 * @author Yasset Perez-Riverol
 */
public enum ProjectFileCategoryConstants {

    RESULT(0L, "RESULT", 0, new DefaultCvParam("PRIDE", "PRIDE:1002848", "Result file URI", "RESULT")),    // result files, such as: pride xml, mzIdentML and mzTab

    PEAK(1L, "PEAK", 1, new DefaultCvParam("PRIDE", "PRIDE:0000409", "Peak list file URI", "PEAK")),   // peak list files, such as: mgf, pkl

    /** Search results are results from the corresponding search engine in the native file format. */
    SEARCH(2L, "SEARCH", 2, new DefaultCvParam("PRIDE", "PRIDE:0000408", "Search engine output file URI", "SEARCH")), // search engine output files, such as: Mascot DAT

    /** RAW testdata is the RAW testdata from the original instrument */
    RAW(3L, "RAW", 3, new DefaultCvParam("PRIDE", "PRIDE:0000404", "Associated raw file URI", "RAW")),    // mass spec instrument output files, such as: binary raw files

    /**
     * Quant information is the files from the quantification results, this needs to be defined for example, an mzTab can be RESULTS and int can be
     * Todo: when the term get agregated into PSI-MS this needs to be updated.
     */
    QUANT(4L, "QUANT", 4, new DefaultCvParam("PRIDE", "PRIDE:0000466", "Quantification result file URI", "QUANTIFICATION")), // quantification analysis output files, such as: MaxQuant output

    /** The GEL information */
    GEL(5L, "GEL", 5 ,new DefaultCvParam("PRIDE", "PRIDE:0000449", "Gel image file URI", "Gel")),    // gel image files, such as: PNG, JPEG

    /** FASTA File containing the information of the DB sequence */
    FASTA(6L, "FASTA", 6 ,  new DefaultCvParam("PRIDE", "PRIDE:0000464", "Fasta file URI", "FASTA")),  // sequence database

    /** SPECTRUM Libraries used to perform the testdata in spectral searches */
    SPECTRUM_LIBRARY(7L, "SPECTRUM_LIBRARY", 7, new DefaultCvParam("PRIDE", "PRIDE:0000465", "Spectral Library file URI", "SPECTRUM LIBRARY")), // spectra library file

    /** The image Data for ms image information */
    MS_IMAGE_DATA(8L, "MS_IMAGE_DATA", 8, new DefaultCvParam("PRIDE", "PRIDE:0000467", "MS Image file URI", "IMAGE DATA")), // MS image testdata

    /** Optional IMAGE in the */
    OPTICAL_IMAGE(9L, "OPTICAL_IMAGE", 9, new DefaultCvParam("PRIDE", "PRIDE:0000410", "Other type file URI", "OPTICAL IMAGE")), // Optical image

    /** Other type of information that is not included in the previous classification */
    OTHER(11L, "OTHER", 11, new DefaultCvParam("PRIDE", "PRIDE:0000410", "Other type file URI", "OTHER"));

    private Long id;
    private String name;
    private int sortOrder;
    private CvParamProvider cv;

    /**
     * Default constructor for each ProjectFileCategory
     * @param id the Id of the category
     * @param name name of the category
     * @param index index of the category
     */
    ProjectFileCategoryConstants(Long id, String name, int index, CvParamProvider cv) {
        this.name = name;
        this.sortOrder = index;
        this.id = id;
        this.cv = cv;
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
    public Long getId() {
        return id;
    }

    /**
     * @return the name of the category
     */
    public String getName() {
        return name;
    }

    public CvParamProvider getCv() {
        return cv;
    }

    public void setCv(CvParamProvider cv) {
        this.cv = cv;
    }
}
