package threelettersequences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TlsLister {

    public static List<String> buildList(String fileString) {
        List<String> output = new ArrayList<>();
        Pattern p = Pattern.compile("[a-zA-z]{3}");
        Matcher m = p.matcher(fileString);
        int idx = 0;
        while(m.find(idx)) {
            output.add(m.group());
            idx = m.start() + 1;
        }
        return output;
    }

    public static Map<String, Integer> buildCountMap(String fileString) {
        Map<String, Integer> output = new HashMap<>();
        Pattern p = Pattern.compile("[a-zA-z]{3}");
        Matcher m = p.matcher(fileString);
        int idx = 0;
        while(m.find(idx)) {
            String lastMatch = m.group();
            if(output.get(lastMatch) == null){
                output.put(lastMatch, 1);
            } else {
                int prevValue = output.get(lastMatch);
                output.put(lastMatch, prevValue + 1);
            }
            idx = m.start() + 1;
        }
        return output;
    }

}
