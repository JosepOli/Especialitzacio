package n1exercici1;

public class Corda extends Instrument {
	
	{
		//Inicialitzem
		System.out.println("Inicialitzant Corda.");
		
	}

	public Corda(String nom, int preu) {
		super(nom, preu);
	}
	
	void tocar() {
		System.out.println("Esta sonant un instrument de corda.");

	}
	
}
