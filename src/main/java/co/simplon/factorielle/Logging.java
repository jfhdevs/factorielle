package co.simplon.factorielle;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.*;

public class Logging {
	private static Logger logger = LoggerFactory.getLogger(Logging.class);
	private Date dateHeureDebut;
	private String entree;
	private Date dateHeureFin;
	private String resultat;
	private String type;

//	Constructeurs
	public Logging(String entree) {
		this.dateHeureDebut = new Date();
		this.entree = entree;
	} // Logging

	public Logging(long entree) {
		this.dateHeureDebut = new Date();
		this.entree = Long.toString(entree);
	} // Logging

//	Setteurs


//	Autres
	public void closeLogging (String type, String resultat) {
		this.dateHeureFin = new Date();
		this.resultat = resultat;
		this.type = type;
		if (type.equals("warming")) { logger.warn(this.toString());
		} else {				logger.debug(this.toString());			
		} // if
	} // closeLogging
	
	public void closeLogging (String type, long resultat) {
		this.closeLogging (type, Long.toString(resultat));
	} // closeLogging
	
	@Override
	public String toString() {
		SimpleDateFormat formater = new SimpleDateFormat("dd MMMMM yyyy, hh:mm:ss.SSSS");
		String log;
		log = "Début " + formater.format(dateHeureDebut) + "; Valeur en entrée " + entree;
		log += "; Fin " + formater.format(dateHeureFin) + "; Résultat de ! " + resultat;
		return log;
	}

	
} // class Logs
