package Exo3;

public class TestArithmeticException {
    public static void main(String[] args){
        try{
            int a = 1/0;
        }catch (ArithmeticException e){
            System.out.println("sdfqfdqdsf");
        }
        finally{
            System.out.println("x");
        }
    }
}
