package LabUnit12;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("user_input.txt")) {
            
            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line + "\n");
            }
            System.out.println("Data saved to user_input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
