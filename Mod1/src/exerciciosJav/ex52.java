package exerciciosJav;

import java.util.Scanner;

public class ex52 {

	public static void main(String[] args) {
		/*
52) Fazer um programa ler um vetor de inteiros e positivos e imprimir quantas vezes aparece o número 1, 3 e 4, nesta 
ordem. O vetor terá no máximo 100 posições. Sair do programa quando for digitado -1.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int[] Vetor = new int[100];
		int i = 0, um = 0, tres = 0, quatro = 0;
		boolean continua = true;
		
		while(continua) {
			System.out.print("Informe um numero: ");
			Vetor[i] = scan.nextInt();
			
			if(Vetor[i] < 0) {
				System.out.println("Adeus");
				continua = false;
			}
			
			if(Vetor[i] == 1) {
				um++;
			}else if(Vetor[i] == 3) {
				tres++;
			}else if(Vetor[i] == 4) {
				quatro++;
			}
			i++;
		}
		
		System.out.println(um);
		System.out.println(tres);
		System.out.println(quatro);

	}

}
