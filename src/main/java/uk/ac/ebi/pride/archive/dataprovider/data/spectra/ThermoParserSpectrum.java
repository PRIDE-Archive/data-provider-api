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

/*
        "mzs":[110.071189880371],
                "intensities":[39316.46484375],

                "attributes":[

    {
        "accession":"MS:10003057",
            "name":"scan number",
            "value":"17555"
    },

    {
        "accession":"MS:10000016",
            "name":"scan start time", ->retentionTime
        "value":"4662.3241"
    },

    {
        "accession":"MS:1000511",
            "name":"ms level",
            "value":"2"
    },

    {
        "accession":"MS:10000927",
            "cv_param_group":"1",
            "name":"ion injection time",
            "value":"147.372"
    },

    {
        "accession":"UO:0000028",
            "cv_param_group":"1",
            "name":"millisecond"
    },

    {
        "accession":"MS:10000744",
            "name":"selected ion m/z", ->precursorMz
        "value":"767.973937988281"
    },

    {
        "accession":"MS:1000827",
            "name":"isolation window target m/z",
            "value":"767.973937988281"
    },

    {
        "accession":"MS:1000828",
            "name":"isolation window lower offset",
            "value":"1"
    },

    {
        "accession":"MS:1000829",
            "name":"isolation window upper offset",
            "value":"1"
    },

    {
        "accession":"MS:10000465",
            "name":"scan polarity",
            "value":"positive scan",
            "value_accession":"MS:1000130"
    },

    {
        "accession":"MS:10000041",
            "name":"charge state",
            "value":"2"
    },

    {
        "accession":"MS:10000512",
            "name":"filter string",
            "value":"FTMS + p NSI d Full ms2 767.97@hcd32.00 [110.00-1550.00]"
    },

    {
        "accession":"MS:1000525",
            "name":"spectrum representation",
            "value":"centroid spectrum",
            "value_accession":"MS:1000127"
    }
    ]
}
]*/
