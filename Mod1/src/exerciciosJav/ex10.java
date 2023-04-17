package exerciciosJav;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		/*
		10) Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes 
entre eles. Os relacionamentos possíveis são: Igual, Não igual. 
		 */
		
		int n1, n2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		n1 = scan.nextInt();
		
		System.out.print("Informe mais um numero: ");
		n2 = scan.nextInt();
		
		if(n1 == n2) {
			System.out.print("Os numeros são iguais");
		}else if(n1 != n2) {
			System.out.print("Os numeros não são iguais");
		}
		
		
		
	}
}
