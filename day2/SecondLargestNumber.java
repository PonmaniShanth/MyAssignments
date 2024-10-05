package homeassignmentweek3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] num= {3,2,11,4,6,7};
			List<Integer> value=new ArrayList<Integer>();
			for (int i = 0; i < num.length; i++) {
				value.add(num[i]);
			}
		Collections.sort(value);
		Integer integer = value.get(4);
		System.out.println("Last second number : "+integer);
		}

	}

