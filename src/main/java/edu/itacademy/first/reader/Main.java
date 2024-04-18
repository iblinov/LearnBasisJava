package edu.itacademy.first.reader;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    DataFlightReader reader = new DataFlightReader();//todo
    List<String> res = reader.readDataFlight("data", "flight.txt");
    System.out.println(res);
  }
}
