import java.util.Scanner;

public class Nota16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int nota;
        System.out.print("Dime tu nota: ");
        nota = teclado.nextInt();

        if (nota < 0 || nota > 10) {
        		System.out.println("Error");
        }else	if (nota == 0 || nota < 3) {
        				System.out.println("Muy Deficiente");
        	}else	if (nota == 3 || nota < 5) {
        				System.out.println("Insuficiente"); 
        				}else if (nota == 5 || nota < 6) {
        								System.out.println("Bien");
        					}else	if (nota == 6 || nota < 9) {
        										System.out.println("Notable");
        				 		}else	if (nota == 9 || nota < 10)
        												System.out.println("Sobresaliente");
        	 
  	
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    teclado.close();
    }
}