package threelettersequences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TlsListAnalyser {

    private final Map countMap;

    public TlsListAnalyser(Map countMap) {
        this.countMap = countMap;
    }


    public List<String> findTlsByCount(int count) {
        List<String> output = new ArrayList<>();
        countMap.forEach((k,v)->{
            if( v.equals(count) ) {
                output.add((String) k);
            }
        });
        return output;
    }

}
