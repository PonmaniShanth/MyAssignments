package homeassignmentweek1.day1;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a+ " ");
		System.out.println(b+ " ");
		for (int i = 3; i <=8; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c+ " ");
			
		}
		

	}

}
