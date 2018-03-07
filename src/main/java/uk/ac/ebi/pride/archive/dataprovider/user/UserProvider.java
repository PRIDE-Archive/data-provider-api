package uk.ac.ebi.pride.archive.dataprovider.user;

import java.util.Date;

/**
 * {@code UserProvider} defines an interface for accessing the details of a user
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface UserProvider extends ContactProvider {

    /**
     * @return  Get the Password registered in the System
     */
    String getPassword();

    /**
     * @return Get the Date of Creation of the User
     */
    Date getCreateAt();

    /**
     * @return Last update of the user
     */
    Date getUpdateAt();

}
