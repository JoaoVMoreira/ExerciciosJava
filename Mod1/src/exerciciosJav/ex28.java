package exerciciosJav;

import java.util.Scanner;

public class ex28 {
	public static void main(String[] args) {
		/*
28) Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int numero = scan.nextInt();
		
		while(numero < 200) {
			if(numero%2 != 0) {
				System.out.println(numero);
			}
			numero++;
		}
	}
}
