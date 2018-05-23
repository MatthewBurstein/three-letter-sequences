import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static threelettersequences.TlsLister.buildCountMap;
import static threelettersequences.TlsLister.buildList;

public class TlsListerTest {

    @Test
    public void returnsCorrectListWhenPassedThis() {
        List<String> expected = new ArrayList<>();
        expected.add("thi");
        expected.add("his");
        assertEquals(expected, buildList("this"));
    }

    @Test
    public void returnCorrectListWhenPassedNonLetters() {
        List<String> expected = new ArrayList<>();
        expected.add("thi");
        expected.add("his");
        expected.add("isd");
        assertEquals(expected, buildList("th. a thi s'ft hisd"));
    }

    @Test
    public void returnsCorrectHashMapForSimpleStrings() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("thi", 1);
        expected.put("his", 2);
        assertEquals(expected, buildCountMap("this his"));
    }

    @Test
    public void returnsCorrectHashMapForNonLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("thi", 1);
        expected.put("his", 2);
        expected.put("das", 2);
        assertEquals(expected, buildCountMap("h das d 'df' das s this his"));
    }

}
