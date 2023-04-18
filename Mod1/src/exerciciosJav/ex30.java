package exerciciosJav;

import java.util.Scanner;

public class ex30 {
	public static void main(String[] args) {
		/*
30) Faça um programa para imprimir uma tabuada. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int numero = scan.nextInt();
		
		int i = 0;
		
		while(i < 10 + 1) {
			System.out.println(numero + " X " + 1 + " = " + numero * i);
			i++;
		}
	}
}
