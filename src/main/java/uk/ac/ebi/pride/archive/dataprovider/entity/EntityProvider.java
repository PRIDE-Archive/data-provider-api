package uk.ac.ebi.pride.archive.dataprovider.entity;

import java.io.Serializable;

/**
 * {@code EntityProvider} defines an interface for accessing entity id
 *
 * NOTE: other interfaces often extends this interface, save developers from implement this interface themselves
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface EntityProvider extends Serializable {

    public Long getId();
}
