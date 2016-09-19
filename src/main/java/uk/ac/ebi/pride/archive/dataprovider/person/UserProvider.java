package uk.ac.ebi.pride.archive.dataprovider.person;

import java.util.Date;
import java.util.Set;

/**
 * {@code UserProvider} defines an interface for accessing the details of a user
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface UserProvider extends ContactProvider{

    String getPassword();
    Date getCreateAt();
    Date getUpdateAt();
    Set<UserAuthority> getUserAuthorities();
}
