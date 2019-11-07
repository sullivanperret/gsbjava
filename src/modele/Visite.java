package modele;

public class Visite {
	protected String Reference;
	protected String Date;
	protected String Commentaire;
	protected Medecin unMedecin;
	protected Visiteur unVisiteur;

	public Visite(String reference, String date, String commentaire, Medecin unMedecin, Visiteur unVisiteur) {
		super();
		Reference = reference;
		Date = date;
		Commentaire = commentaire;
		this.unMedecin = unMedecin;
		this.unVisiteur = unVisiteur;
	}

	public String getReference() {
		return Reference;
	}

	public void setReference(String reference) {
		Reference = reference;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getCommentaire() {
		return Commentaire;
	}

	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}

	public Medecin getUnMedecin() {
		return unMedecin;
	}

	public void setUnMedecin(Medecin unMedecin) {
		this.unMedecin = unMedecin;
	}

	public Visiteur getUnVisiteur() {
		return unVisiteur;
	}

	public void setUnVisiteur(Visiteur unVisiteur) {
		this.unVisiteur = unVisiteur;
	}

}
