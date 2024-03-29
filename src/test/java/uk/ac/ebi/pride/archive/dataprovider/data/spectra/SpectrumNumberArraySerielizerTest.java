package uk.ac.ebi.pride.archive.dataprovider.data.spectra;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import uk.ac.ebi.pride.archive.dataprovider.data.spectra.SpectrumNumberArrayDeserializer;
import uk.ac.ebi.pride.archive.dataprovider.data.spectra.SpectrumNumberArraySerielizer;

import java.io.IOException;
import java.util.zip.DataFormatException;

public class SpectrumNumberArraySerielizerTest{

    private Double[] testData64bitFloat = {
            0.000, 0.001, 0.002, 0.003, 0.004, 0.005, 0.006, 0.007, 0.008, 0.009,
            0.010, 0.011, 0.012, 0.013, 0.014, 0.015, 0.016, 0.017, 0.018, 0.019,
            0.020, 0.021, 0.022, 0.023, 0.024, 0.025, 0.026, 0.027, 0.028, 0.029,
            0.030, 0.031, 0.032, 0.033, 0.034, 0.035, 0.036, 0.037, 0.038, 0.039,
            0.040, 0.041, 0.042, 0.043, 0.044, 0.045, 0.046, 0.047, 0.048, 0.049,
            0.050, 0.051, 0.052, 0.053, 0.054, 0.055, 0.056, 0.057, 0.058, 0.059,
            0.060, 0.061, 0.062, 0.063, 0.064, 0.065, 0.066, 0.067, 0.068, 0.069,
            0.070, 0.071, 0.072, 0.073, 0.074, 0.075, 0.076, 0.077, 0.078, 0.079,
            0.080, 0.081, 0.082, 0.083, 0.084, 0.085, 0.086, 0.087, 0.088, 0.089,
            0.090, 0.091, 0.092, 0.093, 0.094, 0.095, 0.096, 0.097, 0.098};

    @Before
    public void setUp() {}

    @Test
    public void testCompressArrayDouble() throws IOException, DataFormatException {
        String compressData = SpectrumNumberArraySerielizer.compressArrayDouble(testData64bitFloat);
        Double[] uncompress = SpectrumNumberArrayDeserializer.decompress(compressData);
        Assert.assertArrayEquals(testData64bitFloat, uncompress);

    }
}