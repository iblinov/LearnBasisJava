package main;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class DbMain {
  static Logger log = LogManager.getLogger();
  public static void main(String[] args) {
    try {
      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
    } catch (SQLException e) {
      log.log(Level.ERROR, e.getMessage() + e.getSQLState());
    }

    try (
      Connection connection = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/users", "root", "Root_123");
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("SELECT student_id, lastname, average FROM students")){
      while (resultSet.next()) {
        int id = resultSet.getInt(1);
        System.out.println(id);
        String name = resultSet.getString("lastname");
        System.out.println(name);
        double avg = resultSet.getFloat(3);
        System.out.println(avg);
      }
     boolean flag = statement.execute("INSERT INTO students (student_id, lastname, average) VALUE (56,'иванов3', 9.5)");
      System.out.println(flag);
    } catch (SQLException e) {
      log.log(Level.ERROR, "{} -- {} -- {}",e.getMessage() , e.getSQLState() , e.getErrorCode());
    }
  }
}
