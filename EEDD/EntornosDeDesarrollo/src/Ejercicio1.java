import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		        Scanner teclado = new Scanner(System.in);
		        //Pedir Valores 
		        int a, b;
		        
		        System.out.print("Dime A ");
		        
		        a = teclado.nextInt();
		        
		        System.out.print("Dime B ");
		        
		        b = teclado.nextInt();
		                                              
		        //Intercambiar Valores
		        a = a + b;
		        b = a - b;
		        a = a - b;
		        
		        //Imprimir Resultado
		        System.out.println("El valor de A es " + a + "  Y el valor de  B es " + b);                                   
		       
		        teclado.close();
		        
	
	
	
				}
		}
		
		
		
		
		
		
		
		


