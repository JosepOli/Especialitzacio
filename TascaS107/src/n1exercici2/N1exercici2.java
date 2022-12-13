package n1exercici2;

public class N1exercici2 {

	// Suprimim els warnings de tipus deprecation
	@SuppressWarnings("deprecation")

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciem un treballador de la classe Treballador i cridem el mètode
		// calcularSou i li passem 160 hores treballades
		Treballador treballador = new Treballador("Joan", "Vendrell", 10);
		System.out.println("El sou del treballador aquest mes es de: " + treballador.calcularSou(160) + " euros.");

		// Instanciem un treballador de la classe TreballadorPresencial i cridem el
		// mètode calcularSou i li passem com abans 160 hores treballades. Com que té
		// l'atribut static benzina 150, el valor de sou es 150 euros més gran que en el
		// cas anterior. A més a més, cridem el mètode calcularSouAntic
		TreballadorPresencial treballadorP = new TreballadorPresencial("Albert", "Guasch", 10);
		System.out.println("El sou del treballador presencial aquest mes es de: " + treballadorP.calcularSou(160)
				+ " euros. El sou antic era de: " + treballadorP.calcularSouAntic(160) + " euros.");

		// Instanciem un treballador de la classe TreballadorOnline i cridem el
		// mètode calcularSou i li passem com abans 160 hores treballades. Com que té
		// l'atribut final tarifaPlana 30, el valor de sou es 30 euros més gran que en
		// el cas original. A més a més, cridem el mètode calcularSouAntic
		TreballadorOnline treballadorO = new TreballadorOnline("Josep", "Olive", 10);
		System.out.println("El sou del treballador online aquest mes es de: " + treballadorO.calcularSou(160)
				+ " euros. El sou antic era de: " + treballadorO.calcularSouAntic(160) + " euros.");
	}

}
