/**
 * @author Vicent Casasús 
 * Ejercicio - Herencia
 * @since 2021-04-01
 */
public class Television extends Electrodomesticos{
	/**
	 *
	 *@param pulgadas Son las pulgadas que mide la TV.
	 *@param smartTV Es para saber si la TV es smartTV o no.
	 */
	private double pulgadas;
	private boolean smartTV;
	/**
	 * Declaración de Constructor Base
	 */
	public Television() {

	}
	/**
	 * Declaración de Constructor 1
	 * @param precio Es el precio de la TV
	 * @param peso Es el peso de la TV
	 */
	public Television(double precio, double peso) {

	}
	/**
	 * Declaración de Constructor 2
	 * @param resolucion Es la resolucion de la TV
	 * @param sintonizadorTDT Es si tiene TDT la TV
	 */
	public Television(int resolucion, String sintonizadorTDT) {

		/**
		 * Obtienes las pulgadas de la TV.
		 */		
	}
	
	public Television(double precioBase, String color, double peso, char consumoEnergetico, double pulgadas, boolean smartTV) {
		super(precioBase,color,peso,consumoEnergetico);
		this.pulgadas= pulgadas;
		this.smartTV = smartTV;
		
		
	}
	
	public double getPulgadas() {
		return pulgadas;
	}
	/**
	 * 
	 * Pones las pulgadas de la TV.
	 */		
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	/**
	 *Obtienes si la TV es smart o no.
	 * @return Si o No.
	 */		
	public boolean isSmartTV() {
		return smartTV;
	}
	/**
	 *Pone a la television como smartTV.
	 *@param smartTV Para saber si es smartTV o no
	 */		
	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	/**
	 *  Sobreescribe el precio final dependiendo de las pulgadas.
	 */
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		if(this.smartTV==true) {
			precioFinal = precioFinal+50;
			}
		if(this.pulgadas>40) {
			precioFinal = precioFinal*1.3;
		}
		return precioFinal;
	}
	
}
