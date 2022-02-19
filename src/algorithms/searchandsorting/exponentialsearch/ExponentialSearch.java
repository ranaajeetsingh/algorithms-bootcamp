package algorithms.searchandsorting.exponentialsearch;

import algorithms.searchandsorting.binarysearch.BinarySearch;

public class ExponentialSearch {

	public static int exponentialSearch(int[] arr, int x) {
		
		if( arr[0] == x)
			return 0;
		else {
			int i = 1;
			
			while(i < arr.length && arr[i] <= x)
				i *= 2;
			return BinarySearch.binarySearch(arr, i/2, i, x);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(exponentialSearch(new int[] {2,3,4,5,6,7,8,9,10,11,}, 8));
	}
}
