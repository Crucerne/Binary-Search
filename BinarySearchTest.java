package com.crucerne.www.binarysearch;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void test() {
		final List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12);
		boolean first_search = BinarySearch.binarySearch(numbers, 10);
		boolean second_search = BinarySearch.binarySearch(numbers, 5);
		assertTrue(first_search);
		assertFalse(second_search);
	}

}
