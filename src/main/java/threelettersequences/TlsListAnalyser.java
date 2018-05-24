package threelettersequences;

import java.util.*;

public class TlsListAnalyser {

    private final Map countMap;

    public TlsListAnalyser(Map<String, Integer> countMap) {
        this.countMap = countMap;
    }

    public static TlsListAnalyser copyInstance(TlsListAnalyser original) {
        return new TlsListAnalyser(original.countMap);
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

    public String[] getTenMostCommon() {
        String[] output = new String[10];
        List<Map.Entry<String, Integer>> list = new LinkedList<>(countMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);
        for(int i = 0; i < 10; i++) {
            output[i] = list.get(i).getKey();
        }

        return output;
    }



}
