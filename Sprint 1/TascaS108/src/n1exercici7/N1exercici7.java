package n1exercici7;

import java.util.*;
import java.util.stream.Collectors;

public class N1exercici7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				List<Object> llista = Arrays.asList(15, 1, "aigua", "bicicleta", 756, "tres", 5128541, "catorze");
				
				// Filtrem per a tenir els numeros
				List<Object> numbers = llista.stream()
				.filter(n -> n instanceof Integer)
				.collect(Collectors.toList());

				// Filtrem per a tenir les cadenes de text
				List<Object> strings = llista.stream()
				.filter(n -> n instanceof String)
				.collect(Collectors.toList());

				// Ordenem les cadenes de més llarga a més curta
				Collections.sort(strings, (s1, s2) -> ((String) s2).length() - ((String) s1).length());

				// Combinaem les dues llistes
				List<Object> sortedList = new ArrayList<Object>();
				sortedList.addAll(numbers);
				sortedList.addAll(strings);

				//Printem per a veure el resultat
				System.out.println(sortedList);
	}

}
