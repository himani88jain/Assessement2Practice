package co.grandcircus;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PracticeAssessment {

	private static Scanner scnr;

	public static void main(String[] args) {

		scnr = new Scanner(System.in);

		List<String> changeToCaps = new ArrayList<>();
		changeToCaps.add("Hi");
		changeToCaps.add("mom");
		changeToCaps.add("how");
		changeToCaps.add("are");
		changeToCaps.add("you");

		HashMap<String, String> fruits = new HashMap<>();
		fruits.put("Pea", "Green");
		fruits.put("Cherry", "Red");
		fruits.put("Plum", "Purple");

		List<String> change = new ArrayList<>();
		change.add("Apple");
		change.add("Banana");
		change.add("Apple");
		change.add("Cherry");
		change.add("Cherry");
		change.add("Orange");
		change.add("Grapes");

		List<String> numbers = new ArrayList<>();
		numbers.add("One");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Four");
		numbers.add("Five");

		double[] nums = { 10.0, 3.0, 4.5, 2.0 };
		int[] number = { 3, 0, 5, -2 };

		System.out.println("Espanol method result: \n" + espanol());
		System.out.println();

		System.out.println("Lift method result: \n" + lift(changeToCaps));
		System.out.println();

		System.out.println("Enter the matching word");
		String match = scnr.next();
		System.out.println("Take is away method result is:\n " + takeItAway(fruits, match));
		System.out.println();

		System.out.println("List to set method result is:\n " + listToSet(change));
		System.out.println();

		System.out.println("Enter string1: ");
		String a = scnr.next();

		System.out.println("Enter string2: ");
		String b = scnr.next();

		System.out.println("How far apart result is :\n " + howFarApart(numbers, a, b));
		System.out.println();

		try {
			System.out.println("Make a difference method result is\n" + makeADifference(nums, 0, 3));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("indices not found");
		}
		System.out.println();

		int[] num2 = { 1, 2, 3, 5, 8, 9, 13, 17, 20, 26 };
		System.out.println("Never tell me the odds result:\n" + neverTellMeTheOdds(num2));
		System.out.println();

		System.out.println("Flee a zoo reult is \n" + fleeZero(number));

	}

	public static HashMap<Integer, String> espanol() {
		HashMap<Integer, String> result = new HashMap<>();
		result.put(1, "Uno");
		result.put(2, "Dos");
		result.put(3, "Tres");
		return result;
	}

	public static int lift(List<String> changeToCaps) {
		for (int i = 0; i < changeToCaps.size(); i++) {
			changeToCaps.set(i, (changeToCaps.get(i)).toUpperCase());
		}
		return changeToCaps.size();

	}

	public static boolean takeItAway(Map<String, String> fruits, String findName) {
		for (String s : fruits.keySet()) {
			if (fruits.containsKey(findName)) {
				fruits.remove(findName);
				return true;
			}
		}
		return false;
	}

	public static Set<String> listToSet(List<String> change) {
		Set<String> newSet = new HashSet<String>();
		for (int i = 0; i < change.size(); i++) {
			newSet.add(change.get(i));
		}

		return newSet;
	}

	public static int howFarApart(List<String> numbers, String a, String b) {
		int index1 = 0;
		int index2 = 0;
		// boolean check=true;
		try {
			index1 = numbers.indexOf(a);
			index2 = numbers.indexOf(b);

			if ((index1 == -1) || (index2 == -1))
				throw new IllegalArgumentException();

		} catch (IllegalArgumentException e) {
			System.out.println("Match not found");

		}
		return (index2 - index1);
	}

	public static double makeADifference(double[] arr, int index1, int index2) {

		for (int i = 0; i < arr.length; i++) {
			if (i == index1)
				index1 = i;
			if (i == index2)
				index2 = i;
		}

		return (arr[index1] - arr[index2]);

	}

	public static Set<Integer> neverTellMeTheOdds(int[] numbers) {
		Set<Integer> even = new TreeSet<>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				even.add(numbers[i]);
			}
		}
		return even;
	}

	public static int fleeZero(int[] numbers) {
		int positive = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				numbers[i] += 1;
				positive++;
			} else if (numbers[i] < 0)
				numbers[i] -= 1;
		}
		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i] + " ");
		}
		return positive;
	}
}
