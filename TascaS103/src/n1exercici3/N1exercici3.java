package n1exercici3;

import java.util.*;

public class N1exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> lecturaHash = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		int puntuacio = 0;

		System.out.println("Introdueix el nom d'usuari.");
		String nom = sc.nextLine();

		lecturaHash = LectEsc.lectura();

		// Busquem paisos de forma aleatoria
		for (int i = 0; i < 10; i++) {
			Random random = new Random();

			// Passem els valors de key a una array per a poderlos agafar de manera
			// aleatoria
			Object[] pais = lecturaHash.keySet().toArray();
			String randomPais = (String) pais[random.nextInt(pais.length)];

			// Donem el valor de la capital associat al pais aleatori
			String capitalPaisRandom = lecturaHash.get(randomPais);

			System.out.println("Introdueix la capital del pais: " + randomPais + "\n");
			String entrada = sc.nextLine();
			if (entrada.equalsIgnoreCase(capitalPaisRandom))
				puntuacio++;

		}

		LectEsc.escriptura(nom, puntuacio);

	}

}
