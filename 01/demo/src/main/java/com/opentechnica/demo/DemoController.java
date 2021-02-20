package com.opentechnica.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/demo")
public class DemoController {

    private final static Logger LOGGER = LoggerFactory.getLogger(com.opentechnica.demo.DemoController.class.getName());

    ObjectMapper mapper = new ObjectMapper();

    @PutMapping(path = "/add", produces = "application/json")
    public ResponseEntity<Object> addGameTransaction(@RequestBody Object object) throws JsonProcessingException {
        LOGGER.info("received request to add transaction: {}", mapper.writeValueAsString(object));

        //TODO: add operation

        return new ResponseEntity(object, HttpStatus.CREATED);
    }

    @GetMapping(path = "/", produces = "application/json")
    public ResponseEntity<List<Response>> getAllItems() throws JsonProcessingException {
        LOGGER.info("received request to get all items");
        List<Response> itemList = null;

        //TODO: get items
        if (itemList == null) itemList = new ArrayList<>();
        Response response = new Response();
        response.setText("hello world");
        itemList.add(response);

        LOGGER.info("returning items: {}", mapper.writeValueAsString(itemList));
        return new ResponseEntity(itemList, HttpStatus.OK);
    }

}
