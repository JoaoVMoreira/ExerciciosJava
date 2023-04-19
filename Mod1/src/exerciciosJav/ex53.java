package exerciciosJav;

import java.util.Scanner;

public class ex53 {
	public static void main(String[] args) {
		/*
53) Durante uma corrida de automóveis com N voltas de duração foram anotados para um piloto, na ordem, os 
tempos registrados em cada volta. Fazer um programa para ler os tempos das N voltas, calcular e imprimir: 
i. melhor tempo; 
ii. a volta em que o melhor tempo ocorreu; 
iii. tempo médio das N voltas; 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double[] tempo = new double[100];
		boolean continua = true;
		int i = 0, volta = 0;
		double melhor = 99999999, media = 0, somaTempo = 0;
		while(continua) {
			System.out.print("Informe o tempo da volta: ");
			tempo[i] = scan.nextDouble();
			
			if(melhor > tempo[i]) {
				melhor = tempo[i];
				volta = i;
			}
			
			somaTempo += tempo[i];
			
			
			if(tempo[i] < 0) {
				continua = false;
			}
			
			i++;
		}
		
		media = somaTempo/i;
		
		System.out.println(media);
		System.out.println(melhor);
		System.out.println(volta);
		
	}
}
