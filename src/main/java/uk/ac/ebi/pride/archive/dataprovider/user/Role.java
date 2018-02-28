package uk.ac.ebi.pride.archive.dataprovider.user;

/**
 * Access roles of the PRIDE user
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public enum Role {

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

    public static Role fromString(String authority) {
        for (Role role : Role.values()) {
            if (role.toString().equalsIgnoreCase(authority.trim())) {
                return role;
            }
        }

        return null;
    }
}