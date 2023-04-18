package exerciciosJav;

import java.util.Scanner;

public class ex39 {
	public static void main(String[] args) {
		/*
39) Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
e se é positivo ou negativo. O programa só deve parar de rodar quando o usuário responder "S" na seguinte 
pergunta, "Deseja encerrar o programa?" . 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		boolean continua = true;
		int numero;
		char escolha;
		
		while(continua == true) {
			System.out.print("Informe um numero: ");
			numero = scan.nextInt();
			
			//Par ou impar
			if(numero%2 == 0) {
				System.out.println("Este numer é impar. ");
			}else {
				System.out.println("Este numero é par");
			}
			
			
			//Positivo ou negativo
			if(numero < 0) {
				System.out.println("Este numero é negativo.");
			}else {
				System.out.println("Este numero é positivo. ");
			}
			
			System.out.println("Desenha encerrar o programa? [S/N] ");
			escolha = scan.next().charAt(0);
			
			if(escolha == 'S' || escolha == 's') {
				System.out.print("Adeus! ");
				break;
			}
			
		}
	}
}
