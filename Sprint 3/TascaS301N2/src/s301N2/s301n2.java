package s301N2;

import java.util.Scanner;

public class s301n2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Demanem a l'usuari les dades

		System.out.println("Introdueix el nom:");
		String nom = scanner.nextLine();

		System.out.println("Introdueix els cognoms:");
		String cognoms = scanner.nextLine();

		System.out.println("Introdueix el país de la direcció (espanya o franca):");

		// Implementem gestió d'errors
		String pais;
		while (true) {
			pais = scanner.nextLine().toLowerCase();
			if (pais.equals("espanya") || pais.equals("franca")) {
				break;
			} else {
				System.out.println("Si us plau, introdueix un país vàlid (espanya o franca):");
			}
		}

		System.out.println("Introdueix el carrer:");
		String carrer = scanner.nextLine();

		System.out.println("Introdueix la ciutat:");
		String ciutat = scanner.nextLine();

		System.out.println("Introdueix el codi postal:");
		String codiPostal = scanner.nextLine();

		System.out.println("Introdueix la provincia:");
		String provincia = scanner.nextLine();

		System.out.println("Introdueix el prefix del número de telèfon: (Opcions per a Espanya:+34 i Franca: +33");

		// Implementem gestió d'errors
		String prefix;
		while (true) {
			prefix = scanner.nextLine();
			if (prefix.matches("^\\+\\d{1,3}$")) {
				break;
			} else {
				System.out.println("Si us plau, introdueix un prefix de telèfon vàlid (per exemple: +34):");
			}
		}

		System.out.println("Introdueix el número de telèfon:");
		String numero = scanner.nextLine();

		// Instanciem amb les dades donades

		ContacteFactory contacteFactory = new ContacteFactory();
		Direccio direccio = contacteFactory.crearDireccio(carrer, ciutat, codiPostal, provincia, pais);
		NumeroTelefon numeroTelefon = contacteFactory.crearNumeroTelefon(prefix, numero);

		Contacte contacte = new Contacte(nom, cognoms, direccio, numeroTelefon);

		// Imprimim objecte

		System.out.println("Contacte creat:");
		System.out.println("Nom: " + contacte.getNom());
		System.out.println("Cognoms: " + contacte.getCognoms());
		System.out.print("Direcció: ");
		contacte.getDireccio().imprimirDireccio();
		System.out.print("Telèfon: ");
		contacte.getNumeroTelefon().imprimirNumeroTelefon();

		scanner.close();

	}

}
