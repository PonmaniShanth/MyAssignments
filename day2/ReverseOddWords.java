package homeassignmentweek3.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		String letters = "I am a software tester";
        String[] words = letters.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) { 
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        for (String word : words) {
            System.out.print(word + " ");
        }

	}

}
