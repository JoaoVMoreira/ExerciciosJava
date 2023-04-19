package exerciciosJav;

public class ex45 {
	public static void main(String[] args) {
		/*
45) Dada uma seqüência de n números (vetor de inteiros), imprimi-la na ordem inversa que foi realizada a leitura. 
		 */
		
		int[] Vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 9; i >= 0; i--) {
			System.out.println(Vetor[i]);
		}
		
	}
}
