package uk.ac.ebi.pride.archive.dataprovider.reference;

import java.io.Serializable;
import java.util.Objects;

/**
 * This code is licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * ==Overview==
 * <p>
 * This class
 * <p>
 * @author ypriverol
 */
public class Reference implements ReferenceProvider, Serializable {

    String referenceLine;

    /** Pubmedd ID **/
    Integer pubmedID;

    /** DOI **/
    private String doi;

    /**
     * DafaultReference crated by our data provider. It can be extended with more information about authors
     *
     * @param referenceLine One line Reference
     * @param pubmedID PubmedID
     * @param doi DOI in case Pubmed is not available.
     */
    public Reference(String referenceLine, Integer pubmedID, String doi) {
        this.referenceLine = referenceLine;
        this.pubmedID = pubmedID;
        this.doi = doi;
    }

    @Override
    public String getReferenceLine() {
        return this.referenceLine;
    }

    @Override
    public int getPubmedId() {
        return this.pubmedID;
    }

    @Override
    public String getDoi() {
        return this.doi;
    }

    @Override
    public Comparable getId() {
        return this.pubmedID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reference reference = (Reference) o;
        return Objects.equals(referenceLine, reference.referenceLine) &&
                Objects.equals(pubmedID, reference.pubmedID) &&
                Objects.equals(doi, reference.doi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referenceLine, pubmedID, doi);
    }
}
