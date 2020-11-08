package Exercice2;

import java.util.Date;

public class Employe extends Personne {
    protected float salaire;
    
    public Employe() {}
    public Employe(String n, String p, int a, float s)
    {
        // appel du constructeur de Personne
        // avec nom, prenom et dateNaissance
        super(n, p, a);
        this.salaire = s;
    }
    
    public float calculePrime()
    {
        return (salaire * 0.05f);
    }
    
    public float getSalaire() {
        return this.salaire;
    }
    
    public void setSalaire(float s) {
        this.salaire = s;
    }
}