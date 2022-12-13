package n1exercici2;

public class N1exercici2 {

	public static void main(String[] args) {
		
		//Instanciem l'objecte persona de tipus Persona
		Persona persona = new Persona("Xavi", "Hernandez", 40);
		//Cridem el mètode GenericMethods amb 3 tipus d'arguments en diferents ordres
		GenericMethods.<Persona, String, Integer>imprimir(persona, "Hola", 25);
		GenericMethods.<Double, Character, Persona>imprimir(30.0, 'A', persona);
		GenericMethods.<Boolean, Persona, Persona>imprimir(true, persona, persona);
	}

	public class GenericMethods {
		// Mètode genèric que imprimeix els arguments passats
		public static <T, U, V> void imprimir(T arg1, U arg2, V arg3) {
			System.out.println(arg1);
			System.out.println(arg2);
			System.out.println(arg3);
		}
	}

}
