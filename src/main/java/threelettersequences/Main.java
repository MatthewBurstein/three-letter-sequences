package threelettersequences;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

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
        Map<String, Integer> countMap = buildCountMap(fileString);
        System.out.println(countMap);

        System.out.println("number of tras " + countMap.get("tra"));

        System.out.println("TLS which appear 63 times are:");
        TlsListAnalyser an = new TlsListAnalyser(countMap);
        System.out.println(an.findTlsByCount(63));

        System.out.println("ten most common TLS:");
        System.out.println(Arrays.toString(an.getTenMostCommon()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Find Tls with a given frequency. What frequency would you like to try?");
        int freq = scanner.nextInt();
        System.out.println(an.findTlsByCount(freq));

    }

}
