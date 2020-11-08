package Exercice2.Exo5;

public class TestMissionSecrete {
    public static void main(String[] args){
        try{
            throw new MissionSecreteException("qsdqsd");
        }catch(MissionSecreteException e){
            System.out.println("errruer");
        }
    }
}