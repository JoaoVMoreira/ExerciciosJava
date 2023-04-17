package exerciciosJav;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		/*
12) Escreva um programa que leia um número inteiro e exiba o seu módulo. 
O módulo de um número x é: 
x se x é maior ou igual a zero 
x * (-1) se x é menor que zero 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int x, mod;
		
		System.out.print("Informe um numero");
		x = scan.nextInt();
		
		
		if(x >= 0) {
			mod = x;
			System.out.print(mod);
		}else {
			mod = x * (-1);
			System.out.print(mod);
		}
		
		
		
	}
}
