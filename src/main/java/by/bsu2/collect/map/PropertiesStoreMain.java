package by.bsu2.collect.map;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class PropertiesStoreMain {
  public void meth(){
    InputStream input = this.getClass().getClassLoader().getResourceAsStream("prop//base.properties");
    Properties prop = new Properties();

    // Получаем доступ к файлу
    //  InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("prop/base.properties");

    try {
      // Загружаем свойства из файла
      prop.load(input);
    }catch (IOException e) {
      throw new RuntimeException(e);
    }
    System.out.println(prop);
  }
  public static void main(String[] args) {
    PropertiesStoreMain ob = new PropertiesStoreMain();
    ob.meth();
//    Properties propsBase = new Properties();
//    try {
//      propsBase.setProperty("db.driver", "com.mysql.cj.jdbc.Driver");
//      propsBase.setProperty("db.url", "jdbc:mysql://127.0.0.1:3306/testphones");
//      propsBase.setProperty("user", "root");
//      propsBase.setProperty("password", "pass");
//
//
//      propsBase.setProperty("poolsize", "5");
//      propsBase.store(new FileWriter("data/base.properties"), "No Comment’s");
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

//    Properties props = new Properties();
//    try {
//      props.load(new FileReader("prop\\base.properties"));
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    String dbUrl = props.getProperty("db.url");
//
//
//// following two names are missing in the file
//    String maxIdle = props.getProperty("maxIdle"); // maxIdle = null
//// value "20" will be assigned to the key if it is not found in the file
//    String maxActive = props.getProperty("maxActive", "20");
//    System.out.println("dbUrl: " + dbUrl);
//    System.out.println("maxIdle: " + maxIdle);
//    System.out.println("maxActive: " + maxActive);

  }
}

