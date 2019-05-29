import java.util.Scanner;
// importeren van de scanner

public class Galgje {

	private static String[] woorden = { "dehydreren", "banana", "computer", "exogeen", "arbitraal", "excitatie",
			"liquide", "weivlies", "prairie", "necrose", "clipper", "convex", "plebejer", "mecenaat", "cacao",
			"jazzzanger", "sfinx", "Hottentottententententoonstelling", "Qahnaarin", "Dovahkiin",
			"Accountantadministratieconsulent ", "voyant", "zodiak", "aquarium", "aalmoes",
			"Chloorfluorkoolwaterstofverbinding ", "assortiment", "Politicus", "staphylococ", "struikover",
			"Hippopotomonstrosesquippedaliofobie", "attent"
};
private static String woord = woorden[(int) (Math.random() * woorden.length)];
// de code pakt een random integer van de lengte van de array, dus hij pakt een
// woord die verbonden is aan de integer.
private static String ster = new String(new char[woord.length()]).replace("\0", "*");
// zodra een letter goed word geraden word * vervangen door een het juiste
// letter.
// de "*" lengte is gelijk aan de lengte van het woord.
private static int count = 0;
// counter staat op 0
