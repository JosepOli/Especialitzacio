package n1exercici4;

import java.io.*;
import java.text.*;
import java.util.*;

public class N1exercici4 {

	public static void main(String[] args) {

		// Primer comprovem que s'han especificat un directori i un fitxer com a
		// arguments
		if (args.length != 2) {
			System.out.println("S'han de especificar un directori i un fitxer com a arguments");
			return;
		}

		// Obtenim els arguments
		String directori = args[0];
		String fitxer = args[1];

		try {
			// Obrim el fitxer per escriure
			PrintWriter writer = new PrintWriter(fitxer);
			BufferedWriter buffer = new BufferedWriter(writer);

			// Llistem els fitxers i directoris del directori especificat
			listaDirectoris(new File(directori), 0, buffer);

			// Tanquem el fitxer
			buffer.close();
		} catch (Exception e) {
			System.out.println("S'ha produït un error en intentar escriure en el fitxer");
		}
	}

	// Mètode per a llistar els directoris
	private static void listaDirectoris(File directori, int nivell, BufferedWriter buffer) throws IOException {
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
				buffer.write("  ");
			}
			buffer.write(fitxer.getName());
			if (fitxer.isDirectory()) {
				buffer.write(" (D)");
			} else {
				buffer.write(" (F)");
			}
			// Utilitzem la classe SimpleDateFormat per a passar de milisegons a un format
			// horari que s'entengui
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			buffer.write(" Última data de modificació: " + sdf.format(fitxer.lastModified()));

			//Afegim la funcionalitat de llegir qualsevol fitxer TXT i mostrar el contingut per consola
			if (fitxer.getName().toLowerCase().endsWith(".txt")) {
				FileReader fr = new FileReader(fitxer);
				BufferedReader br = new BufferedReader(fr);
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
				br.close();
			}
			buffer.newLine();

			// Si el fitxer o directori és un directori, recorrem-lo recursivament
			if (fitxer.isDirectory()) {
				listaDirectoris(fitxer, nivell + 1, buffer);
			}
		}
	}

}
