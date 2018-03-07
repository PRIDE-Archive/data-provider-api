package uk.ac.ebi.pride.archive.dataprovider.utils;

/**
 * Mod global modification handle the position where mainly the modification modified the amino acid sequence:
 * - {@link ModGlobalPositionConstants} CTERM is when the modification affect the C-Term Position (Peptide / Protein level )
 * - {@link ModGlobalPositionConstants} NTERM is when the modification affect the N-term Position (Peptide / Protein level )
 * - {@link ModGlobalPositionConstants} PNTERM is when its affect the Protein N-Term of the Protein (Protein Only )
 * - {@link ModGlobalPositionConstants} PCTERM is when its affects the Protein C-Term of the Protein (Protein Only )
 * - {@link ModGlobalPositionConstants} NONE the modification is not restricted to any position in the aminoacid position.

 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public enum ModGlobalPositionConstants {

    CTERM, NTERM, PCTERM,  PNTERM,  NONE;

    /**
     * Convert an String position to a
     *
     * @param s
     * @return
     */

    public static ModGlobalPositionConstants parsePositon(String s) {
        if (s != null) {
            if (s.compareToIgnoreCase("N-Term") == 0) return ModGlobalPositionConstants.NTERM;
            if (s.compareToIgnoreCase("C-Term") == 0) return ModGlobalPositionConstants.CTERM;
            if (s.compareToIgnoreCase("Protein N-term") == 0) return ModGlobalPositionConstants.PNTERM;
            if (s.compareToIgnoreCase("Protein C-Term") == 0) return ModGlobalPositionConstants.PCTERM;
        }
        return ModGlobalPositionConstants.NONE;
    }

}
