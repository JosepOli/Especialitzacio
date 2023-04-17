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

	// Metode per a calcular el valor total de l'stock de la Floristeria
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

	// Metodes per a afegir arbres,flors i decoracions i actualitzar el preu
	public void afegirArbre(Arbre arbre) {
		arbres.add(arbre);
		valorTotalStock += arbre.getPreu();
	}

	public void afegirFlor(Flor flor) {
		flors.add(flor);
		valorTotalStock += flor.getPreu();
	}

	public void afegirDecoracio(Decoracio decoracio) {
		decoracions.add(decoracio);
		valorTotalStock += decoracio.getPreu();
	}

	// Getters i setters amb invocacio del metode calcularValorTotalStock per a
	// actualitzar el valor quan actualitzem el llistat

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Arbre> getArbres() {
		return arbres;
	}

	public void setArbres(List<Arbre> arbres) {
		this.arbres = arbres;
		calcularValorTotalStock();
	}

	public List<Flor> getFlors() {
		return flors;
	}

	public void setFlors(List<Flor> flors) {
		this.flors = flors;
		calcularValorTotalStock();
	}

	public List<Decoracio> getDecoracions() {
		return decoracions;
	}

	public void setDecoracions(List<Decoracio> decoracions) {
		this.decoracions = decoracions;
		calcularValorTotalStock();
	}

	public double getValorTotalStock() {
		return valorTotalStock;
	}

}
