package exerciciosJav;

import java.util.Scanner;

public class ex51 {
	public static void main(String[] args) {
		/*
51) Fazer um programa para ler uma quantidade N de alunos. Ler a nota de cada um dos N alunos e calcular a média 
aritmética das notas. Contar quantos alunos estão com a nota acima de 7.0. Obs.: Se nenhum aluno tirou nota 
acima de 5.0, imprimir mensagem: Não há nenhum aluno com nota acima de 5.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		char[] alunos = new char[5];
		int[] nota = new int[5];
		int contaNota = 0;
		int contaNota2 = 0;
		int media = 0;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print("Informe o nome do aluno: ");
			alunos[i] = scan.next().charAt(i);
			scan.nextLine();
			
			System.out.print("Informe a nota do aluno: ");
			nota[i] = scan.nextInt();
			scan.nextLine();
			
			if(nota[i] > 7) {
				contaNota++;
			}
			
			if(nota[i] > 5) {
				contaNota2++;
			}
		}
		if(contaNota2 == 0) {
			System.out.println("Não há nenhum aluno com nota acima de 5. ");
		}
		
		System.out.println(contaNota + " alunos tiraram mais que 7");
	}
}
