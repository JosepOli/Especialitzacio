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
				break;
			case 3:
				// Afegir Flor
				break;
			case 4:
				// Afegir Decoració
				break;
			case 5:
				// Stock
				break;
			case 6:
				// Retirar Arbre
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