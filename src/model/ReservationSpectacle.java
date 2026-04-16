package model;

public class ReservationSpectacle extends Reservation {
	private int jour;
	private int mois;
	private int numChaise;
	private int numPlace;
	
	public ReservationSpectacle(int jour, int mois, int numChaise, int numPlace) {
		this.jour = jour;
		this.mois = mois;
		this.numChaise = numChaise;
		this.numPlace = numPlace;
	}
	
	@Override
	public String toString() {
		return "Le " + jour + "/" + mois + "\nChaise " + numChaise + " pour la place " + numPlace + ".";
	}
	
}
