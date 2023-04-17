package exerciciosJav;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		/*
		 11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a 
possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, troca;
		
		
		System.out.print("Informe um numero: ");
		a = scan.nextInt();
		
		System.out.print("Informe mais um numero: ");
		b = scan.nextInt();
		
		troca = a;
		a = b; 
		b = troca;
		
		System.out.print(a);
		System.out.print(b);
																																																																																																																																																																																																																																																																																																																																																															
	}
}
