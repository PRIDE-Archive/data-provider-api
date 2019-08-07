package uk.ac.ebi.pride.archive.utils.spectrum;

/**
 * Spectrum id generator for PRIDE 3
 *
 * <p>e.g. PXD000001;file.mgf;spectrum=1
 */
public class SpectrumIdGeneratorPrideArchive implements SpectrumIDGenerator {

  public static final String SEPARATOR = ";";

  @Override
  public String generate(String... parts) {
    return String.join(SEPARATOR, parts);
  }
}