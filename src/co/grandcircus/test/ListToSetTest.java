package co.grandcircus.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import co.grandcircus.PracticeAssessment;

class ListToSetTest {

	@Test
	void convertsListToSet() {
		List<String> list = new ArrayList<>(Arrays.asList("Apple", "Berry"));
		Set<String> set = PracticeAssessment.listToSet(list);
		assertEquals(new HashSet<>(Arrays.asList("Apple", "Berry")), set);
	}

	@Test
	void convertsListToSet2() {
		List<String> list = new ArrayList<>(Arrays.asList("Apple", "Berry", "Apple", "Celery"));
		Set<String> set = PracticeAssessment.listToSet(list);
		assertEquals(new HashSet<>(Arrays.asList("Apple", "Berry", "Celery")), set);
	}

	@Test
	void convertsEmptyListToSet() {
		List<String> list = new ArrayList<>(0);
		Set<String> set = PracticeAssessment.listToSet(list);
		assertEquals(new HashSet<>(), set);
	}

}
