package Runner.services;


import Runner.businessLogic.MaxLengthStringFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class MaxLengthStringFinderService {

    @Autowired
    MaxLengthStringFinder maxLengthStringFinder;

    @GetMapping(path = "/find-max-str", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String findMaxStr(@RequestBody List<String> list) throws NoSuchElementException {
        return maxLengthStringFinder.findMaxStr(list);
    }
}
