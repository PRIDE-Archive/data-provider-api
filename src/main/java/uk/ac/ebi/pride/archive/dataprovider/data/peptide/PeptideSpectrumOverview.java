package uk.ac.ebi.pride.archive.dataprovider.data.peptide;

public class PeptideSpectrumOverview {

    int charge;
    double precursorMass;
    String usi;

    public PeptideSpectrumOverview() {
    }

    public PeptideSpectrumOverview(int charge, double precursorMass, String usi) {
        this.charge = charge;
        this.precursorMass = precursorMass;
        this.usi = usi;
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
}
