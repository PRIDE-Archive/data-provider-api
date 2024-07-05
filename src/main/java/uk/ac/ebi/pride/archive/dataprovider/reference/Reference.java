package uk.ac.ebi.pride.archive.dataprovider.reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reference implements Serializable {

    String referenceLine;

    /** Pubmedd ID **/
    Integer pubmedID;

    /** DOI **/
    private String doi;

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
