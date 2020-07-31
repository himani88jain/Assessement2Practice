package co.grandcircus.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import co.grandcircus.PracticeAssessment;

class TakeItAwayTest {

	@Test
	void removesGivenKey() {
		Map<String, String> map = new HashMap<>();
		map.put("Pea", "Green");
		map.put("Cherry", "Red");
		map.put("Pear", "Yellow");
		PracticeAssessment.takeItAway(map, "Pea");
		assertEquals("Red", map.get("Cherry"));
		assertEquals("Yellow", map.get("Pear"));
		assertFalse(map.containsKey("Pea"));
		assertEquals(2, map.size());
	}
	
	@Test
	void removesNothingIfNoMatchingKey() {
		Map<String, String> map = new HashMap<>();
		map.put("Pea", "Green");
		map.put("Cherry", "Red");
		map.put("Pear", "Yellow");
		PracticeAssessment.takeItAway(map, "Green");
		assertEquals("Green", map.get("Pea"));
		assertEquals("Red", map.get("Cherry"));
		assertEquals("Yellow", map.get("Pear"));
		assertEquals(3, map.size());
	}

	@Test
	void removesGivenKeyIfLast() {
		Map<String, String> map = new HashMap<>();
		map.put("Java", "Cool");
		PracticeAssessment.takeItAway(map, "Java");
		assertEquals(0, map.size());
	}
	
	@Test
	void returnsTrueIfFound() {
		Map<String, String> map = new HashMap<>();
		map.put("Pea", "Green");
		map.put("Cherry", "Red");
		map.put("Pear", "Yellow");
		assertTrue(PracticeAssessment.takeItAway(map, "Pea"));
	}
	
	@Test
	void returnsFalseIfNotFound() {
		Map<String, String> map = new HashMap<>();
		map.put("Pea", "Green");
		map.put("Cherry", "Red");
		map.put("Pear", "Yellow");
		assertFalse(PracticeAssessment.takeItAway(map, "Bean"));
	}

}