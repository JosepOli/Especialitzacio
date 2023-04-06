package s303n1;

public class Decoracio {
	
	public enum TipusDeMaterial{
		fusta,
		plastic
	}

	private TipusDeMaterial material;
	private double preu;

	public Decoracio(TipusDeMaterial material, double preu) {
		this.material = material;
		this.preu = preu;
	}

	public TipusDeMaterial getMaterial() {
		return material;
	}

	public void setMaterial(TipusDeMaterial material) {
		this.material = material;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

}
