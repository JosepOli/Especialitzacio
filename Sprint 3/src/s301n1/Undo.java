package s301n1;

import java.util.*;

public class Undo {
    private static Undo instance;
    private List<Comanda> historial;

    private Undo() {
        historial = new ArrayList<>();
    }

    // Mètode per obtenir l'única instància de la classe "Undo" (patró Singleton)
    public static synchronized Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    // Mètode per afegir una nova comanda a l'historial
    public void afegirComanda(Comanda comanda) {
        historial.add(comanda);
    }

    // Mètode per eliminar l'última comanda de l'historial
    public void eliminarUltimaComanda() {
        if (historial.size() > 0) {
            historial.remove(historial.size() - 1);
        }
    }

    // Mètode per obtenir l'historial complet de comandes
    public List<Comanda> getHistorial() {
        return historial;
    }
}