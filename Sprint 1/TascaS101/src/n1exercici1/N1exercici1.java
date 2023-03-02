package n1exercici1;

import java.util.Scanner;

public class N1exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Quin instrument vols? Introdueix 1 per a Corda, 2 per a Percussio i 3 per a vent.");
			int i = sc.nextInt();
			sc.nextLine();

			String nom;
			int preu;

			switch (i) {

			case 1:
				System.out.println("Introdueix el preu de l'instrument.");
				preu = sc.nextInt();
				sc.nextLine();
				System.out.println("Introdueix el nom de l'instrument.");
				nom = sc.nextLine();

				Corda corda1 = new Corda(nom, preu);
				System.out.println("El teu instrument es un " + corda1.getNom() + " i te un preu de " +corda1.getPreu() + " euros.");
				corda1.tocar();
				break;

			case 2:
				System.out.println("Introdueix el preu de l'instrument.");
				preu = sc.nextInt();
				sc.nextLine();
				System.out.println("Introdueix el nom de l'instrument.");
				nom = sc.nextLine();

				Percussio percu1 = new Percussio(nom, preu);
				System.out.println("El teu instrument es " + percu1.getNom() + " i te un preu de " +percu1.getPreu() + " euros.");
				percu1.tocar();
				break;
			case 3:
				System.out.println("Introdueix el preu de l'instrument.");
				preu = sc.nextInt();
				sc.nextLine();
				System.out.println("Introdueix el nom de l'instrument.");
				nom = sc.nextLine();

				Vent vent1 = new Vent(nom, preu);
				System.out.println("El teu instrument es " + vent1.getNom() + " i te un preu de " + vent1.getPreu() + " euros.");
				vent1.tocar();
				break;
			}
		}
	}

}
