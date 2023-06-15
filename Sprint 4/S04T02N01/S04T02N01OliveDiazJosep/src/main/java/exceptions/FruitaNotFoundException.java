package exceptions;

public class FruitaNotFoundException extends RuntimeException {
	public FruitaNotFoundException(String message) {
		super(message);
	}
}