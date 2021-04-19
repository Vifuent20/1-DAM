
/**
 * @author Vicent Casasús 
 * Ejercicio - Herencia
 * @since 2021-04-01
 */
public class Lavadora extends Electrodomesticos{
	/**
	 * @param carga Es la carga que la lavadora puede aguantar.
	 */
	private double carga;
	/**
	 * Declaración de Constructor Base 
	 */

	public Lavadora() {

	}
	/**
	 * Declaración de Constructor 1
	 */
	public Lavadora(double precio, double peso) {

	}
	/**
	 * Declaración de Constructor 2
	 */
	public Lavadora(double precioBase, String color, double peso, char consumoEnergetico, double carga) {
		super(precioBase,color,peso,consumoEnergetico);
		this.carga = carga;
	
	}
	
	/**
	 *Obtienes la carga de la Lavadora.
	 */
	public double getCarga() {
		return carga;
	}
	/**
	 *Pones carga a la Lavadora.
	 */
	public void setCarga(double carga) {
		this.carga = carga;
	}
	/**
	 * @Override Sobreescribe el precio final dependiendo de la carga.
	 */
	@Override
	public double precioFinal() {
		
		double precioFinal = super.precioFinal();
		if(this.carga>30) {
			precioFinal=precioFinal+50;
		}
		return precioFinal;
	}

}
