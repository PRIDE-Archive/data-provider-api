package uk.ac.ebi.pride.archive.dataprovider.utils;

import uk.ac.ebi.pride.archive.dataprovider.file.MSFileType;
import uk.ac.ebi.pride.archive.dataprovider.file.ProjectFileCategory;

/**
 * File formats well-known in PRIDE. This filetypes are the Constants values in PRIDE ecosystem.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
*/
public enum MSFileTypeConstants implements MSFileType{

    /** RAW files are defined by the RAW extension */
    RAW(0L, "RAW", new String[]{"RAW", "raw"}, ProjectFileCategoryConstants.RAW),

    /** RAW testdata from AB Sciex Instruments */
    ABI_WIFF(1L, "WIFF", new String[]{"wiff"}, ProjectFileCategoryConstants.RAW),

    /** RAW testdata from ABI Sciex instruments */
    ABI_MTD(2L, "MTD", new String[]{"mtd"}, ProjectFileCategoryConstants.RAW),

    /** RAW testdata from ABI Sciex instruments */
    ABI_SCAN(3L, "SCAN", new String[]{"scan"}, ProjectFileCategoryConstants.RAW),

    /** Bruker RAW Files */
    BRUKER_BAF(4L, "BAF", new String[]{"baf"}, ProjectFileCategoryConstants.RAW),

    /** Bruker RAW Files */
    BRUKER_FID(5L, "FID", new String[]{"fid"}, ProjectFileCategoryConstants.RAW),

    /** Bruker RAW Files */
    BRUKER_YEP(6L, "YEP", new String[]{"yep"}, ProjectFileCategoryConstants.RAW),

    /** RAW testdata file from pkx files */
    VEMS_PKX(7L, "PKX", new String[]{"pkx"} , ProjectFileCategoryConstants.RAW),

    /** Agilent RAW File */
    AGILENT_MASSHUNTER_RAW(8L, "D", new String[]{"d"}, ProjectFileCategoryConstants.RAW),

    /** IBD File format RAW */
    IBD(10L, "IBD", new String[]{"ibd"}, ProjectFileCategoryConstants.RAW),

    /** IMG file format RAW file format */
    IMG(11L, "IMG", new String[]{"img"}, ProjectFileCategoryConstants.RAW),

    /** MGF is a peakList file from Mascot that contains spectrum */
    MGF(12L, "MGF", new String[]{"mgf","MGF"}, ProjectFileCategoryConstants.PEAK),

    /** MS2 File formats for Sequest */
    MS2(13L, "MS2", new String[]{"ms2"}, ProjectFileCategoryConstants.PEAK),

    /** PEAKS Lists created by PRIDE */
    MZDATA(14L, "MZDATA", new String[]{"mzdata"}, ProjectFileCategoryConstants.PEAK),

    /** PEAKS Lists created by the TPP team */
    MZXML(15L, "MZXML", new String[]{"mzxml"} , ProjectFileCategoryConstants.PEAK),

    /** MZML is a file format from PSI that contains */
    MZML(16L, "MZML", new String[]{"mzml"}, ProjectFileCategoryConstants.PEAK),

    /** Sequest dta file for peak lists */
    SEQUEST_DTA(17L, "DTA", new String[]{"dta", "txt"}, ProjectFileCategoryConstants.PEAK),

    /** Peak list file used by multiple search engines */
    PKL(18L, "PKL", new String[]{"pkl"}, ProjectFileCategoryConstants.PEAK),

    /** DAT if the Mascot testdata format for testdata results. */
    DAT(19L, "DAT", new String[]{"dat"}, ProjectFileCategoryConstants.SEARCH),

    /** XML is used by Xtandem for the output */
    XTANDEM(20L, "XML", new String[]{"xml"}, ProjectFileCategoryConstants.SEARCH),

    /** Sequest search results output */
    SEQUEST_OUT(21L, "OUT", new String[]{"out"} ,ProjectFileCategoryConstants.SEARCH),

    /** OMSSA Results File */
    OMSSA_OMX(22L, "OMX", new String[]{"omx"}, ProjectFileCategoryConstants.SEARCH),

    /** MSGF File output */
    MSGF(23L, "MSGF", new String[]{"msgf"},  ProjectFileCategoryConstants.SEARCH),

    /** Proteome Discover output */
    PROTEOME_DISCOVERER(24L, "MSF", new String[]{"msf"}, ProjectFileCategoryConstants.SEARCH),

    /** CRUX Search Engine results **/
    CRUX(25L, "TXT", new String[]{"txt"}, ProjectFileCategoryConstants.SEARCH),

    /** PEPXML PEptide Results from TPP **/
    PEPTIDE_PROPHET(26L, "PEPXML", new String[]{"pepxml"}, ProjectFileCategoryConstants.SEARCH),

    /** Proteins results from TPP **/
    PROTEIN_PROPHET(27L, "PROTXML", new String[]{"protxml"}, ProjectFileCategoryConstants.SEARCH),

    /** Protein Pilot results **/
    PROTEIN_PILOT(28L, "GROUP", new String[]{"group"}, ProjectFileCategoryConstants.SEARCH),

    /** SPECTRAST Results **/
    SPECTRAST(29L, "XLS", new String[]{"xls"}, ProjectFileCategoryConstants.SEARCH),

    /* MZIDENTML is a file format that contains the results information of testdata */
    MZIDENTML(30L, "MZID",new String[]{"mzid"}, ProjectFileCategoryConstants.RESULT),

    /** PRIDE XML is a file format that contains the results information of testdata */
    PRIDE(31L, "XML", new String[]{"xml"}, ProjectFileCategoryConstants.RESULT),

    /** MZTAB is a file format that can contains RESULT or Quantification Data. */
    MZTAB(32L, "MZTAB", new String[]{"mztab"},ProjectFileCategoryConstants.RESULT),

    /** MS Imaging testdata **/
    IMZML(33L, "IMZML", new String[]{"imzml"}, ProjectFileCategoryConstants.MS_IMAGE_DATA),

    /** MS Imaging testdata **/
    HDR(34L, "HDR", new String[]{"hdr"}, ProjectFileCategoryConstants.MS_IMAGE_DATA),

    /** TIFF File with GEL **/
    TIF(35L, "TIF", new String[]{"tif"}, ProjectFileCategoryConstants.GEL),

    /** GEL IMAGE **/
    GIF(36L, "GIF", new String[]{"gif"}, ProjectFileCategoryConstants.GEL),

    /** GEL IMAGE **/
    PNG(37L, "PNG", new String[]{"png"}, ProjectFileCategoryConstants.GEL),

    /** GEL IMAGE **/
    JPG(38L, "JPG", new String[]{"jpg"}, ProjectFileCategoryConstants.GEL),

    /** Results from Search Engines */
    PKL_SPO(39L, "SPO", new String[]{"spo"}, ProjectFileCategoryConstants.SEARCH);

    /**
     * The Identifier of the MSFileType
     */
    private Long id;

    /**
     * The Name of the Identifier
     */
    private String name;

    /** A list of synonyms that */
    private String[] synonyms;

    private ProjectFileCategory fileType;

    MSFileTypeConstants(Long id, String name, String[] synonyms, ProjectFileCategory fileType) {
        this.id = id;
        this.name = name;
        this.synonyms = synonyms;
        this.fileType = fileType;
    }

    /**
     * This method try to find a filetype by name in the list of categories
     * @param fileType category name.
     * @return Category
     */
    public static MSFileTypeConstants findCategory(String fileType) {
        for (MSFileTypeConstants type: values()) {
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


    @Override
    public String getName() {
        return name;
    }

    public String[] getSynonyms() {
        return synonyms;
    }

    public ProjectFileCategory getFileType() {
        return fileType;
    }
}
