package uk.ac.ebi.pride.archive.dataprovider.user;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.utils.TitleConstants;

/**
 * {@code ContactProvider} defines an interface for accessing the details of a contact
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface ContactProvider extends EntityProvider {

    // Contact TitleConstants
    TitleConstants getTitle();

    // Contact First Name
    String getFirstName();

    // Contact Last Name
    String getLastName();

    // Contact Affiliation
    String getAffiliation();

    // Contact email
    String getEmail();

    // Get Country of the user
    String getCountry();

    //Get Orcid Id.
    String getOrcid();

}
