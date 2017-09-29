package co.simplon.factorielle;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logging {
	private Date dateHeureDebut;
	private String entree;
	private Date dateHeureFin;
	private String resultat;

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
	public void setResultat(String resultat) {
		this.dateHeureFin = new Date();
		this.resultat = resultat;
		System.out.println(this.toString());
	} // setResultat

	public void setResultat(long resultat) {
		this.dateHeureFin = new Date();
		this.resultat = Long.toString(resultat);
		System.out.println(this.toString());
	} // setResultat

//	Autres
	@Override
	public String toString() {
		SimpleDateFormat formater = new SimpleDateFormat("dd MMMMM yyyy, hh:mm aaa");
		String log;
		log = "Début " + formater.format(dateHeureDebut) + "; Valeur en entrée " + entree;
		log += "; Fin " + formater.format(dateHeureFin) + "; Résultat de ! " + resultat;
		return log;
	}

	
} // class Logs
