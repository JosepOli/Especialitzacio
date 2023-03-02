package n1exercici2;

import java.util.*;
import java.util.stream.Collectors;

public class N1exercici2 {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Joan", "Pare", "avioneta", "bar", "cotxe", "ordinador", "sharp", "Clerch",
				"nas");
		List<String> stringsO = filtrarO(strings);
		System.out.println(stringsO);
	}

	public static List<String> filtrarO(List<String> strings) {
		return strings.stream().filter(s -> s.contains("o")).filter(s -> s.length() >= 5).collect(Collectors.toList());
	}
}