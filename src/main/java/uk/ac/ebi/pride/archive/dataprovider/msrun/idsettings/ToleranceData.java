package uk.ac.ebi.pride.archive.dataprovider.msrun.idsettings;

import uk.ac.ebi.pride.archive.dataprovider.param.CvParam;

public class ToleranceData {

    private CvParam tolerance;

    private CvParam unit;

    public CvParam getTolerance() {
        return tolerance;
    }

    public void setTolerance(CvParam tolerance) {
        this.tolerance = tolerance;
    }

    public CvParam getUnit() {
        return unit;
    }

    public void setUnit(CvParam unit) {
        this.unit = unit;
    }
}
