package com.ironwolf.ds.sort;

/*
 *  -> not an in-place algorithm - extra array required
 *  -> divide & conquer algorithm
 *  -> midpoint determination = (start + end) /2
 *  -> complexity O(nlogn) - base 2 --> because we are splitting in 2
 *  -> Stable
 *  -> recursion driven
 */

public class MergeSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		mergeSort(intArray, 0, intArray.length);

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}

	public static void mergeSort(int[] array, int start, int end) {

		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;
		mergeSort(array, start, mid);
		mergeSort(array, mid, end);
		merge(array, start, mid, end);
	}

	public static void merge(int[] array, int start, int mid, int end) {

		// already sorted
		if (array[mid - 1] <= array[mid]) {
			return;
		}

		int i = start; // left array start
		int j = mid; // right array start
		int tempIndex = 0;

		int[] temp = new int[end - start];

		// moving in to temp array
		while (i < mid && j < end) {
			temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++]; // ++ because incrementing to next
																				// element after operation
		}
		
		System.arraycopy(array, i, array, start + tempIndex, mid - i); // leftover left array element to original array
		System.arraycopy(temp, 0, array, start, tempIndex); // temp array to original array

	}

}
