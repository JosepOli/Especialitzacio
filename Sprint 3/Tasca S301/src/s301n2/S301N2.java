package s301n2;

public class S301N2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class Main {
			public static void main(String[] args) {
				// Crea una instància de DireccioGeneric per a Espanya
				Direccio direccio = new DireccioGeneric("Carrer de Pau Claris", "10", "1r 2a", "Barcelona", "Espanya",
						"08010");
				// Obté la direcció formatejada
				String direccioFormat = direccio.getDireccioFormatejada();
				System.out.println("Direcció: " + direccioFormat);

				// Crea una instància de NumTelefonGeneric per a Espanya
				NumTelefon numTelefon = new NumTelefonGeneric("934123456", "Espanya");
				// Obté el número de telèfon formatejat
				String numTelefonFormat = numTelefon.getNumTelefonFormatejat();
				System.out.println("Número de telèfon: " + numTelefonFormat);
			}
		}

	}

}
