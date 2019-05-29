import java.util.Scanner;
//inporteren van de scanner

public class Galgje {

	private static String[] words = { "terminator", "banana", "computer", "cow", "rain", "water" };
	// Invoer van de arrays.(de bestanden moeten worden ingeladen in een
	// text-bestand)
	private static String word = words[(int) (Math.random() * words.length)];
	// de code pakt een random integer van de lengte van de array, dus hij pakt een
	// woord die verbonden is aan de integer.
	private static String sterretje = new String(new char[word.length()]).replace("\0", "*");
	// zodra een letter goed word geraden word * vervangen door een het juiste
	// letter.
	// de "*" lengte is gelijk aan de lengte van het woord.
	private static int count = 0;
	// counter staat op 0.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// toevoegen van de scanner

		while (count < 7 && sterretje.contains("*")) {
			// zolang de counter kleiner is dan 7 en de sterretje contrains "*" blijf
			// loopen.
			System.out.println("Guess any letter in the word");
			// Print text
			System.out.println(sterretje);
			// Print de "*"
			String guess = sc.next();
			// volgende invoer
			hang(guess);
			// terug roepen van de methode hang.
		}
		sc.close();
		// close scanner einde van het programma
	}

	public static void hang(String guess) {
		// guess in de vorige methode geef in mee aan de nieuwe
		String newsterretje = "";
		// String van newsterretje is leeg
		for (int i = 0; i < word.length(); i++) {
			// Loopt de code door de lengte van het random gekozen word in de array
			if (word.charAt(i) == guess.charAt(0)) {
				// kijkt naar de positie van de letter
				newsterretje += guess.charAt(0);
				// newasterik = newsterretje + guess.charAt(0)
			} else if (asterisk.charAt(i) != '*') {
				//
				newsterretje += word.charAt(i);
				//
			} else {
				newsterretje += "*";
			}
		}

		if (sterretje.equals(newsterretje)) {
			count++;
			hangmanImage();
		} else {
			sterretje = newsterretje;
		}
		if (sterretje.equals(word)) {
			System.out.println("Correct! You win! The word was " + word);
		}
	}

	public static void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println("4 chances left");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("3 chances left");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("2 chances left");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("2 chances left");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("1 chances left");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("0 chances left");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (count == 7) {
			System.out.println("GAME OVER!");
			System.out.println("no chances left");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("GAME OVER! The word was " + word);
		}
	}
}