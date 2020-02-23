package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WordFrequecnyFormTheFile {

    public static void main(String[] args) {


        try {
            List<String> allLines = Files.readAllLines(Paths.get("src/day63/map.txt"));
            System.out.println("allLines = " + allLines);

            String allLinesAsString=allLines.toString();

        } catch (IOException e) {
            System.out.println("ERRRORR@@@");
        }
    }
}