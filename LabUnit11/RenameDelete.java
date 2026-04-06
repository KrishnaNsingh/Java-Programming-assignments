package LabUnit11;

import java.io.File;

public class RenameDelete {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a filename as a command line argument.");
            return;
        }

        File oldFile = new File(args[0]);
        File newFile = new File("renamed_file.txt");

        if (oldFile.exists()) {
            // Rename the file
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed to: " + newFile.getName());
                
                // Delete the renamed file
                if (newFile.delete()) {
                    System.out.println("Renamed file deleted successfully.");
                }
            } else {
                System.out.println("Rename operation failed.");
            }
        } else {
            System.out.println("Source file does not exist.");
        }
    }
}
