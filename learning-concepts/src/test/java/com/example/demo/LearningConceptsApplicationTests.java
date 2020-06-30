package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(JUnit4.class)
class LearningConceptsApplicationTests {

	@Test
	void contextLoads() {
		String nameString="sree";
		String nameString2="sree";
		
		assertEquals(nameString, nameString2);
	}
	

}
