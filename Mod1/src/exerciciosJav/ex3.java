package exerciciosJav;

import java.util.Scanner;

public class ex3 {

	/*
3) Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua 
comissão será de 5% do total da venda e que você tem os seguintes dados: 
- Identificação do vendedor 
- Código da peça 
- Preço unitário da peça 
- Quantidade vendida
*/
	public static void main(String[] args) {
	
		int id, codP, qntd;
		double valorP, comi;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe sua identificação: ");
		id = scan.nextInt();
		
		System.out.print("Informe so codigo da peça: ");
		codP = scan.nextInt();
		
		System.out.print("Informe o valor da peça: ");
		valorP = scan.nextDouble();
		
		System.out.print("Informe a quantidade de peças vendidas: ");
		qntd = scan.nextInt();
		
		comi = (valorP * qntd) * 0.5;
		
		System.out.print(comi);
	}
}
