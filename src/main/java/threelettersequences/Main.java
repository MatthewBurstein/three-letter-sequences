package threelettersequences;

import threelettersequences.FileService;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static threelettersequences.SequenceFinder.sequenceFinder;
import static threelettersequences.SequenceFinder.traFinderRegex;
import static threelettersequences.TlsLister.buildCountMap;
import static threelettersequences.TlsLister.buildList;

public class Main {

    public static void main(String[] args) {
        String fileString = "";

        try {
            fileString = FileService.readFile(Paths.get("C:\\Users\\MJB\\training\\ThreeLetterSequences\\SampleText.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Using for loop");

        System.out.println(sequenceFinder(fileString));

        System.out.println("Using Regex on whole file");
        System.out.println(traFinderRegex(fileString));

        System.out.println("List of TLS's");
        System.out.println(buildList(fileString));

        System.out.println("Map of TLS's");
        System.out.println(buildCountMap(fileString));

    }

}
