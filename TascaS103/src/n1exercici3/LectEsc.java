package n1exercici3;

import java.io.*;
import java.util.*;

public class LectEsc {

	public static Map<String, String> lectura(){
		
		Map<String, String> mapa = new HashMap<String, String>();
		BufferedReader br = null;
		
		try {
			// Creem un objecte de tipus File
			File file = new File("C:\\Users\\TeH_h\\Documents\\GitHub\\Especialitzacio\\TascaS103\\src\\n1exercici3\\Countries.txt");// create BufferedReader object from the File
			
			//Creem un objecte BufferedReader de l'arxiu
			br = new BufferedReader(new FileReader(file));
			
			String linea = null;
			
			// Llegim l'arxiu linea per linea
			while ((linea = br.readLine()) != null) {
				
					// Partim les linees amb un espai
					String[] parts = linea.split(" ");
					
					// La primera part es el pais, la segona la capital
					
					String pais = parts[0].trim();
					String capital = parts[1].trim();
					
					// Posem el pais i la capital al HashMap si no estan buids
					if (!pais.equals("") && !capital.equals("")) {
						mapa.put(pais, capital);
						}
					}
			}catch (Exception e){
				e.printStackTrace();
				}finally {
					// Sempre tanquem el reader
					if (br != null) {
						try {
							br.close();
							}
						catch (Exception e) {
						};
						}
					}
		return mapa;
		}
	
	public static void escriptura(String nom, int puntuacio) {

		FileWriter archivo = null;
		PrintWriter pw = null;

		// Gestionem exception
		try {
			archivo = new FileWriter(
					"C:\\Users\\TeH_h\\Documents\\GitHub\\Especialitzacio\\TascaS103\\src\\n1exercici3\\Classificacio.txt");
			pw = new PrintWriter(archivo);

			pw.println(nom + " " + puntuacio);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Tanquem arxiu
				if (archivo != null)
					archivo.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
