package n1exercici2;

public class Cotxe {
	
	//Enunciat: Hem de fer que marca sigui static final, model static i potencia final
	//Els "final" han de tenir valor, ja que aquest sera el seu valor sempre. (Utilitzat per a constants)
	
	
	private static final String marca = "Seat";
	private static String model;
	private final Integer potencia = 120;
	
	
	public Cotxe () {
		Cotxe.model = "Ibiza"; //Inicialitzem atribut al constructor
		
	}
	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}

	public static String getMarca() {
		return marca;
	}

	public Integer getPotencia() {
		return potencia;
	}

	static String frenar() {
		return "El vehicle esta frenant.";
	}
	
	String accelerar() {
		return "El vehicle esta accelerant.";
	}

	
}
