package exerciciosJav;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		/*
31) Escrever um programa que leia um conjunto de números positivos, e exiba se o número lido é par ou ímpar. Exiba 
ao final a soma total dos números pares lidos e também a soma dos números ímpares lidos. Suporemos que o 
número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o 
fim dos dados. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int par = 0, impar = 0, numero = 0;
		
		while(numero >= 0) {
			System.out.print("Informe um numero: ");
			numero = scan.nextInt();
			if(numero%2 == 0) {
				par++;
			}else {
				impar++;
			}
			System.out.println("Impar: "+impar);
			System.out.println("Par: "+par);
			
		}
		

	}

}
