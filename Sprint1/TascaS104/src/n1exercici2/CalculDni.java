package n1exercici2;

public class CalculDni {
	
	public char calculDniLletra(int dniNum) {
		// Array amb les lletres del DNI
		char[] dniLletres = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		// Calculem la lletra del DNI a partir del seu número
		int dniLletraInd = dniNum % 23;
		char dniLletra = dniLletres[dniLletraInd];

		return dniLletra;
	}
}
