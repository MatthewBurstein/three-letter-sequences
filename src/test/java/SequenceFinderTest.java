package test.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static threelettersequences.SequenceFinder.sequenceFinder;

public class SequenceFinderTest {

    @Test
    public void returns1WhenPassedTra() {

        assertEquals(sequenceFinder("tra"), 1);
    }

    @Test
    public void returns2WhenPassedTratra() {
        assertEquals(sequenceFinder("tratra"), 2);
    }

    @Test
    public void returns1WhenPassedTratre() {
        assertEquals(sequenceFinder("tratre"), 1);
    }
}
