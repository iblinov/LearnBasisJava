package by.learn.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class MessageHttpServer {

  public static void main(String[] args) {
    try (ServerSocket serverSocket = new ServerSocket(2048)) {
      System.out.println("Server started");
      while (true) {
        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");
        try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
             PrintWriter output = new PrintWriter(socket.getOutputStream())) {
          while (!input.ready());
          while (input.ready()) {
            System.out.println(input.readLine());
          }
          output.println("HTTP/1.1 200 OK");
          output.println("Content-Type: text/html; charset=utf-8\r\n");
    //      output.println("\r\n");
          output.println("<p>end</p>");
          output.flush();
          System.out.println("Client disconnected!");
        }
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
