package uk.ac.ebi.pride.archive.dataprovider.data.software;

import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.DefaultCvParam;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ypriverol
 */
public class DefaultSoftware implements SoftwareProvider {

    /** Order of use. */
    int order;

    /** Name for the Software **/
    String name;

    /** Customizations without CvTerms**/
    List<String> customizations;

    /** Version of the software in free text**/
    String version;

    /** Attributes for of the software. **/
    List<CvParamProvider> attributes;

    @Override
    public int getOrder() {
        return order;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getCustomization() {
        return customizations;
    }

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public Comparable getId() {
        return version;
    }

    @Override
    public Collection<? extends String> getAdditionalAttributesStrings() {
        List<String> attributes = Collections.emptyList();
        if(this.attributes != null)
            attributes = this.attributes.stream().map(x -> (new DefaultCvParam(x)).toString()).collect(Collectors.toList());
        return attributes;
    }
}
