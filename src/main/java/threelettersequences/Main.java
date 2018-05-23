package threelettersequences;

import threelettersequences.FileService;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static threelettersequences.SequenceFinder.sequenceFinder;

public class Main {

    public static void main(String[] args) {
        System.out.println("setup successful");

        try {
            String fileString = FileService.readFile(Paths.get("C:\\Users\\MJB\\training\\ThreeLetterSequences\\SampleText.txt"));
            System.out.println(sequenceFinder(fileString));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
