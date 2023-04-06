package s303n1;

import java.util.List;

public class Floristeria {

	private String nom;
	private List<Arbre> arbres;
	private List<Flor> flors;
	private List<Decoracio> decoracions;
	private double valorTotalStock;

	public Floristeria(String nom, List<Arbre> arbres, List<Flor> flors, List<Decoracio> decoracions,
			double valorTotalStock) {
		super();
		this.nom = nom;
		this.arbres = arbres;
		this.flors = flors;
		this.decoracions = decoracions;
		calcularValorTotalStock();
	}

	private void calcularValorTotalStock() {
		valorTotalStock = 0;
		for (Arbre arbre : arbres) {
			valorTotalStock += arbre.getPreu();
		}
		for (Flor flor : flors) {
			valorTotalStock += flor.getPreu();
		}
		for (Decoracio decoracio : decoracions) {
			valorTotalStock += decoracio.getPreu();
		}
	}

}
