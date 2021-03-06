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

    /**
     * @return  Get the title of the specific Contact
     */
    TitleConstants getTitle();

    /**
     * Get Name and Last Name of the Contact
     * @return
     */
    String getName();

    /**
     * @return Get affiliation of the Contact
     */
    String getAffiliation();

    /**
     * @return Get registered email for the Contact
     */
    String getEmail();

    /**
     * Get the Country of the Contact
     * @return
     */
    String getCountry();

    /**
     * @return Get Orcid ID .
     */
    String getOrcid();

}
