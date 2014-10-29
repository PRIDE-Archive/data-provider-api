package uk.ac.ebi.pride.archive.dataprovider.person;

/**
 * Access roles of the PRIDE user
 *
 * @author Rui Wang
 * @version $Id$
 */
public enum UserAuthority {

    /**
     * Full access to all the PRIDE projects, can make changes to all the PRIDE project,
     * such as: making project public
     */
    ADMINISTRATOR,

    /**
     * Data submitter, has access and control over the PRIDE projects owned by the submitter,
     * can make changes only to the PRIDE projects owned by the submitter
     */
    SUBMITTER,

    /**
     * Journal or data reviewer, has access to the PRIDE projects owned by the submitter
     */
    REVIEWER;

    public static UserAuthority fromString(String authority) {
        for (UserAuthority userAuthority : UserAuthority.values()) {
            if (userAuthority.toString().equalsIgnoreCase(authority.trim())) {
                return userAuthority;
            }
        }

        return null;
    }
}