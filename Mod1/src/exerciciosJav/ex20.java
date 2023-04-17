package exerciciosJav;

import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {
		/*
20) Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor maior que zero para cada 
variável (se o valor digitado não é válido, mostrar mensagem e ler novamente). Exibe o menor valor lido 
multiplicado pelo maior e o maior valor dividido pelo menor.
		 */
		
		int a, b, c, menor, maior;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Informe um numero: ");
		a = scan.nextInt();
		System.out.print("Informe um numero: ");
		b = scan.nextInt();
		System.out.print("Informe um numero: ");
		c = scan.nextInt();
		
		if(a != 0 && b != 0 && c != 0) {
			
			if(a > b) {
				maior = a;
				menor = b;
			}else {
				maior = b;
				menor = a;
			}
			if(maior < c) {
				maior = c;
			}
			
			if(menor > c) {
				menor = c;
			}
			
			System.out.print(menor);
			System.out.print(maior);
			
		}else {
			System.out.print("Valor invalido");
		}
		
	}
}
