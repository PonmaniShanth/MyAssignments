package homeassignmentweek1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare an array value
				int [] num1 = {1, 4,3,2,8, 6, 7};

				// sum the array 
				int sum1=0;

				// loop through
               for(int i =0;i<=num1.length-1;i++) {
            	   sum1 = sum1+num1[i];
				}
				 
               //assigning the variable sum2 is 0
				int sum2 =0;

				// assume according to num1 array length is 8 bcz that max no is 8

				// using another for loop 
				for(int j =1;j<=8;j++) {
					
					// sum the values
					sum2=sum2+j;
				}
				System.out.println("Sum2 value is : " +sum2);
				System.out.println("Sum1 value is : " +sum1);

				// find the missing  element 

				System.out.println("Find the missing element is :" + (sum2-sum1));

			}

		}