package n1exercici1;

import java.util.*;
import java.util.stream.Collectors;

public class N1exercici1 {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Joan", "Pare", "avioneta", "bar", "cotxe", "ordinador", "tassa");
		List<String> stringsO = filtrarO(strings);
		System.out.println(stringsO);
	}

	public static List<String> filtrarO(List<String> strings) {
		return strings.stream().filter(s -> s.contains("o")).collect(Collectors.toList());
	}
}
