package s303n1;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

	private List<Object> elementsComprats;
	private double importTotal;
	
	//Constructor
	public Ticket() {
		elementsComprats = new ArrayList<>();
		importTotal = 0;
	}
	//Afegim element a la llista i sumem el preu a l'import total
	public void afegirElement (Object element, double preu) {
		elementsComprats.add(element);
		importTotal += preu;
	}
	
	
	
}
