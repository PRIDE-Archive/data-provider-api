package uk.ac.ebi.pride.archive.dataprovider.user;

import uk.ac.ebi.pride.archive.dataprovider.utils.TitleConstants;

/**
 * The DefaultContact is the default implementation of the {@link ContactProvider} interface. 
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public class DefaultContact implements ContactProvider{

    /** Title of the Contact **/ 
    private TitleConstants title;

    /** First Name **/
    private String firstName;

    /** Last Name **/
    private String lastName;

    /** Contact Identifier **/
    private String identifier;

    /** Affiliation **/
    private String affiliation;

    /** Email **/
    private String email;

    /** Country of the Contact **/
    private String country;

    /** ORCID ID **/
    private String orcid;

    @Override
    public TitleConstants getTitle() {
        return title;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public Comparable getId() {
        return identifier;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAffiliation() {
        return affiliation;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String getOrcid() {
        return orcid;
    }
}
