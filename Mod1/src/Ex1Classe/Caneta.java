package Ex1Classe;

public class Caneta {
	private String marca;
	private String cor;
	private Integer tamanho;
	
	//SETTERS
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	
	
	//Getters
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public Integer getTamanho() {
		return this.tamanho;
	}
}
