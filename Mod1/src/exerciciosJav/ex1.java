package exerciciosJav;
/*
1) Faça um programa para calcular o estoque médio de uma peça, sendo que: 
ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2. 
*/

public class ex1 {
	
	public static void main(String[] args) {
		int qntdMax, qntdMin, estoque;
		
		qntdMax = 12;
		qntdMin = 10;
		
		estoque = (qntdMax + qntdMin)/2;
		
		System.out.print(estoque);
		
	}
	
}
