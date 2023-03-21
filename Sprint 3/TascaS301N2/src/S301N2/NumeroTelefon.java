package S301N2;

//Classe abstracta NumeroTelefon que defineix les propietats i mètodes comuns per a tots els números de telèfon
public abstract class NumeroTelefon {
	private String prefix;
	private String numero;

	// Getters i setters
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	// Mètode abstracte per imprimir el número de telèfon
	public abstract void imprimirNumeroTelefon();
}