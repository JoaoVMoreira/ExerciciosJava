package exerciciosJav;

import java.util.Scanner;

public class ex27 {
	public static void main(String[] args) {
		/*
27) Escreva um programa que leia: 
- a quantidade de números que deverá processar; 
- os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu fatorial. 
Lembrete: O fatorial de um número N é dado pela fórmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Informe um numero: ");
		int numero = scan.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			System.out.println(i);
			System.out.println(i * (i+1));
		}
	}
}
