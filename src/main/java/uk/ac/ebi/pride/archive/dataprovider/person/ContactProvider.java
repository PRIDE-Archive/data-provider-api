package uk.ac.ebi.pride.archive.dataprovider.person;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
 * {@code ContactProvider} defines an interface for accessing the details of a contact
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface ContactProvider extends EntityProvider{

    Title getTitle();

    String getFirstName();

    String getLastName();

    String getAffiliation();

    String getEmail();

}
