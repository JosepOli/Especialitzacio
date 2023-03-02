package n1exercici5;

import java.io.*;

public class N1exercici5 implements Serializable {

	public static void main(String[] args) {

		// Cream l'objecte que volem serialitzar
		Cotxe cotxe1 = new Cotxe();

		// Serialitzem l'objecte a un fitxer
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\TeH_h\\Documents\\GitHub\\Especialitzacio\\TascaS105\\src\\n1exercici5\\myobject.ser"))) {
			oos.writeObject(cotxe1);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialitzem l'objecte des del fitxer
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\TeH_h\\Documents\\GitHub\\Especialitzacio\\TascaS105\\src\\n1exercici5\\myobject.ser"))) {
			Cotxe objectFromFile = (Cotxe) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	//Creem una classe per a crear objectes de tipus Cotxe Serialitzables
	public static class Cotxe implements Serializable{

		private String marca;
		private String model;
		private String potencia;

		public Cotxe(String marca, String model, String potencia) {
			this.marca = marca;
			this.model = model;
			this.potencia = potencia;
		}

		public Cotxe() {
			// TODO Auto-generated constructor stub
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getPotencia() {
			return potencia;
		}

		public void setPotencia(String potencia) {
			this.potencia = potencia;
		}

	}

}
