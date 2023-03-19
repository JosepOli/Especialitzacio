package s301n2;

import java.util.ArrayList;

//Implementació genèrica d'un número de telèfon, que pot adaptar-se a qualsevol país

public class NumTelefonGeneric implements NumTelefon {
	private String numTelefon;
	private String pais;

	// Llista de països i prefixos
	private static ArrayList<String[]> paisosPrefixos = new ArrayList<String[]>() {
		{
			add(new String[] { "EEUU", "+1" });
			add(new String[] { "Espanya", "+34" });
			add(new String[] { "França", "+33" });
			// Afegir més països i prefixos aquí si cal
		}
	};

	public NumTelefonGeneric(String numTelefon, String pais) {
		this.numTelefon = numTelefon;
		this.pais = pais;
	}

	// Retorna el número de telèfon formatejat segons el format del país
	public String getNumTelefonFormatejat() {
		String prefix = "";
		boolean prefixTrobat = false;
		int i = 0;
		// Busca el prefix del país
		while (i < paisosPrefixos.size() && !prefixTrobat) {
			String[] paisPrefix = paisosPrefixos.get(i);
			if (paisPrefix[0].equals(pais)) {
				prefix = paisPrefix[1];
				prefixTrobat = true;
			}
			i++;
		}
		// Formateja el número de telèfon
		String numTelefonFormat = prefix + " " + numTelefon.substring(0, 3) + " " + numTelefon.substring(3, 6) + " "
				+ numTelefon.substring(6);
		return numTelefonFormat;
	}
}