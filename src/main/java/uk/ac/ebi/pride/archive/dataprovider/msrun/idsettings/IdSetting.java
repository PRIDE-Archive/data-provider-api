package uk.ac.ebi.pride.archive.dataprovider.msrun.idsettings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IdSetting implements Serializable {

    String id;

    List<Modification> fixedModifications;

    List<Modification> variableModifications;

    List<Enzyme> enzymes;

    List<ToleranceData> fragmentTolerance;

    List<ToleranceData> parentTolerance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Modification> getFixedModifications() {
        return fixedModifications;
    }

    public void setFixedModifications(List<Modification> fixedModifications) {
        this.fixedModifications = fixedModifications;
    }

    public List<Modification> getVariableModifications() {
        return variableModifications;
    }

    public void setVariableModifications(List<Modification> variableModifications) {
        this.variableModifications = variableModifications;
    }

    public List<Enzyme> getEnzymes() {
        return enzymes;
    }

    public void setEnzymes(List<Enzyme> enzymes) {
        this.enzymes = enzymes;
    }

    public List<ToleranceData> getFragmentTolerance() {
        return fragmentTolerance;
    }

    public void setFragmentTolerance(List<ToleranceData> fragmentTolerance) {
        this.fragmentTolerance = fragmentTolerance;
    }

    public List<ToleranceData> getParentTolerance() {
        return parentTolerance;
    }

    public void setParentTolerance(List<ToleranceData> parentTolerance) {
        this.parentTolerance = parentTolerance;
    }
}
