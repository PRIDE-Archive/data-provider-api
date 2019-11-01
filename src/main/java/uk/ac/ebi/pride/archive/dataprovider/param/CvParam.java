package uk.ac.ebi.pride.archive.dataprovider.param;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

/**
 * CvParam is the default implementation of {@link CvParamProvider}.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
@JsonIgnoreProperties(ignoreUnknown = true)
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
     * The Default Constructor
     */
    public CvParam() { }

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
     * Default constructor fof the term including all the attributes.
     * @param cvLabel Name of the Ontology
     * @param accession Accession of the Term
     * @param name Name of the Term
     * @param value Value of the Term.
     */
    public CvParam(String cvLabel, String accession, String name, String value) {
        this.cvLabel = cvLabel;
        this.accession = accession;
        this.name = name;
        this.value = value;
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
    public String getCvLabel() {
        return cvLabel;
    }

    @Override
    public String getAccession() {
        return accession;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
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

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CvParam cvParam = (CvParam) o;

        if (cvLabel != null ? !cvLabel.equals(cvParam.cvLabel) : cvParam.cvLabel != null) return false;
        if (accession != null ? !accession.equals(cvParam.accession) : cvParam.accession != null) return false;
        if (name != null ? !name.equals(cvParam.name) : cvParam.name != null) return false;
        return value != null ? value.equals(cvParam.value) : cvParam.value == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvLabel, accession, name, value);
    }
}
