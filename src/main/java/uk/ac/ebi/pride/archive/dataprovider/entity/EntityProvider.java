package uk.ac.ebi.pride.archive.dataprovider.entity;

import java.io.Serializable;

/**
 * {@code EntityProvider} defines an interface for accessing entity id, if is a database entity or solr entity.
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface EntityProvider extends Serializable {

    /**
     * Get the Id around an entity, Long is used because most of the persistance database uses Long as Id. Most of the time would be a Long accession.
     * This accession would be a unique identifier across all the persistence storage options mongo/solr/files.
     *
     */
    Long getId();
}
