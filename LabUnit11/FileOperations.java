package LabUnit11;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        // Note: Ensure the directory C:\java exists or change the path to a valid one
        File file = new File("C:\\java\\abc.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Using required methods
            System.out.println("exists(): " + file.exists());
            System.out.println("isDirectory(): " + file.isDirectory());
            System.out.println("isFile(): " + file.isFile());
            System.out.println("getName(): " + file.getName());
            System.out.println("getAbsolutePath(): " + file.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
