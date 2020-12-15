import java.util.Scanner;

public class Bucles11 {


    public static void main(String[] args) {
        long factorial=1;
        int num;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = teclado.nextInt();
        
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}