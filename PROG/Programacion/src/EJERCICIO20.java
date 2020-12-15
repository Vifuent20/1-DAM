public class EJERCICIO20 {

	public static void main(String[] args) {
	
		//En la siguiente línea introducimos la base y la altura del triangulo
		
		int altura = 3;
		int base = 3;

		//En este for le decimos que cuando la base sea menor a la altura que pase, base es un contador, no la base del triangulo.
		for (int cont = 0; cont < altura; cont++) {
		//En este for le decimos el numero de asteriscos que habra, asterisco ira sumando 1 cada linea hasta igualar la base.
		for (int asterisco = 0; asterisco < cont; asterisco++)	 {		
		System.out.print("*");
				}
		System.out.println("*");
		}
}		

}



