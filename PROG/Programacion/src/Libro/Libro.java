package Libro;

public class Libro {

	private String titulo;
	private String autor;
	private int ejemplares;
	private int ejemplaresPrestados;


	public Libro(){

	}

	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados){
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public boolean prestamo(){
		if (ejemplaresPrestados > 0) {
			this.ejemplaresPrestados = ejemplaresPrestados+1;
		}
		return true;
	}


	public boolean devolucion() {
		if (ejemplares > 0) {
			this.ejemplares = ejemplares-1;
		}
		return true;
	}
}


