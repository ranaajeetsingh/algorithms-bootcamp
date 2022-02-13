package algorithms.searchandsorting.jumpsearch;

public class JumpSearch {
	public static int jumpSearch(int[] arr, int startIndex, int jumpBlock, int data) {
		int endIndex = arr.length > jumpBlock + startIndex ? jumpBlock + startIndex : arr.length;

		if (arr[startIndex + jumpBlock] == data)
			return jumpBlock;
		else if (arr[startIndex + jumpBlock] > data) {
			for (int i = startIndex; i < endIndex; i++) {
				if (arr[i] == data)
					return i;
			}
		} else
			return jumpSearch(arr, startIndex + jumpBlock, jumpBlock, data);
		return -1;
	}

	public static int jumpSearch(int[] arr, int x) {
		int n = arr.length;

		// Finding block size to be jumped
		int step = (int) Math.floor(Math.sqrt(n));

		// Finding the block where element is
		// present (if it is present)
		
		int prev = 0;
		while (arr[Math.min(step, n)-1] < x) {
			prev = step;
			step += step;//(int) Math.floor(Math.sqrt(n));
			if (prev >= n)
				return -1;
		}

		// Doing a linear search for x in block
		// beginning with prev.
		while (arr[prev] < x) {
			prev++;

			// If we reached next block or end of
			// array, element is not present.
			if (prev == Math.min(step, n))
				return -1;
		}

		// If element is found
		if (arr[prev] == x)
			return prev;

		return -1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
		int search1 = 55;
		int index1 = jumpSearch(arr1, 0, 4, search1);
		printResult(index1, search1);
		int index2 = jumpSearch(arr1, search1);
		printResult(index2, search1);
	}

	public static void printResult(int index, int data) {
		if (index == -1)
			System.out.println("Element " + data + " is not present in Array");
		else
			System.out.println("Element " + data + " is present at index " + index);
	}
}
