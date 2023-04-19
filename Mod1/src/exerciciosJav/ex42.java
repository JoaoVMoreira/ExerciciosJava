package exerciciosJav;

import java.util.Scanner;

public class ex42 {
	public static void main(String[] args) {
		/*
42) Faça um programa que determine o maior e o menor entre N números lidos. A condição de parada é a entrada de 
um valor 0, ou seja, o programa deve ficar executando até que a entrada seja igual a 0 (ZERO).
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int maior = 0, menor = 9999999, numero;
		boolean continua = true;
		
		while(continua) {
			
			System.out.print("Informe um numero: ");
			numero = scan.nextInt();
			
			if(maior < numero) {
				maior = numero;
			}
			if (menor > numero) {
				menor = numero;
			}
			
			if(numero == 0) {
				continua = false;
			}
			
		}
		
		System.out.print(maior);
		System.out.print(menor);

		
	}
}
