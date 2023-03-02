package n1exercici2;

public class N1exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciem dos cotxes per a demostrar com funcionen els atributs estatic i
		// final
		Cotxe cotxe1 = new Cotxe();
		Cotxe cotxe2 = new Cotxe();

		System.out.println(
				"Ara mateix tenim dos cotxes, com que els seus valors estan donats a la classe, seran iguals. Cotxe1:  "
						+ Cotxe.getMarca() + " " + Cotxe.getModel() + " " + cotxe1.getPotencia() + " cv i cotxe2: "
						+ Cotxe.getMarca() + " " + Cotxe.getModel() + " " + cotxe2.getPotencia() + " cv.");

		// Seria més correcte utilitzar Cotxe en lloc de cotxe1 i cotxe2 perquè els
		// valors son tots estàtics i per tant compartits entre els diferents objectes
		// Podem canviar el model perquè no es final, però en ser static, canviarà per a
		// tots els objectes

		System.out.println("Canviem el valor de model. Ibiza per Leon.");
		Cotxe.setModel("Leon");

		System.out.println("Com podem veure, els dos cotxes han passat de ser Ibiza a ser Leon. Cotxe1: "
				+ Cotxe.getModel() + " i cotxe2: " + Cotxe.getModel());

		System.out.println("El correcte seria cridar els atributs estatics de la seguent manera: " + Cotxe.getMarca()
				+ " " + Cotxe.getModel());

		System.out.println("Ara cridarem els metodes accelerar i frenar. Accelerar: " + cotxe1.accelerar()
				+ "\nFrenar: " + Cotxe.frenar());

	}

}
