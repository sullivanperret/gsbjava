package modele;

import modele.Unite;

public class Visiteur {

    protected String Matricule;
    protected String Nom;
    protected String Prenom;
    protected String Login;
    protected String mdp;
    protected String Adresse;
    protected String Telephone;
    protected String dateEntree;
    protected int Prime;
    protected Unite uneUnite;

    public Visiteur(String Matricule,String Nom,String Prenom,String Login, String mdp,
            String Adresse,String Telephone,int Prime,Unite uneUnite) {

        this.Matricule=Matricule;
        this.Nom=Nom;
        this.Prenom=Prenom;
        this.Login=Login;
        this.mdp=mdp;
        this.Adresse=Adresse;
        this.Telephone=Telephone;
        this.Prime=Prime;
        this.uneUnite=uneUnite;

    }
}