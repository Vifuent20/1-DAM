import java.util.Scanner;

public class P155_perimetroRectangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
			
		int base, altura, total;
		
		base = sc.nextInt();
		altura = sc.nextInt();
		
		while(base >= 0 && altura >= 0) {
		total = ((base*2)+ (altura*2));
		base = sc.nextInt();
		altura = sc.nextInt();
		System.out.println(total);
		}
		

	}

}
