package homeassignmentweek3.day2;

public class Uppercase {

	public static void main(String[] args) {
		String letter= "changeme";
		char[] charArray = letter.toCharArray();
		for (int i = 0;i< charArray.length;i++) {
			if (i%2==1) {
				System.out.print(Character.toUpperCase(charArray[i]));
			}else {
					System.out.print(charArray[i]);
				}
		}

	}
	}

