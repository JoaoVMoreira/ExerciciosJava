package exerciciosJav;

import java.util.Scanner;

public class ex40 {
	public static void main(String[] args) {
		/*
40) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de indústrias que são 
altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe 
para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as 
industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos 
devem ser notificados a paralisarem suas atividades. Faça um programa que leia o índice de poluição medido e 
emita a notificação adequada aos diferentes grupos de empresas. O algoritmo só deve parar de rodar quando o 
usuário responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
		 */
		
		Scanner scan = new Scanner(System.in);
		
		boolean continua = true;
		double idp = 0;
		
		while(continua) {
			System.out.print("Informe o indice de poluição: ");
			idp = scan.nextDouble();
			
			if(idp == 0.3 && idp < 0.4) {
				System.out.print("As indústrias do 1º grupo devem suspender suas atividades");
			}else if(idp == 0.4 && idp < 0.5) {
				System.out.print("Todos os grupos devem suspender suas atividades");
			}
		}
	}
}
