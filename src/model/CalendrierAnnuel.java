package model;

public class CalendrierAnnuel {
	private Mois mois[] = new Mois[12];

	public CalendrierAnnuel() {
		mois[0] = new Mois("Janvier", 31);
		mois[1] = new Mois("Fevrier", 28);
		mois[2] = new Mois("Mars", 31);
		mois[3] = new Mois("Avril", 30);
		mois[4] = new Mois("Mai", 31);
		mois[5] = new Mois("Juin", 30);
		mois[6] = new Mois("Juillet", 31);
		mois[7] = new Mois("Aout", 31);
		mois[8] = new Mois("Septembre", 30);
		mois[9] = new Mois("Octobre", 31);
		mois[10] = new Mois("Novembre", 30);
		mois[11] = new Mois("Decembre", 31);
	}

	// Classe interne Mois
	private class Mois {
		private boolean jours[];
		private String nom;

		private Mois(String nom, int nbJours) {
			this.jours = new boolean[nbJours];
			this.nom = nom;
			for (int i = 0; i < jours.length; i++) {
				jours[i] = true;
			}
		}

		private boolean estLibre(int jour) {
			return jours[jour - 1];
		}

		private void reserver(int jour) {
			jours[jour - 1] = false;
		}
	}

	public boolean estLibre(int jour, int numMois) {
		return mois[numMois - 1].estLibre(jour);
	}

	public boolean reserver(int jour, int numMois) {
		if (estLibre(jour, numMois)) {
			mois[numMois - 1].reserver(jour);
			return true;
		} else {
			return false;
		}
	}
}
