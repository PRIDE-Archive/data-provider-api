package uk.ac.ebi.pride.archive.services.project;

import uk.ac.ebi.pride.archive.dataprovider.project.ProjectProvider;

/**
 *
 * The Writer Service is a Service across all PRIDE that force the storage systems to implement it. For example, the
 * Mongo Service needs to implement this Service to Write the data, in addition it can implements the {@link PrideProjectReaderService}
 * for reading methods.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface PrideProjectWriterService {

    /**
     * Create a New Project in the system (e.g MongoDB)
     * @param projectProvider
     * @return create project
     */
    ProjectProvider save(ProjectProvider projectProvider);

    /**
     * Update a PRIDE Project entry in the database using the information of the new project
     * @param accession accession of the project
     * @param newProjectEntry Project Entry
     * @return Updated Project
     */
    ProjectProvider update(String accession, ProjectProvider newProjectEntry);

    /**
     * Remove a Project from the database
     * @param accession Project Accession
     * @return deleted Project
     */
    ProjectProvider delete(String accession);

    /**
     * Delete all records from the persistence storage.
     */
    void deleteAll();

}
