package exerciciosJav;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		/*
5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 
12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média. 
Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. 
Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a 
fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média, 
tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
*/
		
	int automovel  = 12;
	double tempo, velocidade, distancia, gasolina;
	Scanner scan = new Scanner(System.in);
	 
	System.out.print("Insira o tempo de viagem: ");
	tempo = scan.nextDouble();
	
	System.out.print("Insira a velocidade do veiculo: ");
	velocidade = scan.nextDouble();
	
	distancia = tempo * velocidade;
	gasolina = distancia/automovel;
	
	System.out.print(gasolina + "litros");
	
	
	}

}
