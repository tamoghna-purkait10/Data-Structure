package com.ironwolf.ds.sort;

/*
 *  -> in-place algorithm
 *  -> divide & conquer algorithm
 *  -> pivot element starting with first element
 *  -> complexity O(nlogn) - base 2 --> because we are splitting in 2
 *  -> O(n^2) in Worst case 
 *  -> Unstable
 *  -> recursion driven
 */

public class QuickSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		quickSort(intArray, 0, intArray.length);

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}

	public static void quickSort(int[] array, int start, int end) {

		if (end - start < 2) {
			return;
		}

		int pivotIndex = partition(array, start, end);
		quickSort(array, start, pivotIndex);
		quickSort(array, pivotIndex + 1, end);
	}

	public static int partition(int[] array, int start, int end) {
		
		int pivot = array[start];
		
		int i = start; // left array start
		int j = end; // right array start

		// i and j must not cross
		while (i < j) {
			
			while (i < j && array[--j] >= pivot); // empty loop to find the element less than pivot from right to left iteration
			if (i < j) {
				array[i] = array[j];
			}
			
			while (i < j && array[++i] <= pivot); // empty loop to find the element greater than pivot from left to right iteration
			if (i < j) {
				array[j] = array[i];
			}
		}
		array[j] = pivot;
		return j;
	}

}
