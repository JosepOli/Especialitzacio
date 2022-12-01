package n1exercici1;

public class Vent extends Instrument {

	{
		//Inicialitzem
		System.out.println("Inicialitzant Vent.");
		
	}
	public Vent(String nom, int preu) {
		super(nom, preu);
		
	}

	void tocar() {
		System.out.println("Esta sonant un instrument de vent.");

	}

}
