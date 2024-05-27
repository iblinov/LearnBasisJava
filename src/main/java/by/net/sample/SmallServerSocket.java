package by.net.sample;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SmallServerSocket {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(201);
             Socket socket = server.accept();
             PrintWriter pw = new PrintWriter(
                    new OutputStreamWriter(socket.getOutputStream()))){
                // помещение строки "привет!" в буфер
                pw.println("привет!");
                // отправка содержимого буфера клиенту
                pw.flush();
            }  catch (IOException e) {
                System.err.println("Ошибка соединения потока: " + e);
            }
        System.out.println("connection closed");
        }
    }

