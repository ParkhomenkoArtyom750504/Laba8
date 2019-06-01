package Runner.businessLogic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Component
public class StringListToIntListTransformer {

   public ArrayList stringToInt(List<String> list) throws NumberFormatException, NoSuchElementException {
          return  (ArrayList) list.stream().map(Integer::parseInt).collect(Collectors.toList());
    }
}
