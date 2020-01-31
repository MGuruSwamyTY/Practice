package practice;

public class LinearSearch {
	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 6, 4, 7, 78, 9 };
		int x = 78;
		int result = search(a, x);
		if (result == -1) {
			System.out.println("element is not present in an array");
		} else {
			System.out.println("your search element " + x + " is on index number " + result);
		}
	}

	public static int search(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}

		}
		return -1;
	}
}
