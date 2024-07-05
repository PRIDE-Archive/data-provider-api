package uk.ac.ebi.pride.archive.dataprovider.param;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * CvParam is the default implementation of {@link CvParamProvider}.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvParam implements CvParamProvider, Serializable {

    /** CvLabel is used to name the Ontology for the Ontology Term **/
    private String cvLabel;

    /** Accession of the Ontology Term **/
    private String accession;

    /** Ontology Term Name **/
    private String name;

    /** Value of the Term. For example, the scores in CvTerm, the value of the score is in the value of the CVTerm **/
    private String value;

    /**
     * Create a new {@link CvParamProvider} from original one.
     * @param provider {@link CvParamProvider}
     */
    public CvParam(CvParamProvider provider){
        this.accession = provider.getAccession();
        this.name = provider.getName();
        this.cvLabel = provider.getCvLabel();
        this.value = provider.getValue();
    }

    /**
     * The minimun constructor most contains accession and name of the property.
     * @param accession Accession of the Term
     * @param name Name of the Term
     */
    public CvParam(String accession, String name) {
        this.accession = accession;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CvParam{" +
                "cvLabel='" + cvLabel + '\'' +
                ", accession='" + accession + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CvParam cvParam = (CvParam) o;

        if (!Objects.equals(cvLabel, cvParam.cvLabel)) return false;
        if (!Objects.equals(accession, cvParam.accession)) return false;
        if (!Objects.equals(name, cvParam.name)) return false;
        return Objects.equals(value, cvParam.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvLabel, accession, name, value);
    }
}
