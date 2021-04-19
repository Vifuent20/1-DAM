/**
 * @author Vicent Casasús 
 * Ejercicio - Herencia
 * @since 2021-04-01
 */

/**
 * Declaración de Main
 */
public class Main {

	public static void main(String[] args) {

		
		Lavadora lavadora = new Lavadora(100.0,"negro",50.0,'C', 50.0);
		System.out.println("Color:" + lavadora.getColor());
		System.out.println("Peso:" + lavadora.getPeso());
		System.out.println("PrecioBase:" + lavadora.getPrecioBase());
		System.out.println("Consumo:" + lavadora.getConsumoEnergetico());
		System.out.println("Carga:" + lavadora.getCarga());
		System.out.println("PrecioFinal:" + lavadora.precioFinal());
		System.out.println(" ");
		
		Television television = new Television(100.0,"rosa", 30.0,'A', 65.0, true);
		System.out.println("Color:" + television.getColor());
		System.out.println("Peso:" + television.getPeso());
		System.out.println("PrecioBase:" + television.getPrecioBase());
		System.out.println("Consumo:" + television.getConsumoEnergetico());
		System.out.println("PrecioFinal:" + television.precioFinal());
	}

}
