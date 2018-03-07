package uk.ac.ebi.pride.archive.dataprovider.data.ptm;

import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.utils.AminoAcidConstants;
import uk.ac.ebi.pride.archive.dataprovider.utils.ModGlobalPositionConstants;
import uk.ac.ebi.pride.archive.dataprovider.utils.Tuple;

import java.util.Collection;

/**
 *
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

}
