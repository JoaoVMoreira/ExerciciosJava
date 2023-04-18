package exerciciosJav;

import java.util.Scanner;

public class ex37 {
	public static void main(String[] args) {
		/*
37) Faça um programa de conversão de base numérica. O programa deverá apresentar uma tela de entrada com as 
seguintes opções: 
1 – Adição 
2 – Subtração 
3 – Multiplicação 
4 – Divisão 
Informe a opção: 
A partir da opção escolhida, o programa deverá solicitar para que o usuário digite dois números. Em seguida, o 
programa deve exibir o resultado da opção indicada pelo usuário e perguntar ao usuário se ele deseja voltar ao 
menu principal. Caso a resposta seja ´S´ ou ´s´, deverá voltar ao menu, caso contrário deverá encerrar o 
programa. 
		 */
		
		Scanner scan = new Scanner(System.in);
		int escolha, n1, n2, result;
		String continua = "S";
						
		while(continua == "s" || continua == "S") {
		
			System.out.println("1 – Adição");
			System.out.println("2 – Subtração");
			System.out.println("3 – Multiplicação");
			System.out.println("4 – Divisão");
			System.out.print("Escolha uma opção: ");
			escolha = scan.nextInt();
			scan.nextLine();
			
			System.out.println("Informe o primeiro numero: ");
			n1 = scan.nextInt();
			scan.nextLine();
			System.out.println("Informe o segundo numero: ");
			n2 = scan.nextInt();
			scan.nextLine();
			
			if(escolha == 1) {
				result = n1 + n2;
				System.out.println(result);
			}else if(escolha == 2) {
				result = n1 - n2;
				System.out.println(result);
			}else if(escolha == 3) {
				result = n1 * n2;
				System.out.println(result);
			}else if(escolha == 4) {
				result = n1 / n2;
				System.out.println(result);
			}else {
				System.out.print("Escolha inválida");
			}
			
			System.out.print("Deseja realizar outra conta? ");
			continua = scan.next();
			
			if(continua == "s" || continua == "S") {
				return;
			}else {
				System.out.print(continua);
				System.out.print("FIM");
				break;
			}

	}
}
