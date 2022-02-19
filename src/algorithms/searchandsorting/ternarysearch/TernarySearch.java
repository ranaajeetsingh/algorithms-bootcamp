package algorithms.searchandsorting.ternarysearch;

public class TernarySearch {

	public static int ternarySearch(int[] arr, int l, int r, int x) {
		int mid1 = l + (r - l) / 3;
		int mid2 = r - (r - l) / 3;

		if (arr[mid1] == x)
			return mid1;
		else if (arr[mid2] == x)
			return mid2;
		else if (x < arr[mid1])
			return ternarySearch(arr, l, mid1 - 1, x);
		else if (x > arr[mid2])
			return ternarySearch(arr, mid2 + 1, r, x);
		else
			return ternarySearch(arr, mid1 + 1, mid2 - 1, x);
	}
	
	public static void main(String[] args) {
		System.out.println(ternarySearch(new int[] {1,2,3,4,5,6,7,8}, 0, 7, 4));
	}
}
