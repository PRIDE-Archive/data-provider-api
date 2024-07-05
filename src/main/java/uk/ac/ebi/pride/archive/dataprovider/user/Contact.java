package uk.ac.ebi.pride.archive.dataprovider.user;

import lombok.*;
import uk.ac.ebi.pride.archive.dataprovider.utils.TitleConstants;

import java.io.Serializable;
import java.util.Objects;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Contact implements ContactProvider, Serializable {

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

    public Contact(String firstName, String lastName, String affiliation, String country) {
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
        return firstName + " " + lastName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return title == contact.title &&
                Objects.equals(firstName, contact.firstName) &&
                Objects.equals(lastName, contact.lastName) &&
                Objects.equals(identifier, contact.identifier) &&
                Objects.equals(affiliation, contact.affiliation) &&
                Objects.equals(email, contact.email) &&
                Objects.equals(country, contact.country) &&
                Objects.equals(orcid, contact.orcid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, firstName, lastName, identifier, affiliation, email, country, orcid);
    }
}
