package com.ironwolf.ds.sort;

/*
 *  -> In place algorithm - memory static
 *  -> complexity O(n^2) - quadratic
 *  -> Degrades quickly
 *  -> Stable
 */

public class InsertionSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		insertionSort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}
	
	public static int[] insertionSort(int[] array) {
		
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
			int newElement = array[firstUnsortedIndex];
			
			int i;
			
			for(i = firstUnsortedIndex; i > 0 && array[i-1] > newElement; i--) {
				array[i] = array[i-1];
			}
			array[i] = newElement;
		}
		return array;
	}

}
