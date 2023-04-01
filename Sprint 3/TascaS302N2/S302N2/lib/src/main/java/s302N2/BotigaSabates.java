package s302N2;

public class BotigaSabates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  PassarellaPagament passarellaPagament = new PassarellaPagament();
	        double importPagament = 100.0;

	        //Implementem callback emprant lambda
	        Callback callback = resultat -> {
	            if (resultat) {
	                System.out.println("El pagament s'ha realitzat correctament.");
	            } else {
	                System.out.println("El pagament no s'ha pogut realitzar.");
	            }
	        };
	}

}
