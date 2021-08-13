package rest.listener.custom.filehandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    FileWriter fileWriter;

    public FileHandler(String outputDir, String fileName) {
        try {
            fileWriter = new FileWriter(outputDir + "/" + fileName);
        } catch (IOException io) {
            System.out.println("ERROR ! Unable to create file.");
            io.printStackTrace();
        }
    }

    public void addLine(String line) {
        try {
            fileWriter.write(line);
        } catch (IOException e) {
            System.out.println("ERROR ! Unable to write file.");
            e.printStackTrace();
        }
    }

    public void closeFile() {

        try {
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("ERROR ! Unable to save and close file.");
            e.printStackTrace();
        }

    }
}
