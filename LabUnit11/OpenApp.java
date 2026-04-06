package LabUnit11;

public class OpenApp {
    public static void main(String[] args) {
        try {
            System.out.println("Opening Notepad...");
            ProcessBuilder pb = new ProcessBuilder("notepad.exe");
            pb.start(); 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
