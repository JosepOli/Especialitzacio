package n1exercici1;

public class Percussio extends Instrument {

	public Percussio(String nom, int preu) {
		super(nom, preu);
	}

	void tocar() {
		System.out.println("Esta sonant un instrument de percussio.");
	}

}
