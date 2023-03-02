package n1exercici5;

public class N1exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PiValue pi = () -> 3.1415;
        System.out.println(pi.getPiValue());
	}
	
	@FunctionalInterface
	public interface PiValue {
	    double getPiValue();
	}

}
