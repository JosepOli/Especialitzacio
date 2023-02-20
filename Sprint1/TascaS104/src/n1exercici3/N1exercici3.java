package n1exercici3;

import org.junit.Test;

public class N1exercici3 {

	public class AOOBExemple {
	    public void test() {
	        int[] array = new int[10];
	        // Llençarem una excepció intentant accedir a un índex del array que no està definit
	        int element = array[10];
	    }
	    
	}
	
	public class AOOBExempleTest {
	    @Test(expected = ArrayIndexOutOfBoundsException.class)
	    public void testArrayOutOfBoundsException() {
	    	 // Creem un objecte AOOBExemple
	    	AOOBExemple exemple = new AOOBExemple();
	    	
	        exemple.test();
	    }
	}
}
