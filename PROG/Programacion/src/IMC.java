import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        double p,e,imc;
        
        System.out.println("Cual es su peso ");
        p= teclado.nextDouble();
        System.out.println("Cual es tu estatura");
        e= teclado.nextDouble();
        
        imc= p/(e*e);
        System.out.println("SU IMC ES: "+imc);
         
        if (imc<18.5) {
            System.out.println("BAJO PESO");
        } else if (imc>=18.5 && imc<=24.9) {
            System.out.println("NORMAL");
        } else if (imc>=25 && imc<=29.9) {
            System.out.println("SOBREPESO");
        } else {
            System.out.println("OBESIDAD");
        }
    teclado.close();
    }
}