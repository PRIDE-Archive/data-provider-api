package uk.ac.ebi.pride.archive.dataprovider.data.ptms;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.utils.AminoAcid;
import uk.ac.ebi.pride.archive.dataprovider.utils.ModGlobalPosition;
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
     * Return the List of AminoAcid Specificity.
     * @return
     */
    Collection<Tuple<AminoAcid, ModGlobalPosition>> getSpecificityCollection();

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
}
