package n1exercici2;

import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class N1exercici2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introdueix el numero de DNI per a calcular la lletra");
		int num = sc.nextInt();

		// Creem un objecte CalculDni amb el número de DNI que entrem per consola
		CalculDni dni = new CalculDni();
		// Cridem el mètode calcularLletra() de l'objecte CalculDni
		char lletraDni = dni.calculDniLletra(num);
		// Printem la lletra calculada
		System.out.println(lletraDni);
		// Tanquem l'Scanner
		sc.close();
	}

	@RunWith(Parameterized.class)
	public class CalculDniTest {
		
		// Atributs per emmagatzemar els paràmetres de cada cas de prova
		private int numDni;
		private char lletraDniEsperada;
		
		// Constructor que rep els paràmetres de cada cas de prova
		public CalculDniTest(int numDni, char lletraDniEsperada) {
			this.numDni = numDni;
			this.lletraDniEsperada = lletraDniEsperada;
		}

		// Mètode estàtic que retorna una col·lecció de dades de prova
	    // En aquest cas un array d'objectes que representen els paràmetres de cada cas de prova
		@Parameterized.Parameters
		public static Collection<Object[]> data() {
			return Arrays.asList(new Object[][] { { 12345678, 'Z' }, { 24681012, 'M' }, { 36912154, 'B' },
					{ 48016937, 'X' }, { 57295683, 'K' }, { 53313812, 'L' }, { 81763542, 'E' }, { 93847120, 'R' },
					{ 10529864, 'A' }, { 20456789, 'F' } });
		}

		// Cas de prova que valida si el càlcul de la lletra del DNI és correcte
		@Test
		public void testCalcularLletra() {
			// Creem un objecte CalculDni amb el número de DNI del cas de prova
			CalculDni dni = new CalculDni();
			// Cridem el mètode calcularLletra() de l'objecte CalculDni
			char lletraDni = dni.calculDniLletra(numDni);
			// Comprovem si la lletra del DNI calculada és igual a la esperada
			assertEquals(this.lletraDniEsperada, lletraDni);

		}
	}
}
