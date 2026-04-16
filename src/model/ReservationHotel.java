package model;

public class ReservationHotel extends Reservation {
	private int jour;
	private int mois;
	private int nbLitsSimple;
	private int nbLitsDouble;
	private int numChambre;

	public ReservationHotel(int jour, int mois, int nbLitsSimple, int nbLitsDouble, int numChambre) {
		this.jour = jour;
		this.mois = mois;
		this.nbLitsSimple = nbLitsSimple;
		this.nbLitsDouble = nbLitsDouble;
		this.numChambre = numChambre;
	}
	
	@Override
	public String toString() {
		return "Le " + jour + "/" + mois + "\nChambre " + numChambre + " avec " + nbLitsSimple + " lits simples et " + nbLitsDouble + " lits doubles.";
	}
}
