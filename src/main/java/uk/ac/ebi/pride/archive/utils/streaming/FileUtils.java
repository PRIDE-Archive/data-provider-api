package uk.ac.ebi.pride.archive.utils.streaming;

import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileUtils {

  /** Stream a given file to HttpServletResponse */
  public void streamFile(HttpServletResponse response, File fileToStream) throws IOException {
    FileInputStream fis = new FileInputStream(fileToStream);
    response.setHeader(
        "Content-Disposition", "attachment; filename=\"" + fileToStream.getName() + "\"");
    if (fileToStream.getName().endsWith(".gz")) {
      response.setContentType("application/x-gzip");
    } else {
      response.setContentType("text/plain; charset=utf-8");
    }
    IOUtils.copy(fis, response.getOutputStream());
    response.flushBuffer();
  }

  /** Find the file to be streamed to the client */
  public File findFileToStream(String filePath) throws FileNotFoundException {
    File fileToStream;
    fileToStream = new File(filePath);
    if (!fileToStream.exists()) {
      throw new FileNotFoundException(
          "Failed to find the file to stream : " + fileToStream.getAbsolutePath());
    }
    return fileToStream;
  }
}
