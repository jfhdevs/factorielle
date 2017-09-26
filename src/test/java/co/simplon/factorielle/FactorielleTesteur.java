package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FactorielleTesteur {
	
	private boolean factorielleTest (Long input, Long attendu) {
		Factorielle tester = new Factorielle();
		return (attendu.equals(tester.calculer(input)));	
	} // factorielleTest
	
	private void testFactorielle (long input, long attendu) {
		Factorielle tester = new Factorielle();
		assertEquals("!"+input+" = "+attendu, attendu, tester.calculer(input));
	} // factorielleTest
	
	@Test
	public void TesterFactorielleZero() {
		assertEquals("!0 = 1", true, factorielleTest (0L, 1L));
	} // TesterFactorielleZero

	@Test
	public void TesterFactorielleZeroBis() {
		testFactorielle (0L, 1L);
	} // TesterFactorielleZero

	@Test
	public void TesterFactorielleUn() {
		assertTrue(factorielleTest (1L, 1L));
	} // TesterFactorielleUn

	@Ignore
	@Test
	public void TesterFactorielleDeux() {
		Factorielle tester = new Factorielle();
		assertEquals("!2 = 2", 2, tester.calculer(new Long(2)));
	} // TesterFactorielleDeux

	@Test
	public void TesterFactorielleBADEquals() {
		assertEquals("!6 = 1", true, factorielleTest (6L, 1L));
	} // TesterFactorielleZero

	@Test
	public void TesterFactorielleBADTrue() {
		assertTrue(factorielleTest (6L, 1L));
	} // TesterFactorielleUn

	@Test
	public void TesterFactorielleTrois() {
		assertTrue(factorielleTest (3L, 6L));
	} // TesterFactorielleTrois

	@Test
	public void TesterFactorielleCinq() {
		assertTrue(factorielleTest (5L, 120L));
	} // TesterFactorielleCinq
	
	@Test
	public void TesterFactorielleDixNeuf() {
		assertTrue(factorielleTest (19L, 121645100408832000L));
	} // TesterFactorielleDixNeuf
	
	@Test(expected=IllegalArgumentException.class)
	public void TesterFactorielleNegatif() {
		assertEquals("!-1 = ERREUR", true, factorielleTest (-1L, 0L));
	} // TesterFactorielleNegatif


} // class FactorielleTesteur
