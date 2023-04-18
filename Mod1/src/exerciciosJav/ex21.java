package exerciciosJav;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		/*
21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é 
positivo ou negativo. Pare a execução do programa quando o usuário requisitar. 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		
		System.out.print("Informe um numero: ");
		a = scan.nextInt();
		
		if(a > 0) {
			System.out.print("Positivo");
		}else {
			System.out.print("Negativo");
		}
		

	}

}
