package exerciciosJav;

import java.util.Scanner;

public class ex25 {
	public static void main(String[] args) {
		/*
25) Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal, 
utilizando as seguintes fórmulas: (h = altura) 
- Para homens: (72.7*h) - 58 
- Para mulheres: (62.1 *h) - 44.7
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double altura, peso;
		char sexo;
		
		System.out.print("Informe seu sexo: ");
		sexo = scan.next().charAt(0); //Recebendo valore em char
		scan.nextLine();
		
		System.out.print("Informe sua altura: ");
		altura = scan.nextDouble();
		scan.nextLine();
		
		if(sexo == 'H' || sexo == 'h') {
			peso = (72.7*altura)-58;
			System.out.print(peso);
		}else if(sexo == 'M' || sexo == 'm') {
			peso = (62.1*altura)-44.7;
			System.out.print(peso);
		}else {
			System.out.print("Sexo inválido");
		}
	}
}
