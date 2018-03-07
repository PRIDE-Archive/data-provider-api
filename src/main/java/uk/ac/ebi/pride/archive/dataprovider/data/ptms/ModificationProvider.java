package uk.ac.ebi.pride.archive.dataprovider.data.ptms;

import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.utils.AminoAcidConstants;
import uk.ac.ebi.pride.archive.dataprovider.utils.ModGlobalPositionConstants;
import uk.ac.ebi.pride.archive.dataprovider.utils.Tuple;

import java.util.Collection;

/**
 * The modification Provider is an Abstract modification in PRIDE that handle a generic modification that hasn't been assigned.
 * This modification can be and artefactual modification or biologically relevant modification.
 *
 */
public interface ModificationProvider extends CvParamProvider{

    /**
     * Return the accession of a PTM. All the PTMs will be described
     * by one unique accession (UNIMOD, PSI-MOD) or delt mass CHEMOD
     * @return Accession
     */
    @Override
    String getAccession();


    /**
     * Returns the delta MonoIsotopic mass of the modification. From unimod or PSI mod.
     * @return
     */
    double getMonoDeltaMass();

    /**
     * Returns the delta Average mass of the modification.
     * @return
     */
    Double getAveDeltaMass();

    /**
     * Return the List of AminoAcidConstants Specificity.
     * @return
     */
    Collection<Tuple<AminoAcidConstants, ModGlobalPositionConstants>> getSpecificityCollection();

    /**
     * Return the Chemical Formula of the modification
     * @return
     */
    String getFormula();

    /**
     * The shortname is used for some tools to classify an acronism of a modification
     *
     * @return
     */
    String getShortName();

    /**
     * This information is needed to some pipelines in PRIDE to define what is a biologically relevant modification. In PRIDE mod
     * we have defined as relevant modification.
     * @return
     */
    boolean isBiologicallyRelevant();

    /**
     * {position} Terminal modifications  in  proteins  and  peptides  MUST  be  reported  with  the  position  set  to  0  (Nterminal)  or  the  amino  acid  length  +1  (Cterminal)  respectively.
     * N-terminal  modifications  that are specifically on one amino acid MUST still be reported at the position 0. This object allows modifications to be assigned to ambiguous locations.
     * @return get Main Modification.
     */

    ModGlobalPositionConstants getMainPosition();



}
