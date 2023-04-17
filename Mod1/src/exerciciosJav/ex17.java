package exerciciosJav;

import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		/*
17) Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa 
entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”. 
Caso contrário, apresentar a mensagem “valor inválido”.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int a = scan.nextInt();
		
		
		if(a > 0 && a <= 9) {
			System.out.print("Valor valido");
		}else {
			System.out.print("Valor invalido");
		}
	}
}
