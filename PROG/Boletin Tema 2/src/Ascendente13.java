import java.util.Scanner;

public class Ascendente13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        System.out.print("Dime un n�mero: ");
        n1 = teclado.nextInt();
        System.out.print("Dime otro n�mero: ");
        n2 = teclado.nextInt();
        if (n1 > n2) {
                System.out.println("Orden Ascendente :" + n1 +" "+  n2);                                           
            } else {
                System.out.println("Orden Ascendente :" + n2 +" "+  n1);     
                
                
                
                
                
                
                
                
teclado.close();
}
   }
}