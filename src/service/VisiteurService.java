package service;

import modele.Visiteur;
import modele.dao.VisiteurDao;

public class VisiteurService{
	Visiteur rechercherVisiteur(String unCodeVisiteur) {
	
        Visiteur unVisiteur = null;
        try {
            if (unCodeVisiteur == null) {
                throw new Exception("Donnée obligatoire : Reference");
            }
            unVisiteur = VisiteurDao.rechercher(unCodeVisiteur);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return unVisiteur;
    }


}
