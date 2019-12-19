package service;

import modele.Visite;
import modele.dao.VisiteDao;

public class VisiteService {

    public static Visite rechercherVisite(String uneReference) {
        Visite uneVisite = null;
        try {
            if (uneReference == null) {
                throw new Exception("Donnée obligatoire : Reference");
            }
            uneVisite = VisiteDao.rechercher(uneReference);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return uneVisite;
    }
}
