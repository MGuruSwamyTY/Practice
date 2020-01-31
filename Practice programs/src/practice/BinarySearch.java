package practice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 9 };
		Arrays.sort(arr);

		int find = 10;

		System.out.println("jhvsbcu");
		int result = search(arr, find);
		System.out.println("jhvsbcu");
		if (result == -1) {
			System.out.println("element not found");
		} else {
			System.out.println("element is " + result);
		}
	}

	public static int search(int[] arr, int x) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else if (arr[mid] > x) {
				high = mid - 1;
			}
		}
		return -1;

	}
}