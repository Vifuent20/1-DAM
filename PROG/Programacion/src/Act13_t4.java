package Funciones;

import java.util.Scanner;

public class Act13_t4 {

	public static int numeroDigits(int numero) {
		int digits = 0;
		int aux = numero;

		while (aux != 0) {
			aux = aux / 10;
			digits++;
		}
		return digits;
	}

	public static int[] crearArray(int numero) {

		int digitos = numeroDigits(numero);
		int[] numeroConvertit = new int[digitos];
		int aux = numero;

		for (int i = 0; i < digitos; i++) {
			numeroConvertit[i] = aux % 10;
			aux = aux / 10;

		}

		return numeroConvertit;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, digits;

		System.out.println("Introduce el número que quieres analizar");
		num = sc.nextInt();

		int[] numeroConvertit = crearArray(num);
		int sumaPares = 0;

		System.out.print("pares ");
		for (int i = numeroConvertit.length - 1; i >= 0; i--) {
			if (numeroConvertit[i] % 2 == 0) {
				System.out.print(numeroConvertit[i]);
				sumaPares = sumaPares + numeroConvertit[i];

			}
		}
		System.out.println(" Suma de los digitos pares " + sumaPares);

	}
}