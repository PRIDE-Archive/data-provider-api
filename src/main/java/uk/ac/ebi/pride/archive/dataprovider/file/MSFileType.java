package uk.ac.ebi.pride.archive.dataprovider.file;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityProvider;

/**
  The MSFileTypeConstants is an interface that provides information about all types of file formats can be found in Proteomics and supported by PRIDE Submissions.

 */
public interface MSFileType extends EntityProvider{

    String getName();
}
