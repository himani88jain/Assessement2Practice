package co.grandcircus.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.grandcircus.PracticeAssessment;

class FleeZeroTest {

	@Test
	void increasesPositives() {
		int[] nums = { 3, 7, 10 };
		PracticeAssessment.fleeZero(nums);
		assertArrayEquals(new int[] { 4,  8, 11 }, nums);
	}
	
	@Test
	void decreasesNegatives() {
		int[] nums = { -3, -7, -10 };
		PracticeAssessment.fleeZero(nums);
		assertArrayEquals(new int[] { -4,  -8, -11 }, nums);
	}
	
	@Test
	void doesntChangeZeros() {
		int[] nums = { 0, 0 };
		PracticeAssessment.fleeZero(nums);
		assertArrayEquals(new int[] { 0, 0 }, nums);
	}
	
	@Test
	void handlesMix() {
		int[] nums = { 4, 0, -3, 20, -1, 1, 0 };
		PracticeAssessment.fleeZero(nums);
		assertArrayEquals(new int[] { 5, 0, -4, 21, -2, 2, 0 }, nums);
	}
	
	@Test
	void countsPositives() {
		int[] nums = { 4, 100, 9 };
		assertEquals(3, PracticeAssessment.fleeZero(nums));
	}
	
	@Test
	void countsPositives2() {
		int[] nums = { 0, 4, 0, -1, 1, 0 };
		assertEquals(2, PracticeAssessment.fleeZero(nums));
	}
	
	@Test
	void worksForEmptyArray() {
		int[] nums = new int[0];
		assertEquals(0, PracticeAssessment.fleeZero(nums));
		assertArrayEquals(new int[0], nums);
	}

}
