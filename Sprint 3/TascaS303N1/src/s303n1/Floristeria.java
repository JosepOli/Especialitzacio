package s303n1;

import java.util.ArrayList;
import java.util.List;

public class Floristeria {

	private String nom;
	private List<Arbre> arbres;
	private List<Flor> flors;
	private List<Decoracio> decoracions;
	private List<Ticket> llistaDeCompres;
	private double valorTotalStock;

	public Floristeria(String nom, List<Arbre> arbres, List<Flor> flors, List<Decoracio> decoracions,
			double valorTotalStock) {
		super();
		this.nom = nom;
		this.arbres = arbres;
		this.flors = flors;
		this.decoracions = decoracions;
		this.llistaDeCompres = new ArrayList<>();
		calcularValorTotalStock();
	}

	public Floristeria(String nom2) {
		this.nom = nom2;
	}

	// Metodes per a obtenir arbres, flors i decoracions pel seu index
	public Arbre getArbre(int index) {
		if (index >= 0 && index < arbres.size()) {
			return arbres.get(index);
		} else {
			return null;
		}
	}

	public Flor getFlor(int index) {
		if (index >= 0 && index < flors.size()) {
			return flors.get(index);
		} else {
			return null;
		}
	}

	public Decoracio getDecoracio(int index) {
		if (index >= 0 && index < decoracions.size()) {
			return decoracions.get(index);
		} else {
			return null;
		}
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

	// Metode per a mostrar l'Stock d'objectes
	public void mostrarStock() {
		System.out.println("Stock de la floristeria " + nom + ":");
		System.out.println("Arbres:");
		for (Arbre arbre : arbres) {
			System.out.println("  " + arbre);
		}
		System.out.println("Flors:");
		for (Flor flor : flors) {
			System.out.println("  " + flor);
		}
		System.out.println("Decoracions:");
		for (Decoracio decoracio : decoracions) {
			System.out.println("  " + decoracio);
		}
	}

	// Metodes per a mostrar l'Stock d'objectes independentment de cara a
	// eliminarlos
	public void mostrarStockArbres() {
		System.out.println("Stock d'arbres:");
		for (Arbre arbre : arbres) {
			System.out.println("  " + arbre);
		}
	}

	public void mostrarStockFlors() {
		System.out.println("Stock de flors:");
		for (Flor flor : flors) {
			System.out.println("  " + flor);
		}
	}

	public void mostrarStockDecoracions() {
		System.out.println("Stock de decoracions:");
		for (Decoracio decoracio : decoracions) {
			System.out.println("  " + decoracio);
		}
	}

	// Metodes per a eliminar objectes de l'stock i actualitzar el valortotal
	public boolean retirarArbre(int index) {
		if (index >= 0 && index < arbres.size()) {
			Arbre arbreARetirar = arbres.get(index);
			double preuArbre = arbreARetirar.getPreu();
			arbres.remove(index);
			valorTotalStock -= preuArbre;
			return true;
		} else {
			return false;
		}
	}

	public boolean retirarFlor(int index) {
		if (index >= 0 && index < flors.size()) {
			Flor florARetirar = flors.get(index);
			double preuFlor = florARetirar.getPreu();
			flors.remove(index);
			valorTotalStock -= preuFlor;
			return true;
		} else {
			return false;
		}
	}

	public boolean retirarDecoracio(int index) {
		if (index >= 0 && index < decoracions.size()) {
			Decoracio decoracioARetirar = decoracions.get(index);
			double preuDecoracio = decoracioARetirar.getPreu();
			decoracions.remove(index);
			valorTotalStock -= preuDecoracio;
			return true;
		} else {
			return false;
		}
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

	// Metodes per a afegir tickets al llistat de compres i per a mostrar el llistat
	public void afegirTicket(Ticket ticket) {
		llistaDeCompres.add(ticket);
	}

	public void mostrarLlistaDeCompres() {
		System.out.println("Llista de compres de la floristeria " + nom + ":");
		int i = 1;
		for (Ticket ticket : llistaDeCompres) {
			System.out.println(i + ". " + ticket);
			i++;
		}
	}

	// Metode per a guardar el total de Vendes
	public double totalVendes() {
		double totalVendes = 0;
		for (Ticket ticket : llistaDeCompres) {
			totalVendes += ticket.getImportTotal();
		}
		return totalVendes;
	}

	//toString incloent toDataString per a les dades dels productes
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Floristeria,").append(nom).append("\n");

		for (Arbre arbre : arbres) {
			sb.append(arbre.toDataString()).append("\n");
		}
		for (Flor flor : flors) {
			sb.append(flor.toDataString()).append("\n");
		}
		for (Decoracio decoracio : decoracions) {
			sb.append(decoracio.toDataString()).append("\n");
		}
		return sb.toString();
	}
}
