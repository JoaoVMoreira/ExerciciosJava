package exerciciosJav;

import java.util.Scanner;

public class ex19 {
	public static void main(String[] args) {
		/*
19) Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se cada 
lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o triângulo é 
eqüilátero; Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso 
contrário, o triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a 
ocorrência.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Informe um numero: ");
		a = scan.nextInt();
		
		System.out.print("Informe um numero: ");
		b = scan.nextInt();
		
		System.out.print("Informe um numero: ");
		c = scan.nextInt();
		
		if(a < (b + c) || b < (a + c) || c < (b + a)) {
			if(a==b && b==c) {
				System.out.print("O triangulo e equilatero.");
			}else if(a==b || b==c) {
				System.out.print("O triangulo e isoceles.");
			}
		}else {
			System.out.print("O triangulo e escaleno.");
		}
	}
}
