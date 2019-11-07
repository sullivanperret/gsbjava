package modele;

public class Stock {
	
	protected Visiteur unVisiteuur;
	protected Medicament unMedicament;
	protected int QteStock;
	
	public Stock(Visiteur unVisiteur, Medicament unMedicament, int QteStock) {
		this.unVisiteur=unVisiteur;
		this.unMedicament=unMedicament;
		this.QteStock=QteStock;
	}

	public Visiteur getUnVisiteur() {
		return unVisiteur;
	}

	public void setUnVisiteur(Visiteur unVisiteur) {
		this.unVisiteur = unVisiteur;
	}

	public Medicament getUnMedicament() {
		return unMedicament;
	}

	public void setUnMedicament(Medicament unMedicament) {
		this.unMedicament = unMedicament;
	}

	public int getQteStock() {
		return QteStock;
	}

	public void setQteStock(int qteStock) {
		QteStock = qteStock;
	}
	
	

}
