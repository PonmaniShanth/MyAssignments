package homeassignmentweek3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		  int[] num=  {1, 2, 3, 4, 10, 6, 8};
		   List<Integer> value=new ArrayList<Integer>();
		   for (int i = 0; i < num.length-1; i++) {
		   value.add(num[i]);
		   }   
	Collections.sort(value);
	
for(int i = 0; i < value.size()-1; i++) {
	int firstValue = value.get(i);
	int secondValue = value.get(i+1);
		if(firstValue+1 != secondValue); {
			System.out.println("Missing Numbers :"+(firstValue+1));
		}
	}
	}
}
