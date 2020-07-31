package co.grandcircus.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import co.grandcircus.PracticeAssessment;

class NeverTellMeTheOddsTest {

	@Test
	void returnsASet() {
		int[] nums = { 3, 7, 10 };
		Set<Integer> set = PracticeAssessment.neverTellMeTheOdds(nums);
		assertTrue(set instanceof Set);
	}
	
	@Test
	void returnsOnlyEvens() {
		int[] nums = { 3, 7, 10 };
		Set<Integer> set = PracticeAssessment.neverTellMeTheOdds(nums);
		assertEquals(new HashSet<>(Arrays.asList(10)), set);
	}
	
	@Test
	void returnsOnlyEvens2() {
		int[] nums = { 6, 3, 100, 7, 10 };
		Set<Integer> set = PracticeAssessment.neverTellMeTheOdds(nums);
		assertEquals(new HashSet<>(Arrays.asList(6, 100, 10)), set);
	}
	
	@Test
	void returnsEmptyIfNoEvens() {
		int[] nums = { 9, 1, 55 };
		Set<Integer> set = PracticeAssessment.neverTellMeTheOdds(nums);
		assertEquals(new HashSet<>(), set);
	}

}
