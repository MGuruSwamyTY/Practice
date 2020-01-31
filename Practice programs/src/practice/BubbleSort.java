package practice;

public class BubbleSort {
	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int b = a.length - 1;

		sort(a, b);
		printarray(a, b);

	}

	public static void sort(int a[], int l) {
		int i, j, temp;
		for (i = 0; i <= l - 1; i++) {
			for (j = 0; j <= l - i - 1; j++) {

				if (a[j] >= a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				// System.out.print(a[j]);
			}
		}

	}

	public static void printarray(int arr[], int size) {
		for (int i = 0; i <= size; i++) {
			System.out.print(arr[i]);
		}
	}

}
