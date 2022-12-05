package n1exercici1;

import java.util.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class N1exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MonthListTest.testMesos();
	}

	public class MonthListTest {
		
	  @Test
	  public static void testMesos() {
	    MonthList months = new MonthList();

	    // Obté la llista de mesos
	    ArrayList<String> monthList = months.getMonths();

	    // Verifica que la llista conté 12 posicions
	    assertEquals(12, monthList.size());
	    
	    // Verifica que la llista no és buida
	    assertFalse(monthList.isEmpty());
	    
	    // Verifica que la llista conté el mes "Agost"
	    assertTrue(monthList.contains("Agost"));
	  }
	}
}