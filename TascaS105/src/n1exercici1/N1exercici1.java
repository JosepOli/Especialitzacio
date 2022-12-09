package n1exercici1;

import java.io.*;
import java.util.*;

public class N1exercici1 {


	public class LlistaDirectoris {
		  // Atribut que representa el directori a llistar
		  private File directori;

		  // Constructor que reb el path del directori com a paràmetre
		  // i inicialitza l'atribut directori
		  public LlistaDirectoris(String path) {
		    this.directori = new File(path);
		  }

		  // Mètode que retorna el contingut del directori ordenat
		  // alfabèticament
		  public String[] llistaAlfabeticament() {
		    // Obtenim el contingut del directori com a String array
		    String[] contingut = directori.list();

		    // Ordenem l'array alfabèticament
		    Arrays.sort(contingut);

		    // Retornem l'array ordenada
		    return contingut;
		  }
		}
}
