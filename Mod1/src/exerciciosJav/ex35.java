package exerciciosJav;

public class ex35 {

	public static void main(String[] args) {
		/*
35) Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: "Múltiplo de 10". 
		 */
		
		for(int i = 1; i < 100; i++) {
			if(i%10 == 0) {
				System.out.println(i + " é multiplo de 10");
			}else {
				System.out.println(i);
			}
		}

	}

}
