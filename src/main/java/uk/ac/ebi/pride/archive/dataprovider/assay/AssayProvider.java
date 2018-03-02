package uk.ac.ebi.pride.archive.dataprovider.assay;

import uk.ac.ebi.pride.archive.dataprovider.assay.instrument.InstrumentProvider;
import uk.ac.ebi.pride.archive.dataprovider.assay.software.SoftwareProvider;
import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.ParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.user.ContactProvider;

import java.util.Collection;

/**
 * {@code AssayProvider} Assay store information of a particular Assay Level mainly from mzIdentML and mzTab.
 * An assay is an abstract concept that provides information of the relation between results + samples + msruns and
 * the project.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface AssayProvider extends ParamGroupProvider, EntityProvider {

    /**
     * @return Get project Accession
     */
    Comparable getProjectId();

    /**
     * @return get Assay Accession
     */
    String getAccession();

    /**
     * @return TitleConstants of the Assay.
     */
    String getTitle();

    /**
     * @return Short description of the Assay.
     */
    String getDescription();
}
