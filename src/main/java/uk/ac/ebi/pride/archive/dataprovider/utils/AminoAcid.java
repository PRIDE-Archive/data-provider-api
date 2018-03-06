package uk.ac.ebi.pride.archive.dataprovider.utils;

/**
 * This information is used to track an handle of the amino acids in PRIDE. The are the basic aminoacids not customs amino acids like B, etc.
 *
 */
public enum AminoAcid {
    A("A", "Ala", "Alanine", 71.0779, 71.037114, "C3H5N1O1", new char[]{'X'}, new String[]{"GCT", "GCC", "GCA", "GCG"}),
    R("R", "Arg", "Arginine", 156.1857, 156.101111, "C6H12N4O1", new char[]{'X'}, new String[]{"CGT", "CGC", "CGA", "CGG", "AGA", "AGG"}),
    N("N", "Asn", "Asparagine", 114.1026, 114.042927, "C4H6N2O2", new char[]{'X','B'}, new String[]{"AAT", "AAC"}),
    D("D", "Asp", "Aspartic Acid", 115.0874, 115.026943, "C4H5N1O3", new char[]{'B', 'X'}, new String[]{"GAT", "GAC"}),
    B("B", "Asx", "Asparagine or Aspartic Acid", 114.595, 114.534935, "", new char[]{'X'}, new String[]{}),
    C("C", "Cys", "Cysteine", 103.1429, 103.009185, "C3H5N1O1S1", new char[]{'X'}, new String[]{"TGT", "TGC"}),
    E("E", "Glu", "Glutamic Acid", 129.114, 129.042593, "C5H7N1O3", new char[]{'Z','X'}, new String[]{"GAA", "GAG"}),
    Q("Q", "Gln", "Glutamine", 128.1292, 128.058578, "C5H8N2O2", new char[]{'Z','X'}, new String[]{"CAA", "CAG"}),
    G("G", "Gly", "Glycine", 57.0513, 57.021464, "C2H3N1O1", new char[]{'X'},  new String[] {"GGT", "GGC", "GGA", "GGG"}),
    H("H", "His", "Histidine", 137.1393, 137.058912, "C6H7N3O1", new char[]{'X'}, new String[] {"CAT", "CAC"}),
    K("K", "Lys", "Lysine", 128.1723, 128.094963, "C6H12N2O1", new char[]{'X'}, new String[] {"AAA", "AAG"}),
    I("I", "Ile", "Isoleucine", 113.1576, 113.084064, "C6H11N1O1", new char[]{'J', 'X'}, new String[] {"ATT", "ATC", "ATA"}),
    J("J", "I/L", "Isoleucine or Leucine", 113.15980, 113.08407, "", new char[]{'X'}, new String[]{}),
    L("L", "Leu", "Leucine", 113.1576, 113.084064, "C6H11N1O1", new char[]{'X', 'J'}, new String[] {"TTA", "TTG", "CTT", "CTC", "CTA", "CTG"}),
    M("M", "Met", "Methionine", 131.1961, 131.040485, "C5H9N1O1S1", new char['X'], new String[]{"ATG"}),
    F("F", "Phe", "Phenylalanine", 147.1739, 147.068414, "C9H9N1O1", new char[]{'X'}, new String[]{"TTT", "TTC"}),
    P("P", "Pro", "Proline", 97.1152, 97.052764, "C5H7N1O1", new char[]{'X'}, new String[]{"CCT", "CCC", "CCA", "CCG"}),
    O("O", "Pyl", "Pyrrolysine", 237.1477, 237.1477, "C12H19N3O2", new char[]{'X'}, new String[] {"TAG"}),
    U("U", "Sec", "Selenocysteine",150.0379, 150.95363, "C3H5N1OSe1", new char[]{'X'}, new String[] {"TGA"}),
    S("S", "Ser", "Serine", 87.0773, 87.032028, "C3H5N1O2", new char[]{'X'}, new String[] {"AGT", "AGC"}),
    T("T", "Thr", "Threonine", 101.1039, 101.047679, "C4H7N1O2", new char[]{'X'}, new String[] {"ACT", "ACC", "ACA", "ACG"}),
    W("W", "Trp", "Tryptophan", 186.2099, 186.079313, "C11H10N2O1", new char[]{'X'}, new String[] {"TGG"}),
    Y("Y", "Tyr", "Tyrosine", 163.1733, 163.06332, "C9H9N1O2", new char[]{'X'}, new String[] {"TAT", "TAC"}),
    V("V", "Val", "Valine", 99.1311, 99.068414, "C5H9N1O1", new char[]{'X'}, new String[] {"GTT", "GTC", "GTA", "GTG"}),
    X("X", "Xaa", "X", 110.0, 110.0, "", new char[]{'A', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'Y', 'U', 'O', 'V', 'W'}, new String[]{}),
    Z("Z", "Glx", "Glutamine or Glutamic Acid", 128.6216, 128.5505855, "", new char[]{'X'}, new String[]{}),
    NONE(X.singleLetterCode, X.threeLetterCode, X.name, X.averageMass, X.monoisotopicMass, X.formula,X.substitutions, X.standardGeneticCode);

    /** Single Letter notation for amino acid **/
    private String singleLetterCode;

    /** Three letter code for an amino acid **/
    private String threeLetterCode;

    /** Name of the amino acid **/
    private String name;

    /** Average Mass **/
    private double averageMass;

    /** Mono Isotopic Mass **/
    private double monoisotopicMass;

    /** String formula **/
    private String formula;

    /** Common substitutions for the amino acid. For example A is replaced commonly by X **/
    private char[] substitutions;

    /** Standard Genetic code , combination of three bases that code the amino acid **/
    private String[] standardGeneticCode;

    AminoAcid(String singleLetterCode, String threeLetterCode, String name, double averageMass, double monoisotopicMass, String formula, char[] substitutions, String[] standardGeneticCode) {
        this.singleLetterCode = singleLetterCode;
        this.threeLetterCode = threeLetterCode;
        this.name = name;
        this.averageMass = averageMass;
        this.monoisotopicMass = monoisotopicMass;
        this.formula = formula;
        this.substitutions = substitutions;
        this.standardGeneticCode = standardGeneticCode;
    }

    /**
     * Convert an Amino acids in the one character representation to the AminoAcid
     * representation.
     *
     * @param s
     * @return
     */
    public static AminoAcid parseByAminoAcidCode(String s) {
        for (AminoAcid value: values())
            if(s.equalsIgnoreCase(value.singleLetterCode))
                return value;
        return AminoAcid.NONE;
    }

    /**
     * Convert an Amino acids in the one character representation to the AminoAcid
     * representation.
     *
     * @param s
     * @return
     */
    public static AminoAcid parseByAminoAcidName(String s) {
        for (AminoAcid value: values())
            if(s.equalsIgnoreCase(value.name))
                return value;
        return AminoAcid.NONE;
    }
}
