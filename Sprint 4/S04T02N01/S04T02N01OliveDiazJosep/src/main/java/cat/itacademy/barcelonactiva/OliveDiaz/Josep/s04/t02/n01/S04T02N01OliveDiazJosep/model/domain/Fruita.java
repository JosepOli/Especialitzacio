package cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.S04T02N01OliveDiazJosep.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fruita {

	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private int quantitatQuilos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantitatQuilos() {
		return quantitatQuilos;
	}
	public void setQuantitatQuilos(int quantitatQuilos) {
		this.quantitatQuilos = quantitatQuilos;
	}
	
}
