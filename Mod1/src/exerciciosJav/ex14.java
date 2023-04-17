package exerciciosJav;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		/*
14) Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Insira um numero: ");
		a = scan.nextInt();
		
		System.out.print("Insira um numero: ");
		b = scan.nextInt();
		
		if(a>b) {
			System.out.println(a);
			System.out.println(b);
		}else {
			System.out.println(b);
			System.out.println(a);
		}
		
	}
}
