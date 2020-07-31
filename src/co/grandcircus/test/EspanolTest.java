package co.grandcircus.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

import co.grandcircus.PracticeAssessment;

class EspanolTest {

	@Test
	void returnsAMap() {
		Map<Integer,String> map = PracticeAssessment.espanol();
		assertTrue(map instanceof Map);
	}
	
	@Test
	void returnsAMapOfSpanishNumbers() {
		Map<Integer,String> map = PracticeAssessment.espanol();
		assertEquals("Uno", map.get(1));
		assertEquals("Dos", map.get(2));
		assertEquals("Tres", map.get(3));
		assertEquals(3, map.size());
	}

}
