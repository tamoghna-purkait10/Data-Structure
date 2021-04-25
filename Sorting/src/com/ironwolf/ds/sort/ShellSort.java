package com.ironwolf.ds.sort;

/*
 *  -> In place algorithm - memory static
 *  -> complexity O(n^2) - quadratic (worst)
 *  -> Unstable
 *  -> Gap Calculation (3^k - 1)/2 
 *  -> Gap should always be lesser than length of the array
 */
public class ShellSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		shellSort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}
	
	public static int[] shellSort(int[] array) {
		
		for (int gap = array.length/2; gap > 0; gap /= 2) {
			
			
			for (int i = gap; i<array.length; i++) {
				int newElement = array[i];
				
				int j = i;
				
				while (j >= gap && array[j-gap] > newElement) {
					array[j] = array[j-gap];
					j -= gap;
				}
				array[j] = newElement;
			}
		}
		return array;
	}

}
