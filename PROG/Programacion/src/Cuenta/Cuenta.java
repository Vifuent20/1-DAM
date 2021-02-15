package Cuenta;

public class Cuenta {

	private String nombre;
	private String numero;
	private double tipo;
	private double saldo;
	
	public Cuenta() {
		
	}
	public Cuenta(Cuenta cuenta1) {
		this.nombre = cuenta1.nombre;
		this.numero = cuenta1.numero;
		this.tipo = cuenta1.tipo;
		this.saldo = cuenta1.saldo;
	}
	public Cuenta(String nombre, String numero, double tipo, double saldo) {
		this.nombre = nombre;
		this.numero = numero;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCuenta() {
		return numero;
	}

	public void setNumeroCuenta(String numero) {
		this.numero = numero;
	}

	public double getTipoInteres() {
		return tipo;
	}

	public void setTipoInteres(double tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean ingreso(double cantidad) {
		if(saldo > 0) {
		this.saldo = saldo + cantidad;	
		}
		return true;
	}
	public boolean reintegro(double cantidad) {
		if(saldo > 0) {
		this.saldo = saldo - cantidad;	
		}
		return true;
	}
	public boolean transferencia(Cuenta c,double ingreso) {
		if(saldo < this.saldo) {
		this.saldo = c.saldo + ingreso;	
		}
		return true;
	}
}
	
