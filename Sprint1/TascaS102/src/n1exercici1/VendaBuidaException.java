package n1exercici1;

public class VendaBuidaException extends Exception {

	// Creem l'excepcio personalitzada
	private String missatgeError;

	public VendaBuidaException(String missatgeError) {
		this.missatgeError = missatgeError;
	}

	@Override
	public String getMessage() {
		return missatgeError;
	}
}
