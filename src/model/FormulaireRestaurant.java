package model;

public class FormulaireRestaurant extends Formulaire {
	private int nombrePersonnes;
	private int numService;
	
	
	public FormulaireRestaurant(int jour, int mois,int nbConvives, int numService) {
		super(jour, mois);
		this.nombrePersonnes = nbConvives;
		this.numService = numService;
		
	}
	
	public int getNombrePersonnes() {
		return nombrePersonnes;
	}

	public void setNombrePersonnes(int nbConvives) {
		this.nombrePersonnes = nbConvives;
	}

	public int getNumService() {
		return numService;
	}

	public void setNumService(int numService) {
		this.numService = numService;
	}

	public String toString() {
		return "FormulaireRestaurant []";
	}

}
