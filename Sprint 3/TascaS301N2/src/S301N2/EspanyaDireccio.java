package S301N2;

//Implementació de la classe EspanyaDireccio que estén la classe abstracta Direccio
public class EspanyaDireccio extends Direccio {
	// Implementació específica del format de la direcció per a Espanya
	public void imprimirDireccio() {
		System.out.println(
				getCarrer() + ", " + getCiutat() + ", " + getCodiPostal() + ", " + getProvincia() + ", " + getPaís());
	}
}
