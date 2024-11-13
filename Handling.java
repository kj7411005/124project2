import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

/**
 * The Handling class contains utility methods for handling file operations, 
 * such as reading from a file.
 */
public class Handling {

    /**
     * Reads the content of a file from the specified file path and returns it as a string.
     * This method reads the file line by line and appends each line to the content.
     * 
     * If the file cannot be read or found, an IOException will be thrown.
     */
    public static String readFromFile(String filePath) throws IOException {
        String content = ""; // Initialize an empty string
        FileReader file = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(file);
        String line;
        while ((line = reader.readLine()) != null) {
            content += line + "\n"; // Concatenate each line with a newline
        }
        reader.close();
        return content;
    }
}
