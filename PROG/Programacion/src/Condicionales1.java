import java.util.Scanner;

public class Condicionales1 {
     public static void main(String[] args) {
         int a, b;
         Scanner teclado=new Scanner(System.in);
         
         System.out.println("Dime un numero entero:");
         a=teclado.nextInt();
         System.out.println("Dime otro numero entero:");
         b=teclado.nextInt();
         
         if (a % b == 0) {
              System.out.println("Son multiplos");
         }

         else {
              System.out.println("No son multiplos");
         }
     }
  }
     