package co.simplon.factorielle;


/**
 * Factorielle
 */
public class Factorielle 
{
    public Factorielle(long n) {
    	super();
    	long res;
    	Logging(n);
    	res = calculer (n);
    	setResultat(res);
    } // Factorielle
    
    public long calculer(long n) {
    	if (n > 1) {	return n * calculer(n-1);
    	} else if (n < 0) {	throw new IllegalArgumentException();
    	} // if
    	return 1;
    } // calculer

} // class Factorielle
