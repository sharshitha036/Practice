package July3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileManager {
        public void readFile(String filePath) {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + filePath);
            } catch (IOException e) {
                System.out.println("Error reading file: " + filePath);
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    System.out.println("Error closing file reader");
                }
            }
        }
    }




