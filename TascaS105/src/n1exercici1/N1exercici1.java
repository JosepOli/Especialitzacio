package n1exercici1;

import java.io.*;
import java.util.*;

public class N1exercici1 {

	public static void main(String[] args) {
		// Primer comprovem que s'ha especificat un directori com a argument
		if (args.length != 1) {
			System.out.println("S'ha de especificar un directori com a argument");
			return;
		}

		// Obtenim els fitxers del directori especificat (argument en posició zero)
		File directori = new File(args[0]);
		File[] fitxers = directori.listFiles();

		// Ordenem els fitxers alfabèticament
		Arrays.sort(fitxers);

		// Llistem els fitxers del directori
		for (File fitxer : fitxers) {
			System.out.println(fitxer.getName());
		}
	}
}
