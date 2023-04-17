package exerciciosJav;

import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		/*
15) Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi 
aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota 
do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7, 
apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado, 
apresentar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do 
aluno.
		 */
		
		double n1, n2, n3, n4, media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe uma nota: ");
		n1 = scan.nextDouble();
		System.out.print("Informe uma nota: ");
		n2 = scan.nextDouble();
		System.out.print("Informe uma nota: ");
		n3 = scan.nextDouble();
		System.out.print("Informe uma nota: ");
		n4 = scan.nextDouble();
		
		media = (n1 + n2 + n3 + n4)/4;
				
				
		System.out.print(media);
		
		if(media >= 7) {
			System.out.print("Aprovado");
		}else {
			System.out.print("Reprovado");
		}
		
	}
}
