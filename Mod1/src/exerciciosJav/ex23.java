package exerciciosJav;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		/*
23) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: 
1 – Adição 
2 – Subtração 
3 – Multiplicação 
4 – Divisão 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int resultado, opcao, n1, n2;
		
		System.out.print("1 – Adição ");
		System.out.print("2 – Subtração ");
		System.out.print("3 – Multiplicação ");
		System.out.print("4 – Divisão ");
		
		System.out.print("Escolha uma opção: ");
		opcao = scan.nextInt();
		
		System.out.print("Informe um numero: ");
		n1 = scan.nextInt();
		
		System.out.print("Informe um numero: ");
		n2 = scan.nextInt();
		
		if(opcao == 1) {
			resultado = n1 + n2;
			System.out.print(resultado);
		}else if(opcao == 2) {
			resultado = n1 - n2;
			System.out.print(resultado);
		}else if(opcao == 3) {
			resultado = n1 * n2;
			System.out.print(resultado);
		}else if(opcao == 4) {
			resultado = n1 / n2;
			System.out.print(resultado);
		}
		
		
		

	}

}
