package exerciciosJav;

import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		/*
18) Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código é igual a 1, igual a 2 ou 
igual a 3. Caso não seja, apresentar a mensagem “Código inválido”. Ao ser verificado o código e constatado que é 
um valor válido, o programa deve verificar cada código em separado para determinar seu valor por extenso, ou 
seja, apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um numero; ");
		int codigo = scan.nextInt();
		
		if(codigo == 1 || codigo == 2 || codigo == 3) {
			if(codigo == 1) {
				System.out.print("Um");
			}else if(codigo == 2){
				System.out.print("Dois");
			}else if(codigo == 3) {
				System.out.print("Tres");
			}
		}else {
			System.out.print("Valor invalido");
		}
		
		
	}
}
