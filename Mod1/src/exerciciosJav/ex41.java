package exerciciosJav;

import java.util.Scanner;

public class ex41 {

	public static void main(String[] args) {
		/*
41) Faça um programa que dada a idade de um nadador, classifique-o em uma das seguintes categorias: 
- Infantil A = 5 a 7 anos 
- Infantil B = 8 a 11 anos 
- Juvenil A = 12 a 13 anos 
- Juvenil B = 14 a 17 anos 
- Adultos = Maiores de 18 anos
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
		int idade = scan.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.print("Infantil A");
		}else if(idade > 7 && idade <= 11) {
			System.out.print("Infantil B");
		}else if(idade > 11 && idade <=13) {
			System.out.print("Juvenil A");
		}else if(idade > 13 && idade <= 17) {
			System.out.print("Juvenil B");
		}else if(idade > 18) {
			System.out.print("Adulto");
		}

	}

}
