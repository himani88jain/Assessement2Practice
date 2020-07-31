package co.grandcircus.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import co.grandcircus.PracticeAssessment;

class HowFarApartTest {

	@Test
	void positiveDistance() {
		List<String> words = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));
		assertEquals(1, PracticeAssessment.howFarApart(words, "Beta", "Gamma"));
	}
	
	@Test
	void positiveDistance2() {
		List<String> words = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));
		assertEquals(4, PracticeAssessment.howFarApart(words, "Alpha", "Epsilon"));
	}
	
	@Test
	void negativeDistance() {
		List<String> words = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));
		assertEquals(-2, PracticeAssessment.howFarApart(words, "Delta", "Beta"));
	}
	
	@Test
	void firstNotFound() {
		List<String> words = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));
		assertThrows(IllegalArgumentException.class, () -> {
			PracticeAssessment.howFarApart(words, "Omega", "Epsilon");
		});
	}
	
	@Test
	void secondNotFound() {
		List<String> words = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));
		assertThrows(IllegalArgumentException.class, () -> {
			PracticeAssessment.howFarApart(words, "Alpha", "Omega");
		});
	}

}
