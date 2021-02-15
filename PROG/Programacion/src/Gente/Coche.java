package Gente;

public class Coche {

	private String marca;
	private String color;
	private String modelo;

	public Coche() {

	}

	public Coche(String marca, String color, String modelo) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String Marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String Color) {
		this.color = color;
	}
	
}
