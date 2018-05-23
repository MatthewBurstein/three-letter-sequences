package threelettersequences;

import java.util.ArrayList;
import java.util.List;
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
}
