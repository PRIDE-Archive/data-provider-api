package uk.ac.ebi.pride.archive.dataprovider.data.software;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;

import java.util.List;

/**
 * {@code SoftwareProvider} defines an interface for accessing the details of a software
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface SoftwareProvider extends EntityParamGroupProvider {

    /**
     * @return order in which the software was used.
     */
    int getOrder();

    /**
     * @return name of the software
     */
    String getName();

    /**
     * @return Specific customizations
     */
    List<String> getCustomization();

    /**
     * @return Versions of the software.
     */
    String getVersion();
}
