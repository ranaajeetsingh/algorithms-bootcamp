package algorithms.linearsearch;

public class LinearSearch {
	public static int getIndex(int[] arr, int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };
		int search1 = 110;
		int index1 = getIndex(arr1, search1);
		printResult(index1, search1);

		int[] arr2 = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };
		int search2 = 175;
		int index2 = getIndex(arr2, search2);
		printResult(index2, search2);

	}

	public static void printResult(int index, int data) {
		if (index == -1)
			System.out.println("Element " + data + " is not present in Array");
		else
			System.out.println("Element " + data + " is present at index " + index);
	}
}
