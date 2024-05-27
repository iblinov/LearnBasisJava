package by.bsu2.io;
import java.io.*;
import java.util.Arrays;

public class ReadDemo {
    public static void main(String[] args) {
        String file = "data\\t.txt";
        File f = new File(file); // объект для связи с файлом на диске
        int b;
        int count = 0;

        try(FileInputStream is = new FileInputStream(f)) {
            byte[] arr = new byte[8];
            while ((b = is.read(arr)) != -1) { // чтение
                System.out.println(" b = " + b);
                for (byte elem: arr) {
                    System.out.print((char)elem);
                }
                count+=b;
            }
            System.out.print("\n число байт = " + count);
        } catch (FileNotFoundException e) {
            System.err.println("файл не найден: " + e );
        } catch (IOException e) {
            System.err.println("Ошибка файла: " + e );
        }

        try (FileWriter writer = new FileWriter(f, false)) {
            writer.append("--java---");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

