package n1exercici1;

import java.util.*;

public class N1exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Month> mesos = new ArrayList<Month>();
		
		Month gener = new Month("Gener");
		Month febrer = new Month("Febrer");
		Month marc = new Month("Marc");
		Month abril = new Month("Abril");
		Month maig = new Month("Maig");
		Month juny = new Month("Juny");
		Month juliol = new Month("Juliol");
		Month agost = new Month("Agost");		
		Month setembre = new Month("Setembre");
		Month octubre = new Month("Octubre");
		Month novembre = new Month("Novembre");
		Month desembre = new Month("Desembre");
		
		//afegim tots els mesos menys agost a la llista de manera ordenada
		mesos.add(gener);
		mesos.add(febrer);
		mesos.add(marc);
		mesos.add(abril);
		mesos.add(maig);
		mesos.add(juny);
		mesos.add(juliol);
		mesos.add(setembre);
		mesos.add(octubre);
		mesos.add(novembre);
		mesos.add(desembre);
		
		Iterator<Month> itr = mesos.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getMonth());
		}
		
		//afegim agost a la posicio que li toca
		mesos.add(7, agost);
		
		System.out.println("\nAra podrem veure tots els mesos amb agost inclos. \n");
		
		Iterator<Month> itr2 = mesos.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next().getMonth());
		}
		
		HashSet<Month> mesosHash = new HashSet<>(mesos);
		
		System.out.println("\nHem passat el nostre ArrayList a HashSet i queda aixi:\n");
		for(Month mes : mesosHash) {
			System.out.println(mes.getMonth());
			
		}
		//afegim dos mesos per a comprovar si admet duplicats
		mesosHash.add(desembre);
		mesosHash.add(novembre);
		
		System.out.println("\nProvem si accepta duplicats\n");
		Iterator<Month> itrHash = mesosHash.iterator();
		while(itrHash.hasNext()) {
			System.out.println(itrHash.next().getMonth());
		}
		
	}

}
