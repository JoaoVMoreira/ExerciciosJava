package exerciciosJav;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ex13 {
	public static void main(String[] args) {
		/*
13) Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente
		 */
		
		int a;
		ArrayList<Integer> numeros = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; i <= 2; i++) {
			a = scan.nextInt();
			numeros.add(a);
		}
		
		Collections.sort(numeros);
		System.out.print(numeros);
		
	}
}
