package Ex3Classe;

import java.util.Scanner;

public class ApoliceTeste {

	public static void main(String[] args) {
		/************************************************* ******************************
		Implementar uma classe Apolice com os seguintes atributos nome do segurado, idade do segurado e valor do
		prêmio da apólice. Nesta classe, o Police deve ser implementado os métodos:
		  *imprimir () - este método não retorna valor e deve mostrar na tela todos os atributos da classe Apolice. Pára
		      imprimir em java usa-se o comando [System.out.println(nome do atributo);]
		  *calcularPremioApolice() - este método não retorna valor e deve calcular o valor do prêmio seguindo como
		      seguintes regras:
		        caso a idade seja maior ou igual a 18 e menor ou igual a 25 anos, use uma fórmula
		          valorPremio+=(valorPremio*20)/100.
		        Quando a idade for superior a 25 e menor ou igual a 26, use uma fórmula
		          valorPremio+=(valorPremio*15)/100.
		        Quando a idade para superior a 36 usa uma fórmula
		          valorPremio+=(valorPremio*10)/100.
		  *oferecerDesconto() - este método não retorna valor, mas recebe o parâmetro cidade, que irá conter o nome da
		    cidade para o calculador do cartão. Caso a cidade seja Curitiba, dê um desconto de no valor do prêmio de 20%,
		    caso seja Rio de Janeiro, dê um desconto no valor do prêmio de 15%, caso seja São Paulo dê um desconto no
		    valor do prêmio de 10% e se for Belo Horizonte dê um desconto no valor do prêmio de 5%.
		    Logo após implementar a classe Apolice, implemente em uma classe chamada ApoliceTeste uma sequência de
		    instruções para testar as funcionalidades da classe Apolice.
		Para entrada de dados em java, temos que instanciar um objeto da Classe Scanner, como no exemplo.
		  importar java.util.Scanner;
		  public class ApoliceTeste{
		    public static void main(String args[]){
		      Entrada do scanner = new Scanner(System.in);
		      System.out.print("Para capturar uma string: ");
		      String n = input.nextLine();
		      System.out.print("Para capturar um número inteiro (int): ");
		      int id = input.nextInt();
		      System.out.print("Para capturar um valor real (double): ");
		      double vap = input.nextDouble();
		    }
		  }
		************************************************** *****************************/
		
		
		String nome, cidade;
		int idade;
		double valor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		nome = scan.next();
		scan.nextLine();
		System.out.print("Informe a idade: ");
		idade = scan.nextInt();
		scan.nextLine();
		System.out.print("Informe o valor da apolice: ");
		valor = scan.nextDouble();
		scan.nextLine();
		System.out.print("Informe a cidade: ");
		cidade = scan.next();
		scan.nextLine();
		
		Apolice ap = new Apolice(nome, idade, valor);
		
		ap.Imprimir();
		
		ap.calcularPremioApolice();
		
		ap.oferecerDesconto(cidade);
		
		

	}

}
