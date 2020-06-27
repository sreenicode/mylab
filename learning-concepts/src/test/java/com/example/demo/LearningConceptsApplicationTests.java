package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearningConceptsApplicationTests {

	@Test
	void contextLoads() {
		String nameString="sree";
		String nameString2="sri";
		
		assertEquals(nameString, nameString2);
	}
	

}
