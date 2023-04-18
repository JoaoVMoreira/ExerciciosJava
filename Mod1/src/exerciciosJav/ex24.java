package exerciciosJav;

import java.util.Scanner;

public class ex24 {
	public static void main(String[] args) {
		/*
24) Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja 
realizar: 
1 – Verificar se um dos números lidos é ou não múltiplo do outro 
2 – Verificar se os dois números lidos são pares 
3 – Verificar se a média dos dois números é maior ou igual a 7. 
4 – Sair 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int resultado;
		
		System.out.println("1 – Verificar se um dos números lidos é ou não múltiplo do outro ");
		System.out.println("2 – Verificar se os dois números lidos são pares");
		System.out.println("3 – Verificar se a média dos dois números é maior ou igual a 7");
		System.out.println("4 – Sair ");
		
		System.out.print("Escolha uma opção: ");
		int opcao = scan.nextInt();
		
		System.out.print("Informe um numero: ");
		int n1 = scan.nextInt();
		
		System.out.print("Informe um numero: ");
		int n2 = scan.nextInt();
		
		if(opcao == 1) {
			if(n1%n2 == 0) {
				System.out.print("Os numeros são multiplos.");
			}else {
				System.out.print("Os numeros não são multiplos.");
			}
		}else if(opcao == 2) {
			if(n1%2 == 0 && n2%2 == 0) {
				System.out.print("Os numeros são pares.");
			}else {
				System.out.print("Os numeros são impares.");
			}
		}else if(opcao == 3) {
			resultado = n1 + n2 / 2;
			if(resultado >= 7) {
				System.out.print("A média é maior que 7.");
			}else {
				System.out.print("A média é menor que 7.");
			}
		}else {
			System.out.print("Adeus!");
		}
		
		
	}
}
