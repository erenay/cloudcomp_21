package com.opentechnica.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	DemoController demoController = new DemoController();

	@Test
	void testResponseIsNotNullWhenGetAllItems() throws JsonProcessingException {
		ResponseEntity<List<Response>> allItems = demoController.getAllItems();
		Assertions.assertNotNull(allItems, "Get all items should return response.");
	}

}
