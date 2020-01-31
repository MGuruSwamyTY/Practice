package practice;

public class SelectionSort {
	public static void main(String args[]) {
		int[] a = { 5, 3, 6, 2, 7, 1 ,4};
		int l = a.length - 1;
		for (int i = 0; i <= l; i++) {
			int index = i;
			for (int j = i + 1; j <= l; j++) {
				if (a[j] < a[index]) {
					index = j;
				} 

			}
			if (i != index) {
				int temp = a[index];
				a[index] = a[i];
				a[i] = temp;
				

			}
			System.out.println(a[i]);

		}
	}         
}
