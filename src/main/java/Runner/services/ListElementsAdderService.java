package Runner.services;

import Runner.businessLogic.ListElementsAdder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ListElementsAdderService {

    @Autowired
    ListElementsAdder listElementsAdder;

    @GetMapping(path = "/sum-list-elements",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public int sumListElements(@RequestBody List<Integer> list) throws NoSuchElementException {
        return  listElementsAdder.sumListElements(list);
    }
}
