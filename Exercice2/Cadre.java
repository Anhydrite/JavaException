package Exercice2;

class Cadre extends Employe
{
    public float calculePrime()
    {
        return (super.calculePrime() / 2f);
    }
}