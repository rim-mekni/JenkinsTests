package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TpJenkinsSpringBootAppApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("it is a test class");
		assertEquals(true , true); 
		
	}

}
