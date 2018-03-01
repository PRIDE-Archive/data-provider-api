package uk.ac.ebi.pride.archive.dataprovider.assay.msrun;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.file.ProjectFileProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

import java.util.Collection;

/**
 * The MSRun Provider links all the MSRun RAW data to the corresponding Peak List file or
 * multiple peak list files. The MSRun would be used to store properties around the combination
 * of a Peak List - RAW File. If one RAW file is associated with more than one Peak List file
 * multiple MSRun should be added.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface MsRunProvider extends EntityProvider{

    /**
     * Get the Project Accession related with the following MSRun.
     * @return PX Accession
     */
    String getProjectAccession();

    /**
     * Each MSRun is associated with only one RAW File in the Experiment.
     * @return Project File.
     */
    ProjectFileProvider getRAWFile();

    /**
     * Properties around the MSRun information, for example the properties
     * can be use to store the Fragmentation Type, Ionization, Instrument Type.
     * @return Attributes
     */
    Collection<? extends CvParamProvider> getAttributes();

    /**
     * Each Raw File is associated with non or one peak lists.
     * @return Peak List file
     */
    ProjectFileProvider getPeakFile();
}
