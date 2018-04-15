package uk.ac.ebi.pride.archive.dataprovider.user;

import uk.ac.ebi.pride.archive.dataprovider.utils.TitleConstants;

/**
 * The DefaultContact is the default implementation of the {@link ContactProvider} interface.
 *
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

    /**
     * Dafault Constructor for ContactProvider
     * @param title Title
     * @param firstName FirstName
     * @param lastName LastName
     * @param identifier Identifier
     * @param affiliation Affiliation
     * @param email Email
     * @param country Country
     * @param orcid ORCID
     */
    public DefaultContact(TitleConstants title, String firstName, String lastName,
                          String identifier, String affiliation, String email, String country, String orcid) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identifier = identifier;
        this.affiliation = affiliation;
        this.email = email;
        this.country = country;
        this.orcid = orcid;
    }

    /**
     * The minimum information for a Contact.
     * @param firstName FirstName
     * @param lastName LastName
     * @param affiliation Affiliation
     * @param country Country
     */
    public DefaultContact(String firstName, String lastName, String affiliation, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.affiliation = affiliation;
        this.country = country;
    }

    @Override
    public TitleConstants getTitle() {
        return title;
    }

    @Override
    public String getName() {
        return firstName;
    }

    @Override
    public Comparable getId() {
        return identifier;
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

    public void setTitle(TitleConstants title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setOrcid(String orcid) {
        this.orcid = orcid;
    }
}
