package algorithms.searchandsorting.interpolationsearch;

import algorithms.searchandsorting.jumpsearch.JumpSearch;

public class InterpolationSearch {

	public static int interpolationSearch(int[] arr, int x, int lo, int hi) {
		// Since array is sorted, an element
		// present in array must be in range
		// defined by corner
		if (hi >= lo && x >= arr[lo] && x <= arr[hi]) {
			int pos = lo + ((hi - lo) / (arr[hi] - arr[lo])) * (x - arr[lo]);

			if (arr[pos] == x)
				return pos;
			else if (arr[pos] > x) // If x is smaller, x is in left sub array
				return interpolationSearch(arr, x, lo, pos - 1);
			else // If x is larger, x is in right sub array
				return interpolationSearch(arr, x, pos + 1, hi);
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr1 = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
		int search1 = 55;
		int index1 = interpolationSearch(arr1, search1, 0, arr1.length - 1);
		JumpSearch.printResult(index1, search1);

	}
}
