package Runner.businessLogic;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

@Component
public class MaxLengthStringFinder {

    public  String findMaxStr(Collection<String> list) throws NoSuchElementException {
        return  list.stream().max(Comparator.comparing(String::length)).get();
    }
}
