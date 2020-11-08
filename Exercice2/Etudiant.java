package Exercice2;

public class Etudiant extends Personne {
    protected int numeroCarteEtudiant;
    
    public Etudiant() {}
    public Etudiant(String n, String p, int a, int nce)
    {
        // appel du constructeur de Personne
        // avec nom, prenom et numeroCarteEtudiant
        super(n, p, a);
        this.numeroCarteEtudiant = nce;
    }
    
    public int getNumeroCarteEtudiant() {
        return this.numeroCarteEtudiant;
    }
    
    public void setNumeroCarteEtudiant(int n) {
        this.numeroCarteEtudiant = n;
    }
}