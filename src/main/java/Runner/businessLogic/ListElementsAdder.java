package Runner.businessLogic;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
public class ListElementsAdder {

    private int sum;

    public int sumListElements(List<Integer> list) throws NoSuchElementException {
        sum = 0;
        list.forEach(value -> sum += value);
        return sum;
    }
}
