package modele.dao;

import java.sql.ResultSet;

import modele.Visiteur;
import modele.Unite;

public class VisiteurDao {
	
	public static Visiteur rechercher(String Matricule) {
		Visiteur unVisiteur = null;
		Unite uneUnite = null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITEUR where MATRICULE ='"+Matricule+"'");
		try {
			if (reqSelection.next()) {
				uneUnite = UniteDao.rechercher(reqSelection.getString(9));
				unVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), reqSelection.getString(4),reqSelection.getString(5), reqSelection.getString(6), reqSelection.getString(7), reqSelection.getInt(8), uneUnite );	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from VISITEUR where MATRICULE ='"+Matricule+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unVisiteur;
		
	}
	
	public static int creer(Visiteur unVisiteur) {
        String reqInsert;
        Unite uneUnite = null;
        String matricule=unVisiteur.getMatricule();
        String nom=unVisiteur.getNom();
        String prenom=unVisiteur.getPrenom();
        String login=unVisiteur.getLogin();
        String mdp=unVisiteur.getMdp();
        String adresse=unVisiteur.getAdresse();
        String tel=unVisiteur.getTelephone();
        int prime=unVisiteur.getPrime();
        String unite=uneUnite.getCodeUnite();
        reqInsert="Insert into Unite values('"+matricule+"','"+nom+"','"+prenom+"','"+login+"','"+mdp+"','"+adresse+"','"+tel+"','"+prime+"''"+unite+"')";

        int result =ConnexionMySql.execReqMaj(reqInsert);
        ConnexionMySql.fermerConnexionBd();
        return result;
	
	}
	
}
