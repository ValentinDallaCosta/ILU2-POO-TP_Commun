package model;

public class FormulaireSpectacle extends Formulaire {
	private int numZonePlace;
	
	
	public FormulaireSpectacle(int numZonePlace, int jour, int mois) {
		super(jour, mois);
		this.numZonePlace = numZonePlace;
		
	}
	
	public int getNumZonePlace() {
		return numZonePlace;
	}

	public void setNumZonePlace(int numZonePlace) {
		this.numZonePlace = numZonePlace;
	}

	public String toString() {
		return "FormulaireSpectacle []";
	}

}
