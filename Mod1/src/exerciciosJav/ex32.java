package exerciciosJav;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		/*
32) Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros números inteiros positivos 
ímpares a partir do número informado pelo usuário menor que 10 e maior que zero.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int impar = 0, soma = 0;
		
		System.out.print("Informe um numero: ");
		int numero = scan.nextInt();
		
		int max = numero + 20;
		
		for(int i = numero; i < max; i++) {
			if(i%2 != 0) {
				impar += i;
			}
		}
		System.out.println(impar);

	}

}
