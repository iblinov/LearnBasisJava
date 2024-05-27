package by.learn.web;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
public class SimpleMessageHttpServer {
  public static void main(String[] args) {
    int port = 2048;
    System.out.println("Server starting on port: " + port);
    try (ServerSocket serverSocket = new ServerSocket(port);
         Socket socket = serverSocket.accept();
         InputStreamReader inputStream = new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8);
         BufferedReader input = new BufferedReader(inputStream);
         PrintWriter output = new PrintWriter(socket.getOutputStream())) {
      System.out.println("Client browser connected port: " + port);
      while (!input.ready());
      while (input.ready()) {
        System.out.println(input.readLine());
      }
      output.println("HTTP/1.1 200 OK");
      output.println("Content-Type: text/html; charset=utf-8\r\n");
      output.println("<hr/>hello world<hr/>");
      output.flush();
      System.out.println("Client disconnected on port: " + port);
    } catch (IOException e) {
      System.err.println("I/O error: " + e);
    }
  }
}

