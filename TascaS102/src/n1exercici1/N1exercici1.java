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
		
		int[] array = new int[10];

		try {
		  // Intentem accedir a l'element amb índex 11, que és fora dels límits de l'array.
		  int element = array[11];
		} catch (ArrayIndexOutOfBoundsException e) {
		  // Capturam la excepció.
		  System.out.println("S'ha produït una excepció ArrayIndexOutOfBoundsException: " + e.getMessage());
		}

	}

}
