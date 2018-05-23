package threelettersequences;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SequenceFinder {

    public static int sequenceFinder(String fileString) {
        int counter = 0;
        int fileStringLength = fileString.length();
        for(int i=0; i < fileStringLength-2; i++) {
            if(isTra(fileString, i)) {
                counter++;
            }
        }
        return counter;
    }

    public static int traFinderRegex(String fileString) {
        Pattern p = Pattern.compile("tra");
        Matcher m = p.matcher(fileString);
        int counter = 0;
        while (m.find()) {
            counter++;
        }
        return counter;
    }

    private static boolean isTra(String fileString, int i) {
        String threeChars = fileString.substring(i, i + 3);
        return (threeChars.equals("tra"));
    }

}
