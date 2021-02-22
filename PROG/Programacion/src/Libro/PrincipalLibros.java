package Libro;
import Libro.Libro;
public class PrincipalLibros {

	public static void main(String[] args) {
		Libro L1 = new Libro("La nocha ", "Paquito", 3, 1);
		Libro L2 = new Libro("La dio ", "Paquet", 5, 1);
		Libro L3 = new Libro("Robertinho ", "Paquito", 4, 1);
		Libro L4 = new Libro("Pantalla ", "Paquito", 12, 11);


		System.out.println(L1.getEjemplares());
		System.out.println(L3.getAutor());
		System.out.println(L4.getTitulo());
		System.out.println(L2.getEjemplaresPrestados());

		L1.devolucion();
		L2.prestamo();
		L3.devolucion();
		L4.prestamo();

		System.out.println(L2.getEjemplares());
		System.out.println(L4.getAutor());
		System.out.println(L3.getTitulo());
		System.out.println(L1.getEjemplaresPrestados());                                                                                           
	}

}
