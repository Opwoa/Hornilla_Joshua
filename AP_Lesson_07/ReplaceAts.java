import java.util.Scanner;

public class ReplaceAts {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String sentence = keyboard.nextLine();

		System.out.println(replace(sentence));
	}
	
	public static String replace(String sent) {
		while (sent.contains("a")) {
			sent = sent.substring(0, sent.indexOf("a")) + "@" + sent.substring(sent.indexOf("a") + 1);
		}
		return sent;
	}
}