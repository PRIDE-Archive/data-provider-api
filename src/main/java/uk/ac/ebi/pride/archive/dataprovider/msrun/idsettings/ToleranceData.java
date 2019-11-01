package uk.ac.ebi.pride.archive.dataprovider.msrun.idsettings;

import uk.ac.ebi.pride.archive.dataprovider.param.DefaultCvParam;

public class ToleranceData {

    private DefaultCvParam tolerance;

    private DefaultCvParam unit;

    public DefaultCvParam getTolerance() {
        return tolerance;
    }

    public void setTolerance(DefaultCvParam tolerance) {
        this.tolerance = tolerance;
    }

    public DefaultCvParam getUnit() {
        return unit;
    }

    public void setUnit(DefaultCvParam unit) {
        this.unit = unit;
    }
}
