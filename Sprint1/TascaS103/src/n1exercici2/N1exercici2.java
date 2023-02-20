package n1exercici2;

import java.util.*;

public class N1exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();//creem un List

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		list.forEach(System.out::println); //imprimim el List, nou metode afegit a Java 8

		List<Integer> list2 = new ArrayList<Integer>();//creem el segon List

		ListIterator<Integer> itr = list.listIterator(list.size());//li donem el final de la List com inici

		while (itr.hasPrevious())
			list2.add(itr.previous());

		list2.forEach(System.out::println);//imprimim el List invertit
	}

}
