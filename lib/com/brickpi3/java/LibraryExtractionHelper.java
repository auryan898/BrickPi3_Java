package com.brickpi3.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LibraryExtractionHelper {
  static void extractResourceToHome(String filename) {
    InputStream libraryFile = getLibraryResource(filename);
    placeFileInHomeDirectory(libraryFile, ".brickpi3java", filename);
  }

  static File getHomeFile(String directory, String filename) {
    String home = System.getProperty("user.home");
    return new File(home, directory + "/" + filename);
  }

  static boolean placeFileInHomeDirectory(InputStream libraryFile, String directory,
      String filename) {
    File newFile = getHomeFile(directory, filename);
    InputStream reader = null;
    OutputStream writer = null;
    try {
      try {
        reader = libraryFile;
        newFile.getParentFile().mkdirs();
        newFile.createNewFile();
        writer = new FileOutputStream(newFile);
      } catch (IOException e) {
        e.printStackTrace();
        if (reader != null) {
          reader.close();
        }
        return false;
      }
      int data;
      while ((data = reader.read()) != -1) {
        writer.write(data);

      }
      writer.flush();
      if (reader != null) {
        reader.close();
      }
      if (writer != null) {
        writer.close();
      }
    } catch (IOException e) {
      return false;
    }
    return true;
  }

  static InputStream getLibraryResource(String filename) {
    try {
      return LibraryExtractionHelper.class
          .getClassLoader()
          .getResource("libbrickpi.so")
          .openStream();
    } catch (IOException e) {
      return null;
    }
  }
}
