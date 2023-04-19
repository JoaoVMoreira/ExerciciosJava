package exerciciosJav;

public class ex46 {
	public static void main(String[] args) {
		/*
46) Dados dois vetores x e y, ambos com n elementos, determinar o produto escalar desses vetores. Ou seja, realizar 
a soma de todos dos resultados da multiplicação de x[i] por y[i]. 
		 */
		
		int[] VetorA = {1, 2, 3, 4, 5};
		int[] VetorB = {6, 7, 8, 9, 10};
		int VetorSoma = 0;
		
		for(int i = 0; i < 5; i++) {
			VetorSoma = VetorSoma + (VetorA[i]*VetorB[i]);
		}
		System.out.print(VetorSoma);
	}
}
