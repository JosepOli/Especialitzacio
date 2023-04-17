package s303n1;

import java.util.Scanner;

public class S303N1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		boolean sortir = false;
		Floristeria laFloristeria = null;

		while (!sortir) {
			System.out.println("Escull una opció:");
			System.out.println("1. Crear Floristeria");
			System.out.println("2. Afegir Arbre");
			System.out.println("3. Afegir Flor");
			System.out.println("4. Afegir Decoració");
			System.out.println("5. Stock");
			System.out.println("6. Retirar Arbre");
			System.out.println("7. Retirar Flor");
			System.out.println("8. Retirar Decoració");
			System.out.println("9. Valor Total");
			System.out.println("10. Crear Ticket");
			System.out.println("11. Llista de Compres");
			System.out.println("12. Total Vendes");
			System.out.println("0. Sortir");

			int opcio = scanner.nextInt();

			switch (opcio) {
			case 1:
				// Crear Floristeria
				System.out.println("Introdueix el nom de la floristeria:");
				String nom = scanner.nextLine();
				laFloristeria = new Floristeria(nom);
				System.out.println("Floristeria " + nom + " creada.");
				break;
			case 2:
				// Afegir Arbre
				if (laFloristeria == null) {
					System.out.println("Has de crear una floristeria primer.");
				} else {
					System.out.println("Introdueix l'alçada de l'arbre:");
					double altura = scanner.nextDouble();
					System.out.println("Introdueix el preu de l'arbre:");
					double preuArbre = scanner.nextDouble();
					scanner.nextLine();
					Arbre arbre = new Arbre(altura, preuArbre);
					laFloristeria.afegirArbre(arbre);
					System.out.println("Arbre afegit.");
				}
				break;
			case 3:
				// Afegir Flor
				if (laFloristeria == null) {
					System.out.println("Has de crear una floristeria primer.");
				} else {
					System.out.println("Introdueix el color de la flor:");
					String color = scanner.nextLine();
					System.out.println("Introdueix el preu de la flor:");
					double preuFlor = scanner.nextDouble();
					scanner.nextLine();
					Flor flor = new Flor(color, preuFlor);
					laFloristeria.afegirFlor(flor);
					System.out.println("Flor afegida.");
				}
				break;
			case 4:
				// Afegir Decoració
				if (laFloristeria == null) {
					System.out.println("Has de crear una floristeria primer.");
				} else {
					boolean ismaterial = false;
					String material = "";
					while (!ismaterial) {
						System.out.println("Introdueix el tipus de material (fusta/plastic):");
						material = scanner.nextLine();
						if (material.equalsIgnoreCase("plastic") || material.equalsIgnoreCase("fusta")) {
							ismaterial = true;
						}
					}
					System.out.println("Introdueix el preu de la decoració:");
					double preuDecoracio = scanner.nextDouble();
					scanner.nextLine();
					Decoracio.TipusDeMaterial tipusMaterial = Decoracio.TipusDeMaterial.valueOf(material.toLowerCase());
					Decoracio decoracio = new Decoracio(tipusMaterial, preuDecoracio);
					laFloristeria.afegirDecoracio(decoracio);
					System.out.println("Decoració afegida.");
				}
				break;
			case 5:
				// Stock
				if (laFloristeria == null) {
					System.out.println("Has de crear una floristeria primer.");
				} else {
					System.out.println("Stock:");
					laFloristeria.mostrarStock();

				}
				break;
			case 6:
				// Retirar Arbre
				if (laFloristeria == null) {
					System.out.println("Has de crear una floristeria primer.");
				} else {
					laFloristeria.mostrarStockArbres();
					System.out.println("Introdueix l'índex de l'arbre a retirar:");
					int index = scanner.nextInt();
					scanner.nextLine(); // Per consumir el newline restant després de nextInt()
					laFloristeria.retirarArbre(index, Arbre.class);
					System.out.println("Arbre retirat.");
				}
				break;
			case 7:
				// Retirar Flor
				break;
			case 8:
				// Retirar Decoració
				break;
			case 9:
				// Valor Total
				break;
			case 10:
				// Crear Ticket
				break;
			case 11:
				// Llista de Compres
				break;
			case 12:
				// Total Vendes
				break;
			case 0:
				sortir = true;
				break;
			default:
				System.out.println("Opció incorrecta. Si us plau, torna a intentar-ho.");
			}
		}
	}
}