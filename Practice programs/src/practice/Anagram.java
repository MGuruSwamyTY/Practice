package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static int main(String args[]) {
		System.out.println("&&&&&&&&&&&");
		Scanner scn = new Scanner(System.in);
		String a = scn.nextLine();
		String b = scn.nextLine();
		System.out.println("enter two strings");

		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		boolean z;
		z = Arrays.equals(c, d);
		if (z == true) {
			System.out.println("anagram");
		} else {
			System.out.println("no a anagram");
		}
		return 10;
	}
}
