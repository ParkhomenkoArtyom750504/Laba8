import Runner.businessLogic.StringListToIntListTransformer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StringListToIntListTransformerTest {
    private StringListToIntListTransformer stringListToIntListTransformer = new StringListToIntListTransformer();
    private ArrayList<String> strings = new ArrayList<>(
            Arrays.asList("1", "2", "3"));
    private ArrayList<Integer> ints = new ArrayList<>(
            Arrays.asList(1, 2, 3));
    @Test
    public void stringToInt() {
        List<Integer> actual = stringListToIntListTransformer.stringToInt(strings);
        List<Integer> expected = ints;
        assertEquals(actual,expected);
    }
}