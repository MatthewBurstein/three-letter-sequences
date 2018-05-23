package threelettersequences;

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

    private static boolean isTra(String fileString, int i) {
        String threeChars = fileString.substring(i, i + 3);
        return (threeChars.equals("tra"));
    }

}
