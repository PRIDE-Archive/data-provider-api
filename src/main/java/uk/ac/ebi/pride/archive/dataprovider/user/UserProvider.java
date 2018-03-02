package uk.ac.ebi.pride.archive.dataprovider.user;

import uk.ac.ebi.pride.archive.dataprovider.utils.RoleConstants;

import java.util.Date;
import java.util.Set;

/**
 * {@code UserProvider} defines an interface for accessing the details of a user
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface UserProvider extends ContactProvider {

    // Password for the user
    String getPassword();

    // Created Date
    Date getCreateAt();

    // Updated Date
    Date getUpdateAt();

}
