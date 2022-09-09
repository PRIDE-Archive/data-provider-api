package uk.ac.ebi.pride.archive.dataprovider.param;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Param implements ParamProvider{

    String accession;
    String name;
    String value;

    public Param() {}

    public Param(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Param(String accession, String name, String value) {
        this.accession = accession;
        this.name = name;
        this.value = value;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Param param = (Param) o;

        if (!name.equals(param.name)) return false;
        return Objects.equals(value, param.value);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Param{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
