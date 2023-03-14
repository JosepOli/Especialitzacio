package s301n1;

import java.util.Scanner;

public class S301N1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Obtenim la instància única de la classe Undo
        Undo undo = Undo.getInstance();
        
        Scanner scanner = new Scanner(System.in);
        // Bucle infinit per llegir comandes de l'usuari
        while (true) {
            // Mostrem un missatge per demanar a l'usuari que introdueixi una comanda
            System.out.print("Introdueix una comanda: ");
            // Llegim la comanda del teclat
            String command = scanner.nextLine();
            // Si l'usuari introdueix "exit", sortim del bucle
            if (command.equals("exit")) {
                break;
            }
            // Si l'usuari introdueix "history", mostrem la llista de comandes
            if (command.equals("history")) {
                undo.listCommands();
            }
            // Si l'usuari introdueix una altra comanda, l'afegim a la llista
            else {
                undo.addCommand(command);
            }
        }
    }
	}

}
