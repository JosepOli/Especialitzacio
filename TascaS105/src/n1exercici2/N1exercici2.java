package n1exercici2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class N1exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					"C:\\Users\\TeH_h\\Documents\\GitHub\\Especialitzacio\\TascaS105\\src\\n1exercici1\\readme.txt"));
			bw.write(null);
			bw.close();
		} catch (Exception e) {
			return;
		}
	}

}
