package s301n1;

import java.util.*;

public class S301N1 {

	public static void main(String[] args) {
		Undo undo = Undo.getInstance();
		Scanner scanner = new Scanner(System.in);
		String opcio;

		do {
			// Mostrem les opcions disponibles
			System.out.println("Opcions:");
			System.out.println("1. Afegir comanda");
			System.out.println("2. Eliminar darrera comanda");
			System.out.println("3. Mostrar historial");
			System.out.println("4. Sortir");

			// Llegim l'opció introduïda per l'usuari
			opcio = scanner.nextLine();

			// Executem l'acció corresponent segons l'opció introduïda
			switch (opcio) {
			case "1":
				System.out.println("Introdueix la comanda:");
				String nomComanda = scanner.nextLine();
				undo.afegirComanda(new Comanda(nomComanda));
				System.out.println("Comanda afegida a l'historial");
				break;
			case "2":
				undo.eliminarUltimaComanda();
				System.out.println("Darrera comanda eliminada de l'historial");
				break;
			case "3":
				List<Comanda> historial = undo.getHistorial();
				if (historial.size() == 0) {
					System.out.println("L'historial està buit");
				} else {
					System.out.println("Historial:");
					for (Comanda comanda : historial) {
						System.out.println(comanda.getNom());
					}
				}
				break;
			case "4":
				System.out.println("Adéu!");
				break;
			default:
				System.out.println("Opció invàlida");
				break;
			}

			System.out.println();
		} while (!opcio.equals("4"));
	}
}
