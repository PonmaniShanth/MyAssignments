package homeassignmentweek3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text =  "We learn Java basics as part of java sessions in java week1"; 
		String[] split = text.split(" ");
		int count;
		for (int i = 0; i < split.length; i++) {
	         count = 1;
	         for (int j = i + 1; j < split.length; j++) {
	             if (split[i].equals(split[j])) {
	                 split[j] = "";
	                 count++;
	             }
	         }
	         if (count > 1) {
	             split[i] = "";
	         }
	     }

	     for (String Split : split) {
	         System.out.print(Split + " ");
	     }

	}

}
