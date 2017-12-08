package co.simplon.factorielle;


/**
 * Factorielle
 */
public class Factorielle 
{
    public Factorielle() {
    	super();
    } // Factorielle
    
    public long loggedFactorielle(long n) {
    	Logging log = new Logging (n);
    	long res;
    	try { res = calculer (n); }
    	catch (IllegalArgumentException e) { 
    		log.closeLogging ("warming", "nombre Négatif");
    		throw new IllegalArgumentException();
    	} // try
    	log.closeLogging ("info", res);
    	return res;
    } // loggedFactorielle
    
    public long calculer(long n) {
    	if (n > 1) {	return n * calculer(n-1);
    	} else if (n < 0) {	throw new IllegalArgumentException();
    	} // if
    	return 1;
    } // calculer

} // class Factorielle
