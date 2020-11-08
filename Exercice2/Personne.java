package Exercice2;

import java.util.Date;

public class Personne {
    protected String nom, prenom;
    protected int anneeNaissance;

    public Personne() {}
    public Personne(String n, String p, int a)
    {
        this.nom = n;
        this.prenom = p;
        this.anneeNaissance = a;
    }

    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public int getAnneeNaissance() {
        return this.anneeNaissance;
    }

    public void setNom(String n) {
        this.nom = n;
    }
    public void setPrenom(String p) {
        this.prenom = p;
    }
    public void setAnneeNaissance(int a) {
        this.anneeNaissance = a;
    }
}