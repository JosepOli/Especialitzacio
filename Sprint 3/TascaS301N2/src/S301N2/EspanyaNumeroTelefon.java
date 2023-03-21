package S301N2;


public class EspanyaNumeroTelefon extends NumeroTelefon {
	
	// Implementació específica del format del número de telèfon per a Espanya
	public void imprimirNumeroTelefon() {
		System.out.println("+34 " + getPrefix() + " " + getNumero());
	}
}