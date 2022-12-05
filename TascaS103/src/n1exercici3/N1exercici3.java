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
		
		Random generador = new Random();
		
		lecturaHash = LectEsc.lectura();
		
		System.out.println(lecturaHash);
		
		for(int i = 0; i<10; i++) {
			
		}
		
		LectEsc.escriptura(nom, puntuacio);
		
	}
	
	public static boolean busquedaCapital() {
		
		
		
		return true;
	}

}
