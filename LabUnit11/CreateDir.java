package LabUnit11;

import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        File dir = new File("MyNewDirectory");

        if (dir.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            if (dir.exists()) {
                System.out.println("Directory already exists.");
            } else {
                System.out.println("Failed to create directory.");
            }
        }
    }
}