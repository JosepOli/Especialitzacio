package s303n1;

public class Decoracio {

	private String material;
	private double preu;

	public Decoracio(String material, double preu) {
		this.material = material;
		this.preu = preu;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

}
