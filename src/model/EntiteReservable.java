package model;

public class EntiteReservable <T extends Formulaire> {
	private CalendrierAnnuel calendrier;
	private int idEntite;
	

	public int getIdEntite() {
		return idEntite;
	}

	public void setIdEntite(int idEntite) {
		this.idEntite = idEntite;
	}
	
	public boolean estLibre(Formulaire formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public void compatible(Formulaire formulaire) {
		calendrier.compatible(formulaire.getJour(), formulaire.getMois());
	}
	
	public void reserver(Formulaire formulaire) {
		calendrier.reserver(formulaire.getJour(), formulaire.getMois());
	}
}
