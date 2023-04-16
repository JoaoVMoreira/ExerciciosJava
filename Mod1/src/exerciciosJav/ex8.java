package exerciciosJav;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		/*
		 8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: 
V = 3.14159 * R * R * A 
Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double r, a, v;
		
		System.out.print("Informe o raio da lata: ");
		r = scan.nextDouble();
		
		System.out.print("Informe a altura da lata: ");
		a = scan.nextDouble();
		
		
		v = 3.14 * r * r * a;
		
		System.out.print(v);
	}
}
