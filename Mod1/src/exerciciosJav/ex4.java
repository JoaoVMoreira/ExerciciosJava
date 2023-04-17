package exerciciosJav;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		/*
4) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os 
valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis 
A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B 
com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo, 
devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as 
multiplicações.
*/
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d, resultado;
		
		System.out.print("Insira um valor: ");
		a = scan.nextInt();
		System.out.print("Insira um valor: ");
		b = scan.nextInt();
		System.out.print("Insira um valor: ");
		c = scan.nextInt();
		System.out.print("Insira um valor: ");
		d = scan.nextInt();
		
		resultado = (a * c + a * d) + (b * c + b * d);
		
		System.out.print(resultado);
		
	}

}
