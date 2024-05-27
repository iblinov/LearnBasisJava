package edu.itacademy.first.reader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DataFlightReader {
  public List<String> readDataFlight(String dir, String fileName) {
    Path path = FileSystems.getDefault().getPath(dir, fileName);
    List<String> lines = null;//new ArrayList<>();
    try {//java7
      lines = Files.readAllLines(path, StandardCharsets.UTF_8);
     // System.out.println(lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lines;
  }
}
