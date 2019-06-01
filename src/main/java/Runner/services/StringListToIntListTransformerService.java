package Runner.services;

import Runner.businessLogic.StringListToIntListTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class StringListToIntListTransformerService {

    @Autowired
    StringListToIntListTransformer stringListToIntListTransformer;

    @GetMapping(path = "/string-to-int",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ArrayList stringToInt(@RequestBody List<String> list)  {
        return  stringListToIntListTransformer.stringToInt(list);
    }
}
