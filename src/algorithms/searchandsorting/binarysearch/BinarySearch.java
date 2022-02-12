package algorithms.searchandsorting.binarysearch;

public class BinarySearch {
	public static int binarySearch(int[] arr, int startIndex, int endIndex, int data) {
		if (endIndex >= startIndex) {
			int mid = startIndex + (endIndex - startIndex) / 2;
			if (arr[mid] == data)
				return mid;
			else if (arr[mid] < data)
				return binarySearch(arr, mid + 1, endIndex, data);
			else if (arr[mid] > data)
				return binarySearch(arr, startIndex, mid - 1, data);
		}
		return -1;
	}

	//	public static int[] subArray(int[] arr, int startIndex, int endIndex) {
//		int[] subArray = new int[endIndex - startIndex + 1];
//		int j = 0;
//		for (int i = startIndex; i <= endIndex; i++) {
//			subArray[j] = arr[i];
//			j++;
//		}
//		return subArray;
//	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
		int search1 = 23;
		int index1 = binarySearch(arr1, 0, arr1.length - 1, search1);
		printResult(index1, search1);
	}

	public static void printResult(int index, int data) {
		if (index == -1)
			System.out.println("Element " + data + " is not present in Array");
		else
			System.out.println("Element " + data + " is present at index " + index);
	}
}
