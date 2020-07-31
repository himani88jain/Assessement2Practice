package co.grandcircus.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import co.grandcircus.PracticeAssessment;

class LiftTest {

	@Test
	void capitalizes() {
		List<String> words = new ArrayList<>(Arrays.asList("Hi", "mom!"));
		PracticeAssessment.lift(words);
		assertArrayEquals(new String[] { "HI", "MOM!" }, words.toArray());
	}
	
	@Test
	void capitalizes2() {
		List<String> words = new ArrayList<>(Arrays.asList("grand", "cIrcUS", "4", "ThE", "WIN!!"));
		PracticeAssessment.lift(words);
		assertArrayEquals(new String[] { "GRAND", "CIRCUS", "4", "THE", "WIN!!" }, words.toArray());
	}
	
	@Test
	void returnsLength2() {
		List<String> words = new ArrayList<>(Arrays.asList("Hi", "mom!"));
		assertEquals(2, PracticeAssessment.lift(words));
	}
	
	@Test
	void returnsLength3() {
		List<String> words = new ArrayList<>(Arrays.asList("A", "b", "C"));
		assertEquals(3, PracticeAssessment.lift(words));
	}
	
	@Test
	void returnsLength0() {
		List<String> words = new ArrayList<>();
		assertEquals(0, PracticeAssessment.lift(words));
	}

}
