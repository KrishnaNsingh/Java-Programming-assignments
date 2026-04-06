package LabUnit12;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) {
        String data = "Writing data using OutputStream.";
        try (OutputStream out = new FileOutputStream("output.txt")) {
            byte[] dataBytes = data.getBytes();
            out.write(dataBytes);
            System.out.println("Data written to output.txt successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
