package uk.ac.ebi.pride.archive.dataprovider.assay.software;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;

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
    String getCustomization();

    /**
     * @return Versions of the software.
     */
    String getVersion();
}
