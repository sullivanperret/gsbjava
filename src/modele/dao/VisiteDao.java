package modele.dao;

import java.sql.ResultSet;

import modele.Visite;

public class VisiteDao {
	public static Visite rechercher(String Reference) {
		Visite uneVisite = null;
		ResultSet reqSelection = ConnexionMySql
				.execReqSelection("select * from VISITE where REFERENCE ='" + Reference + "'");
		try {
			if (reqSelection.next()) {
				uneVisite = new Visite(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), unMedecin, unVisiteur);
			}
			;
		} catch (Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from VISITE where REFERENCE ='"
					+ Reference + "'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		return uneVisite;
		
	}
}
