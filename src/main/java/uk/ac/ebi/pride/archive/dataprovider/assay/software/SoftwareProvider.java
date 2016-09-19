package uk.ac.ebi.pride.archive.dataprovider.assay.software;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;

/**
 * {@code SoftwareProvider} defines an interface for accessing the details of a software
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface SoftwareProvider extends ParamGroupProvider, EntityProvider{

    int getOrder();
    String getName();
    String getCustomization();
    String getVersion();
}
