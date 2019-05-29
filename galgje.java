import java.util.Scanner;
// importeren van de scanner

public class galgje {

	private static String[] woorden = { "dehydreren", "banana", "computer", "exogeen", "arbitraal", "excitatie",
			"liquide", "weivlies", "prairie", "necrose", "clipper", "convex", "plebejer", "mecenaat", "cacao",
			"jazzzanger", "sfinx", "Hottentottententententoonstelling", "Qahnaarin", "Dovahkiin",
			"Accountantadministratieconsulent ", "voyant", "zodiak", "aquarium", "aalmoes",
			"Chloorfluorkoolwaterstofverbinding ", "assortiment", "Politicus", "staphylococ", "struikover",
			"Hippopotomonstrosesquippedaliofobie", "attent" };
	private static String woord = woorden[(int) (Math.random() * woorden.length)];
	// de code pakt een random integer van de lengte van de array, dus hij pakt een
	// woord die verbonden is aan de integer.
	private static String ster = new String(new char[woord.length()]).replace("\0", "*");
	// zodra een letter goed word geraden word * vervangen door een het juiste
	// letter.
	// de "*" lengte is gelijk aan de lengte van het woord
	private static int count = 0;
	// counter staat op 0

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// toevoegen van de scanner
		while (count < 5 && ster.contains("*")) {
		// zolang de counter kleiner is dan 5 en de asterik contrains "*" blijf loopen.
			System.out.println("Raad een letter van het woord!");
			// Print text
			System.out.println(ster);
			//Print de "*"
			char raad = sc.next().charAt(0);
			// volgende invoer
			galg(raad);
			// terug roepen van de methode hang.
		}
		sc.close();
		// close scanner einde van het programma
	}
	public static void galg(char raad) {
        //raad in de vorige methode word mee gegeven aan deze methode.
        String nieuwester = "";
        for (int i = 0; i < woord.length(); i++)
            //loopt de code door de lengte van het random gekozen woord in de array "woorden"
            if (woord.charAt(i) == raad) {
                // kijkt naar positie waar de letter op staat en of die gelijk is aan het letter van raad.
            } else if (ster.charAt(i) != '*') {
                nieuwester += woord.charAt(i);
                // de nieuwester = "" + woord.char(i);
            } else {
                nieuwester += "*";
            }
        if (ster.equals(nieuwester)) {
            count++;
            //als de input niet klopt blijft de ster en de nieuwester gelijk.
            galgteken();
        } else {
            ster = nieuwester;
            // als de input wel klopt  en ze zijn hetzelfde veranderd de ster naar de nieuwestesterr
        }
        if (ster.equals(woord)) {
            System.out.println("Correct! het woord is geraden ! The woord was " + woord);
            //als ster gelijk is aan het woord
        }
    }
 public static void galgteken(){
        if (count == 1) {
            System.out.println("Fout, probeer opnieuw");
            System.out.println("4 beurten over");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 2) {
            System.out.println("Fout, probeer opnieuw");
            System.out.println("3 beurten over");
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
            System.out.println("Fout, probeer opnieuw");
            System.out.println("2 beurten over");
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
            System.out.println("Fout, probeer opnieuw");
            System.out.println("1 beurt over");
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
            System.out.println("GAME OVER!");
            System.out.println("0 beurten over");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + woord);
        }
    }
}