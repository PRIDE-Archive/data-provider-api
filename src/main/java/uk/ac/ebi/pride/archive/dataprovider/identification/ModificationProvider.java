package uk.ac.ebi.pride.archive.dataprovider.identification;

import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

import java.util.Map;

/**
 * User: ntoro
 * Date: 02/07/2014
 * Time: 14:59
 */
public interface ModificationProvider {

    String getAccession();

    String getName();

    Integer getMainPosition();

    CvParamProvider getNeutralLoss();

    Map<Integer, CvParamProvider> getPositionMap();

}
