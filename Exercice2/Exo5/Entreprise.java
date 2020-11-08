package Exercice2.Exo5;

public class Entreprise {
    protected String mission;

    public Entreprise(String mission){
        this.mission = mission;
    }

    public String mission() throws MissionSecreteException{
        return this.mission;
    }
}
