package model;

public class Formulaire extends Reservation {
	private int jour;
	private int mois;
	private int identificationEntite;
	
	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	
	public String toString() {
		return "Formulaire []";
	}

	public int getIdentificationEntite() {
		return identificationEntite;
	}

	public void setIdentificationEntite(int numEntite) {
		this.identificationEntite = numEntite;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}
}
