package uk.ac.ebi.pride.archive.dataprovider.param;

import java.io.Serializable;

/**
 * DefaultCvParam is the default implementation of {@link CvParamProvider}.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public class DefaultCvParam implements CvParamProvider, Serializable {

    /** CvLabel is used to name the Ontology for the Ontology Term **/
    private String CvLabel;

    /** Accession of the Ontology Term **/
    private String accession;

    /** Ontology Term Name **/
    private String name;

    /** Value of the Term. For example, the scores in CvTerm, the value of the score is in the value of the CVTerm **/
    private String value;

    /**
     * The Default Constructor
     */
    public DefaultCvParam() { }

    /**
     * Create a new {@link CvParamProvider} from original one.
     * @param provider {@link CvParamProvider}
     */
    public DefaultCvParam(CvParamProvider provider){
        this.accession = provider.getAccession();
        this.name = provider.getName();
        this.CvLabel = provider.getCvLabel();
        this.value = provider.getValue();
    }

    /**
     * Default constructor fof the term including all the attributes.
     * @param cvLabel Name of the Ontology
     * @param accession Accession of the Term
     * @param name Name of the Term
     * @param value Value of the Term.
     */
    public DefaultCvParam(String cvLabel, String accession, String name, String value) {
        CvLabel = cvLabel;
        this.accession = accession;
        this.name = name;
        this.value = value;
    }

    /**
     * The minimun constructor most contains accession and name of the property.
     * @param accession Accession of the Term
     * @param name Name of the Term
     */
    public DefaultCvParam(String accession, String name) {
        this.accession = accession;
        this.name = name;
    }

    @Override
    public String getCvLabel() {
        return CvLabel;
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
        return "DefaultCvParam{" +
                "CvLabel='" + CvLabel + '\'' +
                ", accession='" + accession + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
