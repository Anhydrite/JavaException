package Exercice2;

public class Test1Héritage {

    public static void main(String[] args) {
        Employe jean = new Employe("PAUL","Jean", 1992, 6942.0f);
        float prime = jean.calculePrime();
        System.out.println("Prime de jean : " + String.format("%.2f", prime) + " €");

        // test de instanceof avec des Personnes
        Personne[] personnel = {
            new Employe("PAUL","Jean", 1992, 6942.0f),
            new Etudiant("MARC","Joel", 2000, 16165168),
            new Employe("MAURICE","Bernard", 1995, 2451.0f),
            new Personne("Pelleteuse", "Roger", 200),
        };
        
        System.out.print(personnel[0].getClass().getSimpleName());

        for (Personne personne : personnel) {
            String action = null;
            switch (personne.getClass().getSimpleName())
            {
                case "Employe":
                    action="Discuter affaire avec ";
                    break;
                case "Etudiant":
                    action="Proposer un stage à ";
                    break;
                default: 
                    action ="Dire bienvenue à ";
                    break;
            }
            System.out.println(action+personne.getNom()+" "+personne.getPrenom());
        }
    }
}