package uk.ac.ebi.pride.archive.dataprovider.sample;

import uk.ac.ebi.pride.archive.dataprovider.common.ITuple;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

import java.util.Collection;

/**
 * The sample provider is the link between the {@link uk.ac.ebi.pride.archive.dataprovider.msrun.MsRunProvider}. For those links
 * some additional information is needed like the fraction or the technical replicate.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 *
 */
public interface SampleProvider{

    /**
     * Get Sample Accession it can be numeric or String. The only contrains is that it needs to
     * implements Comparable.
     * @return Comparable Accession
     */
    Comparable getAccession();

    /**
     * Get the sample Properties
     * @return Sample Properties.
     */
    Collection<?extends ITuple<? extends  CvParamProvider, ?extends CvParamProvider>> getSampleProperties();

}
