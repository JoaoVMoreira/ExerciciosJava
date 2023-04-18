package exerciciosJav;

import java.util.Scanner;

public class ex36 {
	public static void main(String[] args) {
		/*
36) Faça um programa que leia 10 valores inteiros e positivos e: 
- Encontre o maior valor 
- Encontre o menor valor 
- Calcule a média dos números lidos
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int numero, maior = 0, menor = 99999999, somaNum = 0;
		
		for(int i = 0; i < 11; i++) {
			System.out.print("Informe um numero: ");
			numero = scan.nextInt();
			
			if(maior < numero) {
				maior = numero;
			}else if(menor > numero) {
				menor = numero;
			}
			somaNum += numero;
			
		}
		
		System.out.print("Maior: " + maior);
		System.out.print("Menor: " + menor);
		System.out.print("Media: " + somaNum/10);
	}

}
