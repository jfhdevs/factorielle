package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTesteur {
	@Test
	public void TesterFactorielle() {
		Factorielle tester = new Factorielle();
		
//		assertEquals("!0 = 1", 0, tester.calculer(new Long(0)));
		assertEquals("!1 = 1", 1, tester.calculer(new Long(1)));
//		assertEquals("!3 = 6", 6, tester.calculer(new Long(3)));
//		assertEquals("!5 = 120", 120, tester.calculer(new Long(5)));
//		assertEquals("!19 = 6", 6, tester.calculer(new Long(19)));

		
		// manque test si négatif
	
		
	} // TesterFactorielle

} // class FactorielleTesteur
