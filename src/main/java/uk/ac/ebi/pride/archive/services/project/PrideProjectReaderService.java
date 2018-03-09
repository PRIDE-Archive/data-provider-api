package uk.ac.ebi.pride.archive.services.project;

import uk.ac.ebi.pride.archive.dataprovider.project.ProjectProvider;

import java.util.List;
import java.util.stream.Stream;

/**
 * This interface defines the general functionalities for every data persistance system to retrirve. For example, it contains methods to
 * retrieve one Project, multiple projects.
 *
 * @author Yasset Perez-Riverol
 * @version $Id
 */
public interface PrideProjectReaderService {

    /**
     * Read a Project from the storage by Accession
     * @param accession
     * @return ProjectProvider
     */
    ProjectProvider read(String accession);

    /**
     * Read all the projects and store then into an stream for lazy reading.
     * @return List of projects
     */
    Stream<ProjectProvider> readAll(int pageStart, int size);


}
