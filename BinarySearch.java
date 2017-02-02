package com.crucerne.www.binarysearch;

import java.util.List;

public class BinarySearch {

	/*
	 * The method searches a sorted list of integers for a desired value by
	 * comparing it to the median value. If the median value equals the desired
	 * value, then the method returns true, otherwise it will call the same
	 * method but uses the lower or upper half of the original list as argument.
	 * If the desired value is less than the median, then the lesser half of the
	 * original list will be used, else, the greater half will be passed
	 * instead. It is imperative the list being passed is already sorted in ascending order or this
	 * method will not be guaranteed to return the expected result.
	 */
	public static boolean binarySearch(List<Integer> numbers, Integer search_value) {
		// Return false if list is empty or null.
		if (numbers == null || numbers.isEmpty()) {
			return false;
		}

		// Obtain number from list to compare to search value.
		Integer current_number = numbers.get(numbers.size() / 2);

		// Return true if current number equals the desired value.
		if (current_number.equals(search_value)) {
			return true;
		}

		// Call same method with lower half of original list if the search value
		// is less than the current number.
		if (search_value < current_number) {
			return binarySearch(numbers.subList(0, numbers.size() / 2), search_value);
		}

		// Call same method with upper half of original list if the search value
		// is greater than the current number.
		else {
			return binarySearch(numbers.subList(numbers.size() / 2 + 1, numbers.size()), search_value);
		}
	}

}
