package exerciciosJav;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		/*
		 7) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de 
temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a 
variável C é a temperatura em graus Celsius.
		 */
		
		double celc, fah;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a temperatura: ");
		fah = scan.nextDouble();
		
		celc = ((fah -32)*5)/9;
		
		System.out.print(celc);
				
	}
}
