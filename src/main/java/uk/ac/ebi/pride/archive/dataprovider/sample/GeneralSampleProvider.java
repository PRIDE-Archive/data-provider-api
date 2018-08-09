package uk.ac.ebi.pride.archive.dataprovider.sample;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;

import java.util.Collection;


/**
 * {@link GeneralSampleProvider} contains the information of the Sample for one experiment.
 *  Some documents about the sample information can be found in design folder of this project.
 *
 *  - Important information: A sample start from the biological replicate -
 */
public interface GeneralSampleProvider extends EntityParamGroupProvider{

    /**
     * Sample accession is a unique identifier across all the resource for the sample.
     * @return
     */
    String getSampleAccession();

    /**
     * @return Get the sample title
     */
    String getSampleTitle();

    /**
     * The addition attributes for the sample will be related with the parameters that are mandatory for the Sample, such as cell-type
     * Tissue, Organism, etc.
     *
     * @return CVParam List
     */
    @Override
    Collection<? extends String> getAdditionalAttributesStrings();
}
