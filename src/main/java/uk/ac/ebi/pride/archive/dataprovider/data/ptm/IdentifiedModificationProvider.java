package uk.ac.ebi.pride.archive.dataprovider.data.ptm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import uk.ac.ebi.pride.archive.dataprovider.common.Tuple;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;

import java.util.List;

/**
 The modification provider represent an identified PTM in PRIDE Resources. An String modification in PRIDE is represented in multiple ways

 - Modifications can be ambiguous (associated with more than one position) within the same Peptide and have a probability score associated with it. The final modification is the Accession of the modification.
        3[MS,MS:1001876, modification probability, 0.8]|4[MS,MS:1001876,modification probability, 0.2]UNIMOD:13
 - Modifications can be ambiguos but do not have any probability associated with it:
        3|4-UNIMOD:13
 - Modifications can have a corresponding Neutral associted with it reported:
        3-UNIMOD:21|[MS, MS:1001524, fragment neutral loss, 63.998285]

 @author Yasset Perez-Riverol
 @version $Id$

 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = DefaultIdentifiedModification.class, name = "DefaultIdentifiedModification")}
)
public interface IdentifiedModificationProvider extends ParamGroupProvider {

    /**
     * {neutral loss} is optional. Neutral losses are reported as cvParams. Neutral losses MAY be
     * associated  with  certain  modifications.  In  this  case  the  neutral  loss
     * is  reported  after  the modification. A neutral loss has the following structure:
     *  - [MS, MS:1001524, fragment neutral loss, 63.998285]
     * @return neutral loss
     */
    CvParamProvider getNeutralLoss();

    /**
     * Ambiguous positions can be reported by separating the {position} and (optional) {cvParam} by an ‘|’from the next position. Thereby, it is possible to report reliabilities
     * scores probabilities etc. for every potential location.
     * @return Position Map.
     */

    List<Tuple<Integer, List<? extends CvParamProvider>>> getPositionMap();


    /**
     * Get the modification CVTerm
     * @return ModificationProvider
     */
    CvParamProvider getModificationCvTerm();


}
