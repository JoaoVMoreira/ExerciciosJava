package exerciciosJav;

import java.util.Random;
import java.util.Scanner;

public class ex50 {
	public static void main(String[] args) {
		/*
50) Fazer um programa que sorteie um número de 0 a 100 e que permita que o usuário (sem conhecer o número 
sorteado) tente acertar. Caso não acerte, o programa deve imprimir uma mensagem informando se o número
sorteado é maior ou menor que a tentativa feita. Ao acertar o número, o programa deve imprimir a quantidade de 
tentativas feitas. 
		 */
		
		Scanner scan = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int min = 0, max = 100, chute;  
		int numero = aleatorio.nextInt(max - min + 1);
		int[] tentativas = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Informe um numero: ");
			chute = scan.nextInt();
			
			if(numero == chute) {
				System.out.println("Você acertou");
				i = 5;
			}
			
			if(numero < chute) {
				System.out.println("O numero é menor");
				tentativas[i] = chute;
			}
			
			if(numero > chute) {
				System.out.println("O numero é maior");
				tentativas[i] = chute;
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(tentativas[i]);
		}
		System.out.println(numero);
	}
}
