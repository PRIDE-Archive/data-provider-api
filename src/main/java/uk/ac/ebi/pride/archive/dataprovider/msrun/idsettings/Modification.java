package uk.ac.ebi.pride.archive.dataprovider.msrun.idsettings;

import uk.ac.ebi.pride.archive.dataprovider.param.CvParam;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

import java.util.List;

public class Modification {

    private Double massDelta;
    private List<String> residues = null;
    private String composition;
    private String position;
    private CvParamProvider name;

    public Double getMassDelta() {
        return massDelta;
    }

    public void setMassDelta(Double massDelta) {
        this.massDelta = massDelta;
    }

    public List<String> getResidues() {
        return residues;
    }

    public void setResidues(List<String> residues) {
        this.residues = residues;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public CvParamProvider getName() {
        return name;
    }

    public void setName(CvParam name) {
        this.name = name;
    }

}
