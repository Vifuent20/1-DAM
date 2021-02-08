/**
 * 
 */
	import java.util.Scanner;
/**
 * @author DAM
 *
 */
public class ejercicio12 {

	/**
	 * @param Programa que pinta una L.
	 */
		static Scanner sc = new Scanner(System.in);
		
		public static int pintarEle(int alt) {
			int res = 0;
			int base = 0;
			
			for (int i = 0; i < (alt-1); i++) {
				System.out.println("*");
			}
			
			base = alt/2;
			base = base + 1;
			
			for (int i = 0; i < base; i++) {
				System.out.print("*");
			}
			
			return res;
		}
		
		public static void main(String[] args) {
			int alt;
			int res;
			
			
			System.out.println("Dime la altura de la L");
			alt = sc.nextInt();
			
			res = pintarEle(alt);
			sc.close();
			} 
	

	}


