package n1exercici1;

public class NoGenericMethods {
	// Declarem les variables per emmagatzemar els objectes.
	private Object object1;
	private Object object2;
	private Object object3;

	// Constructor per inicialitzar els tres objectes.
	public NoGenericMethods(Object object1, Object object2, Object object3) {
		this.object1 = object1;
		this.object2 = object2;
		this.object3 = object3;
	}

	// Mètodes per establir els objectes
	public void setObject1(Object object1) {
		this.object1 = object1;
	}

	public void setObject2(Object object2) {
		this.object2 = object2;
	}

	public void setObject3(Object object3) {
		this.object3 = object3;
	}

	// Mètodes per a obtenir els objecte.
	public Object getObject1() {
		return object1;
	}

	public Object getObject2() {
		return object2;
	}

	public Object getObject3() {
		return object3;
	}
}