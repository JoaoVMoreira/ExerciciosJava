package exerciciosJav;

import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		/*
33) Escreva um programa que calcule e exiba a média da nota dos alunos de uma turma em uma prova. O número de 
alunos é desconhecido. Os dados de um aluno são: número de matrícula e a sua nota na prova em questão.
		 */
		
		Scanner scan = new Scanner(System.in);
		double matricula = 0, nota, media, i = 0, somaNota = 0;
		while(matricula >= 0) {
			System.out.print("Informe o numero da matricula do aluno: ");
			matricula = scan.nextDouble();
			System.out.print("Informe a nota do aluno: ");
			nota = scan.nextDouble();
			i++;
			somaNota += nota;
		}
		System.out.print("A media da turma é: "+somaNota/i);
		
		
		
	}

}
