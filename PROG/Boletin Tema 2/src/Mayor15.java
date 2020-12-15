import java.util.Scanner;

public class Mayor15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Dime un número: ");
        n1 = teclado.nextInt();
        System.out.print("Dime otro número: ");
        n2 = teclado.nextInt();
        System.out.print("Dime otro número: ");
        n3 = teclado.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);                                             
            } else {
                System.out.println("el mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("el mayor es: " + n2);
        } else {
            System.out.println("el mayor es: " + n3);
    teclado.close();    }
    }
}
	


