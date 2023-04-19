package exerciciosJav;

import java.util.Scanner;

public class ex47 {
	public static void main(String[] args) {
		/*
47) Considere um vetor de 10 números inteiros positivos maiores que zero e um único número inteiro, também positivo 
e maior que zero. Faça um programa para: 
a. ler pelo teclado o vetor; 
b. ler pelo teclado o número X; 
c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int[] Vetor = new int[10];
		int numero, igual = 0, maior = 0, menor = 0; 
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe um numero para o vetor: ");
			Vetor[i] = scan.nextInt();
			scan.nextLine();
		}
		
		System.out.print("Informe um numero: ");
		numero = scan.nextInt();
		
		for(int i = 0; i < 10; i++) {
			if(Vetor[i] < numero) {
				menor++;
			}else if(Vetor[i] > numero) {
				maior++;
			}else if(Vetor[i] == numero) {
				igual++;
			}
		}
		
		System.out.println(igual);
		System.out.println(menor);
		System.out.println(maior);
		
	}
}
