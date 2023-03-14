package s301n1;

import java.util.*;

public class Undo {
	
    private static Undo instance = null;
    // Llistat per emmagatzemar les comandes introduïdes
    private List<String> commandList;

    // Constructor privat per evitar que es creïn instàncies de la classe amb 'new'
    private Undo() {
        commandList = new ArrayList<>();
    }

    // Mètode static per obtenir la instància única de la classe
    public static Undo getInstance() {
        // Si la instància no s'ha creat encara, la creem
        if (instance == null) {
            instance = new Undo();
        }
        // Retornem la instància única (Singleton)
        return instance;
    }

    public void addCommand(String command) {
        commandList.add(command);
    }

    public void removeCommand(int index) {
        commandList.remove(index);
    }

    // Mètode per mostrar la llista de comandes
    public void listCommands() {
        System.out.println("Command history:");
        for (int i = 0; i < commandList.size(); i++) {
            System.out.println(i + ": " + commandList.get(i));
        }
    }
}
