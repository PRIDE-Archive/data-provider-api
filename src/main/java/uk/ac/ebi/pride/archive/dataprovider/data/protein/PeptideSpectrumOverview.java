package uk.ac.ebi.pride.archive.dataprovider.data.protein;

public class PeptideSpectrumOverview {

    int charge;
    double precursorMass;
    String usi;

    String peptideSequence;

    String modifiedPeptideSequence;

    public PeptideSpectrumOverview() {}

    public PeptideSpectrumOverview(int charge, double precursorMass, String usi, String peptideSequence, String modifiedPeptideSequence) {
        this.charge = charge;
        this.precursorMass = precursorMass;
        this.usi = usi;
        this.peptideSequence = peptideSequence;
        this.modifiedPeptideSequence = modifiedPeptideSequence;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public double getPrecursorMass() {
        return precursorMass;
    }

    public void setPrecursorMass(double precursorMass) {
        this.precursorMass = precursorMass;
    }

    public String getUsi() {
        return usi;
    }

    public void setUsi(String usi) {
        this.usi = usi;
    }

    public String getPeptideSequence() {
        return peptideSequence;
    }

    public void setPeptideSequence(String peptideSequence) {
        this.peptideSequence = peptideSequence;
    }

    public String getModifiedPeptideSequence() {
        return modifiedPeptideSequence;
    }

    public void setModifiedPeptideSequence(String modifiedPeptideSequence) {
        this.modifiedPeptideSequence = modifiedPeptideSequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PeptideSpectrumOverview that = (PeptideSpectrumOverview) o;

        return usi.equals(that.usi);
    }

    @Override
    public int hashCode() {
        return usi.hashCode();
    }
}
