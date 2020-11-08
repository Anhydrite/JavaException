package Exercice2.Exo5;

public class EntrepriseSecrete extends Entreprise {

    public EntrepriseSecrete(String mission){
        super(mission);
    }

    public String mission() throws MissionSecreteException {
        throw new MissionSecreteException("Missions secrete");
    }
}
