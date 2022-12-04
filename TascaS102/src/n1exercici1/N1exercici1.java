package n1exercici1;

import java.util.ArrayList;

public class N1exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Producte> llistatProductes = new ArrayList<Producte>();

		Producte llet = new Producte("Llet", 1);
		Producte farina = new Producte("Farina", 2);

		// Comentar les dues properes linees per a comprovar exception
		llistatProductes.add(llet);
		llistatProductes.add(farina);

		Venda venda = new Venda(llistatProductes);

		// Calculem el preu total
		try {
			venda.calcularTotal();
		} catch (VendaBuidaException e) {
			e.printStackTrace();
		}

		System.out.println("El preu total es: " + venda.getPreuTotal());

	}

}
