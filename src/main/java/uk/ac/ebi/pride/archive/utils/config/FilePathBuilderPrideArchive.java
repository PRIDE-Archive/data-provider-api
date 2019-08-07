package uk.ac.ebi.pride.archive.utils.config;

import uk.ac.ebi.pride.archive.dataprovider.file.ProjectFileProvider;
import uk.ac.ebi.pride.archive.dataprovider.project.ProjectProvider;

import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FilePathBuilderPrideArchive implements FilePathBuilder {

  // todo add Javadoc across classes
  @Override
  public String buildPublicationFilePath(
          String prefix, ProjectProvider project, ProjectFileProvider file) {
    Date date = new Date();
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    int month = localDate.getMonthValue();
    return prefix
        + File.separator
        + (project.isPublicProject()
            ? (localDate.getYear()
                + File.separator
                + (month < 10 ? "0" : "")
                + month
                + File.separator)
            : "")
        + project.getAccession()
        + (file == null
            ? ""
            : File.separator
                + file.getFileSource().getFolderName()
                + File.separator
                + file.getFileName());
  }
}
