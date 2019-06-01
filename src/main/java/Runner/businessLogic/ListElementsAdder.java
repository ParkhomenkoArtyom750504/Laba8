package Runner.businessLogic;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
public class ListElementsAdder {

     public int sumListElements(List<Integer> list) throws NoSuchElementException {
        return  list.stream().reduce((sum,value)->sum+=value).get();
    }
}
