package uk.ac.ebi.pride.archive.dataprovider.data.spectra;

import lombok.Data;
import uk.ac.ebi.pride.archive.dataprovider.param.Param;

import java.util.Set;

@Data
public class ThermoParserSpectrum {
    Double[] mzs;
    Double[] intensities;
    Set<Param> attributes;

    public ArchiveSpectrum toArchiveSpectrum(String usi) {
        ArchiveSpectrum archiveSpectrum = new ArchiveSpectrum();
        archiveSpectrum.setMasses(mzs);
        archiveSpectrum.setIntensities(intensities);
        archiveSpectrum.setProperties(attributes);
        archiveSpectrum.setNumPeaks(mzs.length);

        for (Param attr : attributes) {
            if (attr.getAccession() == null || attr.getAccession().trim().isEmpty()
                    || attr.getValue() == null || attr.getValue().trim().isEmpty()) {
                continue;
            }

            if (attr.getAccession().equals("MS:1000511")) { //ms level
                archiveSpectrum.setMsLevel(Integer.parseInt(attr.getValue()));
            }
            if (attr.getAccession().equals("MS:10000016")) { //scan start time
                archiveSpectrum.setRetentionTime(Double.parseDouble(attr.getValue()));
            }
            if (attr.getAccession().equals("MS:10000041")) { //charge state
                archiveSpectrum.setPrecursorCharge(Integer.parseInt(attr.getValue()));
            }
            if (attr.getAccession().equals("MS:10000744")) { //selected ion m/z
                archiveSpectrum.setPrecursorMz(Double.parseDouble(attr.getValue()));
            }
        }
        addUsiFlds2Spectrum(archiveSpectrum, usi);

        return archiveSpectrum;
    }

    public SummaryArchiveSpectrum toSummaryArchiveSpectrum(String usi) {

        SummaryArchiveSpectrum summaryArchiveSpectrum = new SummaryArchiveSpectrum();
        summaryArchiveSpectrum.setNumPeaks(mzs.length);

        for (Param attr : attributes) {
            if (attr.getAccession() == null || attr.getAccession().trim().isEmpty()
                    || attr.getValue() == null || attr.getValue().trim().isEmpty()) {
                continue;
            }

            if (attr.getAccession().equals("MS:10000041")) { //charge state
                summaryArchiveSpectrum.setPrecursorCharge(Integer.parseInt(attr.getValue()));
            }
            if (attr.getAccession().equals("MS:10000744")) { //selected ion m/z
                summaryArchiveSpectrum.setPrecursorMz(Double.parseDouble(attr.getValue()));
            }
        }

        addUsiFlds2Spectrum(summaryArchiveSpectrum, usi);

        return summaryArchiveSpectrum;
    }

    private void addUsiFlds2Spectrum(SummaryArchiveSpectrum spectrum, String usi) {
        String[] usiSplit = usi.split(":");
        String spectraUsi = usiSplit[0] + ":" + usiSplit[1] + ":" + usiSplit[2]+ ":" + usiSplit[3]+ ":" + usiSplit[4];
        spectrum.setUsi(usi);
        spectrum.setProjectAccession(usiSplit[1]);
        spectrum.setSpectraUsi(spectraUsi);
    }
}