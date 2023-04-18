package exerciciosJav;

import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		/*
34) Escreva um programa que leia um conjunto de números positivos e exiba o menor e o maior. Suporemos que o 
número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o 
fim dos dados. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int maior = 0, menor = 9999, numero = 0;
		
		while(numero >= 0) {
			System.out.print("Informe um numero: ");
			numero = scan.nextInt();
			if(numero > maior) {
				maior = numero;
			}else if(numero < menor && numero >= 0) {
				menor = numero;
			}
		}
		
		System.out.println(maior);
		System.out.print(menor);

	}

}
