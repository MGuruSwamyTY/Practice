package practice;

import java.util.ArrayList;
import java.util.Iterator;

//adding two array elements divisible by given number 
public class ArraySum implements Clonable{
	public static void main(String args[]) {
		ArrayList a=new ArrayList();
		a.add("sdkkc");
		a.add(10.5);
		Iterator i=a.iterator();
		while(i.hasNext()) {
	
			System.out.println(a);
			i.next();
			a.add("sadc");
		}
		System.out.println(a);
	}
	
}
