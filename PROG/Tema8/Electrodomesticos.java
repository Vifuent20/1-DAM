/**
 * @author Vicent Casasús 
 * Ejercicio - Herencia
 * @since 2021-04-01
 */
public class Electrodomesticos {
	/**
	 * @param precioBase Es el precio base del Electrodomestico
	 * @param color Es el color del Electrodomestico
	 * @param peso Es el peso del Electrodomestico
	 * @param consumoEnergetico Es el consumo energetico del Electrodomestico
	 */
	public double precioBase;
	public String color;
	public double peso;
	public char consumoEnergetico;
	

	/**
	 * Declaración de Constructor Base
	 * 
	 */
	public Electrodomesticos() {
		this.color="blanco";
		this.consumoEnergetico='F';
		this.precioBase=100;
		this.peso=5;
		
	}
	/**
	 * Declaración de Constructor 1
	 */
	public Electrodomesticos(double precio, double peso) {

	}
	/**
	 * Declaración de Constructor 2
	 */
	public Electrodomesticos(double precioBase, String color, double peso, char consumoEnergetico) {

		this.precioBase=precioBase;
		this.color=comprobarColor(color);
		this.peso=peso;
		this.consumoEnergetico=comprobarConsumo(consumoEnergetico);


	}
	/**
	 *Obtienes el precio base del Electrodomestico.
	 */
	public double getPrecioBase() {
		return precioBase;
	}
	/**
	 * Pones el precio base del Electrodomestico.
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}	
	/**
	 *Obtienes el color del Electrodomestico.
	 */

	public String getColor() {
		return this.color;
	}
	/**
	 * Pones el color del Electrodomestico.
	 */
	public String setColor(String color) {
		return this.color = color;
	}
	/**
	 *Obtienes el peso del Electrodomestico.
	 */
	public double getPeso() {
		return this.peso;
	}
	/**
	 *Pones el peso del Electrodomestico.
	 * @return 
	 */
	public double setPeso(double peso) {
		return this.peso = setPeso(peso);
	}
	/**
	 * Obtienes el consumo energetico del Electrodomestico.
	 */
	public char getConsumoEnergetico() {
		return this.consumoEnergetico;
	}
	/**
	 * Pones el consumo energetico del Electrodomestico.
	 */
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = comprobarConsumo(consumoEnergetico);
	}
	/**
	 *Método comprobar consumo del Electrodomestico.
	 */
	public char comprobarConsumo(char letra) {

		if(this.consumoEnergetico>= 'A' && this.consumoEnergetico<='F') {
			return this.consumoEnergetico = letra;

		}
		else {
			this.consumoEnergetico='F';
		}
		return letra;
	}
	/**
	 *  Método comprobar el color del Electrodomestico.
	 */
	protected String comprobarColor(String color) {

		if(color=="blanco" || color=="negro" || color=="rojo" || color=="azul" || color=="gris") {
			this.color=color;
		}
		else {
			this.color="blanco";
		}
		return this.color;
	}
	/**
	 *  Método precio final dependiendo del consumo energetico y el peso del Electrodomestico.
	 */
	public double precioFinal() {
		double precioFinal = 0;
		if(this.consumoEnergetico=='A') {
			precioFinal=precioFinal+100;
		}
		if(this.consumoEnergetico=='B') {
			precioFinal=precioFinal+80;
		}
		if(this.consumoEnergetico=='C') {
			precioFinal=precioFinal+60;
		}
		if(this.consumoEnergetico=='D') {
			precioFinal=precioFinal+50;
		}
		if(this.consumoEnergetico=='E') {
			precioFinal=precioFinal+30;
		}
		if(this.consumoEnergetico=='F') {
			precioFinal=precioFinal+10;
		}

		if(this.peso<19) {
			precioFinal=precioFinal+10;
		}
		if(this.peso>20 && this.peso<49) {
			precioFinal=precioFinal+50;
		}
		if(this.peso>=50 && this.peso<79) {
			precioFinal=precioFinal+80;
		}
		if(this.peso>79) {
			precioFinal=precioFinal+100;
		}
		return precioFinal+this.precioBase;
	}

}
