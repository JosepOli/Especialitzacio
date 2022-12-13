package n1exercici2;

public class TreballadorPresencial extends Treballador {

	static Integer benzina = 150;
	
	public TreballadorPresencial(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);
	}

	//Afegim metode obsolet com el de l'exercici1 i el nou està modificat
	@Override
	public int calcularSou(int horesTreballades) {
		return super.calcularSou(horesTreballades) + benzina*2;
	}
	
	@Deprecated
	public int calcularSouAntic(int horesTreballades) {
		return super.calcularSou(horesTreballades) + benzina;
	}
	

}
