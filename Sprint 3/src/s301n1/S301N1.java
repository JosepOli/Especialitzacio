package s301n1;

import java.util.Scanner;

public class S301N1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Obtenim la instància única de la classe Undo
        Undo undo = Undo.getInstance();
        
        Scanner scanner = new Scanner(System.in);
        
        // Bucle infinit per llegir comandes
        while (true) {
            // Mostrem un missatge per a demanar a l'usuari que introdueixi una comanda
            System.out.print("Introdueix la teva comanda: ");
            // Llegim la comanda del teclat
            String comanda = scanner.nextLine();
            // Si l'usuari introdueix "exit", sortim del bucle
            if (comanda.equals("exit")) {
                break;
            }
            // Si l'usuari introdueix "history", mostrem la llista de comandes
            if (comanda.equals("history")) {
                undo.listComandes();
            }
            // Si l'usuari introdueix una altra comanda, l'afegim a la llista
            else {
                undo.addComanda(comanda);
            }
        }
    }

}
