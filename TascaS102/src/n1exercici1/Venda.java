package n1exercici1;

import java.util.ArrayList;

public class Venda {

	ArrayList<Producte> llistatProductes = new ArrayList<Producte>();
	private double preuTotal;

	public Venda(ArrayList<Producte> llistatProductes) {
		this.llistatProductes = llistatProductes;
	}

	public void calcularTotal() throws VendaBuidaException {
		if (llistatProductes.isEmpty()) {
			throw new VendaBuidaException("Per fer una venda primer has d’afegir productes.");
		} else {

			int i = 0;
			int size = llistatProductes.size();

			while (i < size) {
				preuTotal += llistatProductes.get(i).getPreu();
				i++;
			}
		}

	}

	public ArrayList<Producte> getLlistatProductes() {
		return llistatProductes;
	}

	public void setLlistatProductes(ArrayList<Producte> llistatProductes) {
		this.llistatProductes = llistatProductes;
	}

	public double getPreuTotal() {
		return preuTotal;
	}

	public void setPreuTotal(double preuTotal) {
		this.preuTotal = preuTotal;
	}

}
