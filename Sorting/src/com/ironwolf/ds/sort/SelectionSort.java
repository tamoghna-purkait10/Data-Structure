package com.ironwolf.ds.sort;

/*
 *  -> In place algorithm - memory static
 *  -> complexity O(n^2) - quadratic
 *  -> Degrades quickly
 *  -> One swap per traversal
 *  -> Unstable
 */

public class SelectionSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		selectionSort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}
	
	public static int[] selectionSort(int[] array) {
		
		for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
			int largestValueIndex = 0;
			for(int i=0; i<=lastUnsortedIndex; i++) {
				if(array[i] > array[largestValueIndex]) {
					largestValueIndex = i;
				}
			}
			swap(array, largestValueIndex, lastUnsortedIndex);
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
