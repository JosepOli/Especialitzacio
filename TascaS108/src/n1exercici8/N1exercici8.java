package n1exercici8;

public class N1exercici8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lambda que retorna la cadena rebuda com a parametre invertida
		ReverseString reverse = str -> {
			StringBuilder sb = new StringBuilder(str);
			return sb.reverse().toString();
		};

		// Cridem la instància de la interface amb la cadena de text a invertir i
		// imprimim per a comprovar si es correcte
		String result = reverse.reverse("Bona tarda tingui vostè");
		System.out.println(result);
	}
}
