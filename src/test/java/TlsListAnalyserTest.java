import org.junit.jupiter.api.Test;
import threelettersequences.TlsListAnalyser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

}
