import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        String fileName = "exampleFile.txt";

        // Step 1: Creating a file
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred during file creation: " + e.getMessage());
        }

        // Step 2: Writing to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a sample text written to the file.\n");
            writer.write("Java file handling example.");
            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }

        // Step 3: Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nReading data from the file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }
}


