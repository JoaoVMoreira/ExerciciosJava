package exerciciosJav;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		/*
		9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa 
pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. 
		 */
		
		int ano, dia, mes, tot, anoTot, mesTot;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Anos: ");
		ano = scan.nextInt();
		
		System.out.print("Meses: ");
		mes = scan.nextInt();
		
		System.out.print("Dias: ");
		dia = scan.nextInt();
		
		anoTot = ano * 365;
		mesTot = mes * 30;
		
		tot = anoTot + mesTot + dia;
		
		System.out.print(tot);
		
	}
}
