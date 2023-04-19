package exerciciosJav;

import java.util.Scanner;

public class ex49 {
	public static void main(String[] args) {
		/*
49) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes 
que V1 e V2 possuem valores idênticos nas mesmas posições. 
		 */
		
		Scanner scan  = new Scanner(System.in);
		
		int[] V1 = new int [5];
		int[] V2 = new int [5];
		
		int igual = 0;
		
		for(int i  = 0; i < 5; i++) {
			System.out.print("Informe um numero: ");
			V1[i] = scan.nextInt();
			
			System.out.print("Informe um numero: ");
			V2[i] = scan.nextInt();
		}
		
		//Verificação
		for(int i = 0; i < 5; i++) {
			if(V1[i] == V2[i]) {
				igual++;
			}
		}
		
		System.out.print(igual);
	}
}
