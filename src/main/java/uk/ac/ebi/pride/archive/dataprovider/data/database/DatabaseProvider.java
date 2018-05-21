package uk.ac.ebi.pride.archive.dataprovider.data.database;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;

/**
 * @author ypriverol
 */
public interface DatabaseProvider extends EntityParamGroupProvider {

    /** Get name of the database**/
    String genaName();

    /** Get version of the database **/
    String getVersion();

}
