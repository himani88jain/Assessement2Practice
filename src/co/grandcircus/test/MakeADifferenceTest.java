package co.grandcircus.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.grandcircus.PracticeAssessment;

class MakeADifferenceTest {

	@Test
	void positiveDifference() {
		double[] nums = { 10.0, 3.0, 4.5, 2.0 };
		assertEquals(8.0, PracticeAssessment.makeADifference(nums, 0, 3), .001);
	}
	
	@Test
	void positiveDifference2() {
		double[] nums = { 10.0, 3.0, 4.5, 2.0 };
		assertEquals(1.5, PracticeAssessment.makeADifference(nums, 2, 1), .001);
	}
	
	@Test
	void negativeDifference() {
		double[] nums = { 10.0, 3.0, 4.5, 2.0 };
		assertEquals(-5.5, PracticeAssessment.makeADifference(nums, 2, 0), .001);
	}
	
	@Test
	void firstTooHigh() {
		double[] nums = { 10.0, 3.0, 4.5, 2.0 };
		assertEquals(0.0, PracticeAssessment.makeADifference(nums, 8, 1), .001);
	}
	
	@Test
	void secondTooHigh() {
		double[] nums = { 10.0, 3.0, 4.5, 2.0 };
		assertEquals(0.0, PracticeAssessment.makeADifference(nums, 2, 4), .001);
	}
	
	@Test
	void firstTooLow() {
		double[] nums = { 10.0, 3.0, 4.5, 2.0 };
		assertEquals(0.0, PracticeAssessment.makeADifference(nums, -8, 1), .001);
	}
	
	@Test
	void secondTooLow() {
		double[] nums = { 10.0, 3.0, 4.5, 2.0 };
		assertEquals(0.0, PracticeAssessment.makeADifference(nums, 3, -1), .001);
	}

}
