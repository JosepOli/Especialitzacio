package s301n1;

import java.util.*;

public class Undo {
	
    private static Undo instance = null;
    // Llistat per emmagatzemar les comandes introduïdes
    private List<String> comandaList;

    // Constructor privat per evitar que es creïn instàncies de la classe amb 'new'
    private Undo() {
        comandaList = new ArrayList<>();
    }

    // Mètode static per obtenir la instància única de la classe
    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        // Retornem la instància única (Singleton)
        return instance;
    }

    public void addComanda(String comanda) {
        comandaList.add(comanda);
    }

    public void removeComanda(int index) {
        comandaList.remove(index);
    }

    // Mètode per mostrar la llista de comandes
    public void listComandes() {
        System.out.println("Historic de comandes:");
        for (int i = 0; i < comandaList.size(); i++) {
            System.out.println(i + ": " + comandaList.get(i));
        }
    }
}
