package s303n1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
					System.out.println("Introdueix l'índex de l'arbre que vols retirar:");
					int indexArbre = scanner.nextInt();
					if (laFloristeria.retirarArbre(indexArbre)) {
						System.out.println("Arbre retirat correctament.");
					} else {
						System.out.println("No s'ha pogut retirar l'arbre. Si us plau, revisa l'índex introduït.");
					}
				}
				break;
			case 7:
				// Retirar Flor
				if (laFloristeria == null) {
					System.out.println("Has de crear una floristeria primer.");
				} else {
					laFloristeria.mostrarStockFlors();
					System.out.println("Introdueix l'índex de la flor que vols retirar:");
					int indexFlor = scanner.nextInt();
					if (laFloristeria.retirarFlor(indexFlor)) {
						System.out.println("Flor retirada correctament.");
					} else {
						System.out.println("No s'ha pogut retirar la flor. Si us plau, revisa l'índex introduït.");
					}
				}
				break;
			case 8:
				// Retirar Decoració
				if (laFloristeria == null) {
					System.out.println("Has de crear una floristeria primer.");
				} else {
					laFloristeria.mostrarStockDecoracions();
					System.out.println("Introdueix l'índex de la decoracio que vols retirar:");
					int indexDecoracio = scanner.nextInt();
					if (laFloristeria.retirarDecoracio(indexDecoracio)) {
						System.out.println("Decoracio retirada correctament.");
					} else {
						System.out.println("No s'ha pogut retirar la decoracio. Si us plau, revisa l'índex introduït.");
					}
				}
				break;
			case 9:
				// Valor Total
				if (laFloristeria == null) {
					System.out.println("Has de crear una floristeria primer.");
				} else {
					double valorTotal = laFloristeria.getValorTotalStock();
					System.out.println("El valor total de la floristeria és: " + valorTotal);
				}
				break;
			case 10:
				// Crear Ticket
				if (laFloristeria == null) {
					System.out.println("Has de crear una floristeria primer.");
				} else {
					Ticket ticket = new Ticket();
					boolean acabarCompra = false;
					while (!acabarCompra) {
						laFloristeria.mostrarStock();
						System.out.println(
								"Escull una categoria (arbre/flor/decoracio) o escriu 'finalitzar' per acabar la compra:");
						String categoria = scanner.nextLine();
						if (categoria.equalsIgnoreCase("finalitzar")) {
							acabarCompra = true;
						} else {
							System.out.println("Introdueix l'índex del producte que vols afegir al ticket:");
							int index = scanner.nextInt();
							scanner.nextLine();

							if (categoria.equalsIgnoreCase("arbre")) {
								Arbre arbre = laFloristeria.getArbre(index);
								if (arbre != null) {
									ticket.afegirElement(arbre, arbre.getPreu());
									System.out.println("Arbre afegit al ticket.");
								} else {
									System.out.println("Índex incorrecte.");
								}
							} else if (categoria.equalsIgnoreCase("flor")) {
								Flor flor = laFloristeria.getFlor(index);
								if (flor != null) {
									ticket.afegirElement(flor, flor.getPreu());
									System.out.println("Flor afegida al ticket.");
								} else {
									System.out.println("Índex incorrecte.");
								}
							} else if (categoria.equalsIgnoreCase("decoracio")) {
								Decoracio decoracio = laFloristeria.getDecoracio(index);
								if (decoracio != null) {
									ticket.afegirElement(decoracio, decoracio.getPreu());
									System.out.println("Decoració afegida al ticket.");
								} else {
									System.out.println("Índex incorrecte.");
								}
							} else {
								System.out.println("Categoria incorrecta. Si us plau, torna a intentar-ho.");
							}
						}
					}
					System.out.println("Compra finalitzada. Resum del ticket: " + ticket);
				}
				break;
			case 11:
				// Llista de Compres
				break;
			case 12:
				// Total Vendes
				break;
			case 13:
				// Guardar dades
				guardarDades(laFloristeria);
				break;
			case 14:
				// Carregar dades
				laFloristeria = carregarDades();
				break;
			case 0:
				sortir = true;
				break;
			default:
				System.out.println("Opció incorrecta. Si us plau, torna a intentar-ho.");
			}
		}
	}

	// Metode per a guardar les dades a un fitxer de text
	public static void guardarDades(Floristeria floristeria) {
		try {
			PrintWriter fitxerSortida = new PrintWriter("dades_floristeria.txt");
			fitxerSortida.println(floristeria.toString());
			fitxerSortida.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error al guardar les dades: " + e.getMessage());
		}
	}

	// Metode per a carregar dades des d'un fitxer de text
	public static Floristeria carregarDades() {
		Floristeria floristeria = null;
		try {
			File fitxerEntrada = new File("dades_floristeria.txt");
			Scanner lectorFitxer = new Scanner(fitxerEntrada);
			if (lectorFitxer.hasNextLine()) {
				String dadesFloristeria = lectorFitxer.nextLine();
			}
			lectorFitxer.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error al carregar les dades: " + e.getMessage());
		}
		return floristeria;
	}

}