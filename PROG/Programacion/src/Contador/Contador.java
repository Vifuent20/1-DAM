package Contador;

public class Contador {
	private int cont = 0;
	
	public Contador(){
		
	}
	public Contador(Contador cont2){
		this.cont = cont2.cont;

	}
	
	public Contador(int cont){
		this.cont = cont;
		
		if(cont < 0) {
			this.cont  = 0;
		}
	}
	
	
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public int incrementar() {
		if(cont < 0) {
			this.cont  = 0;
		}else {
		cont = cont+1;
		}
		return cont;
	}
	
	public int decrementar() {
		if(cont < 0) {
			this.cont  = 0;
		}else {
		cont = cont-1;
		}
		return cont;
	}
}
