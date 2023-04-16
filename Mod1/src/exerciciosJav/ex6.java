package exerciciosJav;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		/*
		6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de 
temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus 
Fahrenheit e a variável C representa é a temperatura em graus Celsius.
		 */
		
		double celc, fah;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Informe a temperatura: ");
		celc = scan.nextDouble();
		
		fah = (9 * celc + 160)/5;
		
		System.out.print(fah);
	}

}
