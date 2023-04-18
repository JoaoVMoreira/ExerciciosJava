package exerciciosJav;

import java.util.Scanner;

public class ex38 {
	public static void main(String[] args) {
		/*
38) Faça um programa que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um 
operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 
50, calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora 
excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente. O 
programa só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o 
programa?". 
		 */
		
Scanner scan = new Scanner(System.in);
		
		int c, n, salario = 0, excedente = 0;
		boolean continua = true;
		String pergunta;
		while(continua) {
			System.out.print("Informe o numero de horas trabalhadas: ");
			n = scan.nextInt();
			
			System.out.print("Informe seu codigo: ");
			c = scan.nextInt();
			
			if(n>50) {
				excedente = (n-50)*20;
				salario = 50*10;
			}
			
			System.out.println("Salario total: "+ salario);
			System.out.print("Salario excedente: "+ excedente);
			
			System.out.print("Deseja continuar? ");
			pergunta = scan.next();
			
			if(pergunta == "s" || pergunta == "S") {
				continua = true;
			}else {
				continua=false;
			}
		}
		
	}
}
