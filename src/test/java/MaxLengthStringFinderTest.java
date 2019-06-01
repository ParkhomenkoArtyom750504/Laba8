import Runner.businessLogic.MaxLengthStringFinder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MaxLengthStringFinderTest {
    private MaxLengthStringFinder maxLengthStringFinder = new MaxLengthStringFinder();
    private ArrayList<String> strings = new ArrayList<>(
            Arrays.asList("bombombom", "bombombombom", "bom"));
    @Test
    public void findMaxStr() {
        String actual = maxLengthStringFinder.findMaxStr(strings);
        String expected = "bombombombom";
        assertEquals(actual,expected);
    }
}