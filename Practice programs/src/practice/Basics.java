package practice;

import java.util.Scanner;

public class Basics {

	public static void main(String args[]) {
		System.out.println("Hello lets starts");
		System.out.println("Addition of two numbers program");
		Basics.addnum(10, 20);
		ifelseChecking();
		
	}
	public static int addnum(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	public static void ifelseChecking() {
		Scanner s=new Scanner(System.in);
		int marksGot=s.nextInt();
		int passmarks =40;
		if(marksGot>passmarks) {
			System.out.println("Done");
		}
		else if(marksGot<passmarks) {
			System.out.println("sorry");
			
		}
	}
}
