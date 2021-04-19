
/**
 * @author Vicent Casas�s 
 * Ejercicio - Herencia
 * @since 2021-04-01
 */
public class Lavadora extends Electrodomesticos{
	/**
	 * @param carga Es la carga que la lavadora puede aguantar.
	 */
	private double carga;
	/**
	 * Declaraci�n de Constructor Base 
	 */

	public Lavadora() {

	}
	/**
	 * Declaraci�n de Constructor 1
	 */
	public Lavadora(double precio, double peso) {

	}
	/**
	 * Declaraci�n de Constructor 2
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
