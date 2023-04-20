package Ex3Classe;

public class Apolice {
	public String nome;
	public int idade;
	public double valor;
	

	public Apolice(String nome, int idade, double valor) {
		this.nome = nome;
		this.idade = idade;
		this.valor = valor;
	}
	
	public void Imprimir() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.valor);
	}
	
	public void calcularPremioApolice() {
		if(this.idade >= 18 || this.idade <= 25) {
			this.valor += (this.valor*20)*100;
			System.out.println("Valor premio" + this.valor);
		}else if(this.idade > 25 && this.idade <= 36) {
			this.valor += (this.valor*15)*100;
			System.out.println("Valor premio" + this.valor);
		}else if(this.idade > 36) {
			this.valor += (this.valor*10)*100;
			System.out.println("Valor premio" + this.valor);
		}
	}
	
	public void oferecerDesconto(String cidade) {
		if(cidade == "Curitiba") {
			System.out.print("Desconto de 20%");
		}else if(cidade == "Rio de Janeiro") {
			System.out.print("Desconto de 15%");
		}else if(cidade == "São Paulo") {
			System.out.print("Desconto de 10%");
		}else if(cidade == "Belo Horizonte") {
			System.out.print("Desconto de 5%");
		}
	}
	
	
	
}
