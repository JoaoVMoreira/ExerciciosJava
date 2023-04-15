package exerciciosJav;

import java.util.Scanner;

public class ex2 {

	/*
2) Faça um programa que: 
- Leia a cotação do dólar 
- Leia um valor em dólares 
- Converta esse valor para Real 
- Mostre o resultado 
*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double dolar, real, valor;
		
		System.out.print("Informe a cotação atual do dolar: ");
		dolar = scan.nextDouble();
		
		System.out.print("Informe o valor a ser calculado: ");
		valor = scan.nextDouble();
		
		real = dolar * valor;
		
		System.out.print("Valor total calculado: " + real);
		
	
		
	}
}
