import org.junit.jupiter.api.Test;
import threelettersequences.TlsListAnalyser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TlsListAnalyserTest {

    @Test
    public void returnsCorrectHashMapForNonLetters() {
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("thi", 1);
        testMap.put("his", 2);
        testMap.put("das", 2);
        TlsListAnalyser an = new TlsListAnalyser(testMap);
        List<String> expected = new ArrayList<>();
        expected.add("his");
        expected.add("das");
        assertEquals(expected, an.findTlsByCount(2));
    }

    @Test
    public void createsListOfTenMostCommonTls() {
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("two", 2);
        testMap.put("fiv", 5);
        testMap.put("ten", 10);
        testMap.put("thr", 3);
        testMap.put("thi", 13);
        testMap.put("six", 6);
        testMap.put("one", 1);
        testMap.put("sev", 7);
        testMap.put("fou", 4);
        testMap.put("ele", 11);
        testMap.put("twe", 12);
        testMap.put("eig", 8);
        testMap.put("nin", 9);
        TlsListAnalyser an = new TlsListAnalyser(testMap);
        String[] expected = new String[10];
        expected[0] = "thi";
        expected[1] = "twe";
        expected[2] = "ele";
        expected[3] = "ten";
        expected[4] = "nin";
        expected[5] = "eig";
        expected[6] = "sev";
        expected[7] = "six";
        expected[8] = "fiv";
        expected[9] = "fou";
        assertArrayEquals(expected, an.getTenMostCommon());
    }

    @Test
    public void someTest() {
        String str = "[aaa";
        Pattern p = Pattern.compile("[a-zA-Z]{3}");
        Matcher m = p.matcher(str);
        m.find();
        System.out.println(m.group());
    }

}
