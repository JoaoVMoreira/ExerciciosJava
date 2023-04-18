package exerciciosJav;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		/*
22) Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o 
resultado. 

		 */
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, numero;
		
		System.out.print("Informe um numero: ");
		numero = scan.nextInt();
		
		
		if(numero > 0) {
			a = numero;
			System.out.print("positivo"+a);
		}else {
			b = numero;
			System.out.print("negativo" + b);
		}
		
		
	}

}
