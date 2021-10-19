package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GeneralSpringBootApplicationTests {

	@BeforeEach
	public void serviceInit() {
		
	}
	@Test
	void testEmptyList() {
		Controller c = new Controller();
		assertEquals(0, c.viewList().size());
	}
	
	@Test
	void testAddItem() {
		Controller c = new Controller();
		c.add("water");
		assertEquals(1, c.viewList().size());
	}
	
	@Test
	void testDeleteItem() {
		Controller c = new Controller();
		c.add("water");
		c.add("water");
		c.add("lemon");
		c.add("water");
		c.delete("lemon");
		assertEquals(3, c.viewList().size());
	}
	
	@Test
	void testDeleteMultipleItems() {
		Controller c = new Controller();
		c.add("water");
		c.add("water");
		c.add("lemon");
		c.add("water");
		c.delete("water");
		c.delete("water");
		c.delete("water");
		assertEquals(1, c.viewList().size());
	}
	
	@Test
	void testCreation() {
		Controller c = new Controller();
		c.create();
		assertEquals(3, c.viewList().size());
	}
	
	@Test
	void testViewList() {
		Controller c = new Controller();
		c.create();
		String[] arr = {"Candy", "Chocolate", "Chips"}; 
		assertArrayEquals(arr, c.viewList().toArray());
	}

}
