package homeassignmentweek3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {
public static void main(String[] args) {
		int[] num = {3, 2, 11, 4, 6, 7};
		int[] num1 = {1, 2, 8, 4, 9, 7};
		List<Integer> value = new ArrayList<Integer>();
		List<Integer> value1 = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			value.add(num[i]);
		}
	for (int j = 0; j < num1.length; j++) {
		value1.add(num1[j]);
	}
	System.out.println(value);
	Collections.sort(value);
	System.out.println(value);
	System.out.println(value1);
	Collections.sort(value1);
	System.out.println(value1);
	for (int i = 0; i < value.size()-1; i++) {
		for (int j = 0; j < value1.size()-1; j++) {
			if (value.get(i)==value1.get(j)) {
				System.out.println("Equal values : " +value.get(i));
			}
	}
	}
	}
}
