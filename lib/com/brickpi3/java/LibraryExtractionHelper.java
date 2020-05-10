package com.brickpi3.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LibraryExtractionHelper {
  /**
   * com.brickpi3.java.LibraryExtractionHelper.loadBrickPiLibrary()
   */
  static void loadBrickPiLibrary() {
    boolean debug;
    try {
      debug = "true".equalsIgnoreCase(System.getProperty("debug"));
    } catch (NullPointerException e) {
      debug = false;
    }
    if (debug)
      System.out.println("DEBUG ON");
    boolean loaded = false;
    Throwable[] errors = new Throwable[4];

    try {
      LibraryExtractionHelper.extractResourceToHome("libbrickpi.so");
      System.load(
          LibraryExtractionHelper.getHomeFile(".brickpi3java", "libbrickpi.so").getAbsolutePath());
      if (debug)
        System.out.println("Loaded home resource");
      loaded = true;
    } catch (Exception | Error e) {
      errors[0] = e;
    }

    try {
      System.load(
          LibraryExtractionHelper.class.getClassLoader().getResource("libbrickpi.so").getFile());
      if (debug)
        System.out.println("Loaded resource");
      loaded = true;
    } catch (Exception | Error e) {
      errors[1] = e;
    }

    try {
      if (!loaded) {
        System.loadLibrary("libbrickpi");
        if (debug)
          System.out.println("Loaded from path");
      }
      loaded = true;
    } catch (Exception | Error e) {
      errors[2] = e;
    }

    try {
      if (!loaded) {
        System.load("/usr/lib/libbrickpi.so");
        if (debug)
          System.out.println("Loaded from usr lib");
      }
      loaded = true;
    } catch (Exception | Error e) {
      errors[3] = e;
    }

    if (!loaded) {
      for (Throwable e : errors) {
        if (e != null)
          e.printStackTrace();
      }
    }
  }

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
