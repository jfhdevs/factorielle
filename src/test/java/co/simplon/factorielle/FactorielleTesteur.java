package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTesteur {
	@Test
	public void TesterFactorielleZero() {
		Factorielle tester = new Factorielle();
		assertEquals("!0 = 1", 1, tester.calculer(new Long(0)));
	} // TesterFactorielleZero

	@Test
	public void TesterFactorielleUn() {
		Factorielle tester = new Factorielle();
		assertEquals("!1 = 1", 1, tester.calculer(new Long(1)));
	} // TesterFactorielleUn

	@Test
	public void TesterFactorielleDeux() {
		Factorielle tester = new Factorielle();
		assertEquals("!2 = 2", 2, tester.calculer(new Long(2)));
	} // TesterFactorielleDeux

	@Test
	public void TesterFactorielleTrois() {
		Factorielle tester = new Factorielle();
		assertEquals("!3 = 6", 6, tester.calculer(new Long(3)));
	} // TesterFactorielleTrois

	@Test
	public void TesterFactorielleCinq() {
		Factorielle tester = new Factorielle();
		assertEquals("!5 = 120", 120, tester.calculer(new Long(5)));
	} // TesterFactorielleCinq
	
	@Test
	public void TesterFactorielleDixNeuf() {
		Factorielle tester = new Factorielle();
		assertEquals("!19 = 121645100408832000", 1, tester.calculer(new Long(19)));
	} // TesterFactorielleDixNeuf

} // class FactorielleTesteur
