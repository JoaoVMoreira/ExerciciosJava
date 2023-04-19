package exerciciosJav;

import java.util.Scanner;

public class ex48 {
	public static void main(String[] args) {
		/*
48) Uma agência de publicidade pediu à agência de modelos Luz & Beleza para encontrar uma modelo que tenha 
idade entre 18 e 20 anos para participar de uma campanha publicitária milionária de produtos de beleza. Foram 
inscritas 20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informações foram armazenadas em 
2 vetores distintos. Faça um programa para imprima o vetor que contém os nomes das candidatas aptas a 
concorrer a uma vaga para a campanha milionária. 
		 */
		
		char[] nomes = new char[5];
		int[] idade = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Informe o nome da candidata: ");
			nomes[i] = scan.next().charAt(i);
			scan.nextLine();
			
			System.out.print("Informe a idade da candidata: ");
			idade[i] = scan.nextInt();
			scan.nextLine();
		}
		
		for(int i = 0; i < 5; i ++) {
			if(idade[i] >= 18) {
				System.out.println(nomes[i]);
			}
		}
		
		
	}
}
