package com.ironwolf.ds.sort;

/*
 *  -> In place algorithm - memory static
 *  -> complexity O(n^2) - quadratic
 *  -> Degrades quickly
 */

public class BubbleSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		bubbleSort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}
	
	public static int[] bubbleSort(int[] array) {
		
		for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
		}
		return array;
	}

	public static void swap(int[] array, int i, int j) {
		
		if (i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
