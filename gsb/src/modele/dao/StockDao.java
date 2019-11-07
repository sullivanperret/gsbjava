package modele.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import modele.Medicament;
import modele.Stock;
import modele.Visiteur;
public class StockDao {

	
	
	public static ArrayList<Stock> retournerStocks(String unMatricule){
		ArrayList<Stock> lesStocks = new ArrayList<Stock>();
		String requete = "SELECT * FROM Stock WHERE Matricule = '"+unMatricule+"'";
		ResultSet reqSelection = ConnexionMySql.execReqSelection(requete);
		try {
			while (reqSelection.next()) {
				Visiteur unVisiteur = VisiteurDao.rechercher(reqSelection.getString(2));
				Medicament unMedicament = MedicamentDao.rechercher(reqSelection.getString(1));
				int qte = reqSelection.getInt(3);
				Stock unStock = new Stock(unVisiteur, unMedicament, qte);
				lesStocks.add(unStock);
			}
		catch //todo
		return lesStocks;
	}
		
}
