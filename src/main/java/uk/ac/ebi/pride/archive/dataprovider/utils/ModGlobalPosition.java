package uk.ac.ebi.pride.archive.dataprovider.utils;

/**
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public enum ModGlobalPosition {

    CTERM, NTERM, PCTERM, PNTERM, NONE;

    /**
     * Convert a String to a Position object.
     *
     * @param s
     * @return
     */
    public static ModGlobalPosition parsePositon(String s) {
        if (s != null) {
            if (s.compareToIgnoreCase("N-Term") == 0) return ModGlobalPosition.NTERM;
            if (s.compareToIgnoreCase("C-Term") == 0) return ModGlobalPosition.CTERM;
            if (s.compareToIgnoreCase("Protein N-term") == 0) return ModGlobalPosition.PNTERM;
            if (s.compareToIgnoreCase("Protein C-Term") == 0) return ModGlobalPosition.PCTERM;
        }
        return ModGlobalPosition.NONE;
    }

}
