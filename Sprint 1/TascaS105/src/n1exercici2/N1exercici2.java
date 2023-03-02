package n1exercici2;

import java.io.*;
import java.util.*;
import java.text.*;

public class N1exercici2 {

	public static void main(String[] args) {
		// Primer comprovem que s'ha especificat un directori com a argument
		if (args.length != 1) {
			System.out.println("S'ha de especificar un directori com a argument");
			return;
		}

		// Llistem els fitxers i directoris del directori especificat
		listaDirectoris(new File(args[0]), 0);
	}

	// Mètode per a llistar els directoris
	private static void listaDirectoris(File directori, int nivell) {
		// Obtenim els fitxers i directoris del directori especificat (argument en
		// posició zero)
		File[] fitxers = directori.listFiles();

		// Si no hi ha fitxers i directoris, sortim
		if (fitxers == null) {
			return;
		}

		// Ordenem els fitxers i directoris alfabèticament
		Arrays.sort(fitxers);

		// Llistem els fitxers i directoris del directori demanat
		for (File fitxer : fitxers) {
			// Imprimim el nom del fitxer o directori i si és un directori o un fitxer li
			// afegim la D o F segons escaigui
			for (int i = 0; i < nivell; i++) {
				System.out.print("  ");
			}
			System.out.print(fitxer.getName());
			if (fitxer.isDirectory()) {
				System.out.println(" (D)");
			} else {
				System.out.println(" (F)");
			}
			//Utilitzem la classe SimpleDateFormat per a passar de milisegons a un format horari que s'entengui
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			System.out.println(" Última data de modificació: " + sdf.format(fitxer.lastModified()));
			
			// Si el fitxer o directori és un directori, recorrem-lo recursivament
			if (fitxer.isDirectory()) {
				listaDirectoris(fitxer, nivell + 1);
			}
		}
	}
}