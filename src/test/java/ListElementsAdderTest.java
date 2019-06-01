import Runner.businessLogic.ListElementsAdder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ListElementsAdderTest {
    private ListElementsAdder listElementsAdder = new ListElementsAdder();
    private ArrayList<Integer> ints = new ArrayList<>(
            Arrays.asList(198, 287, 676));
    @Test
    public void sumListElements() {
        int actual = listElementsAdder.sumListElements(ints);
        int expected = 1161;
        assertEquals(actual,expected);
    }
}