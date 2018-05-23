import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

}
