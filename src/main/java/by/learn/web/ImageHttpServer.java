package by.learn.web;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.imageio.ImageIO;
public class ImageHttpServer {
  public static void main(String args[]) {
    int port = 2048;
    System.out.println("Server starting on port: " + port);
    try (ServerSocket serverSocket = new ServerSocket(port);
         Socket socket = serverSocket.accept();
         ByteArrayOutputStream baoStream = new ByteArrayOutputStream()) {
      System.out.println("Client is running. Reading image from disk...");
      String imageFilename = "C:\\_ROOT\\used_words.jpg";
      BufferedImage image = ImageIO.read(new File(imageFilename));
      System.out.println("Image file read successfully");
      ImageIO.write(image, "jpg", baoStream);
      PrintStream output = new PrintStream(socket.getOutputStream());
      baoStream.writeTo(output);
      baoStream.flush();
      System.out.println("Image " + imageFilename + " sent to server successfully");
      System.out.println("Client disconnected on port: " + port);
    } catch (IOException e) {
      System.err.println("I/O error: " + e);
    }
  }
}