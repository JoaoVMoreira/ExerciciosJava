package exerciciosJav;

import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
		/*
16) Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do 
menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
		 */
		Scanner scan  = new Scanner(System.in);
		
		int a, b, maior;
		
		System.out.print("Informe um numero: ");
		a = scan.nextInt();
		System.out.print("Informe um numero: ");
		b = scan.nextInt();
		
		if(a>b) {
			maior = a;
			System.out.print(maior);
		}else if(b > a) {
			maior = b;
			System.out.print(maior);
		}if (a == b) {
			System.out.print("Os numeros são iguais.");
		}
	}
}
