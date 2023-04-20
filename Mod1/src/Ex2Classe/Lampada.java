package Ex2Classe;

public class Lampada {
	
	private String tipo;
	private Integer voltagem;
	private String cor;
	private String marca;
	private Double preco;
	private Integer potencia;
	private Boolean status;
	

	public Lampada(String tipo, int voltagem, String cor, String marca, double preco, int potencia, boolean status) {
		this.tipo = tipo;
		this.voltagem = voltagem;
		this.cor = cor;
		this.marca = marca;
		this.preco = preco;
		this.potencia = potencia;
		this.status = status;
	}
	
	
	//Setters

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setVoltagem(Integer voltagem) {
		this.voltagem = voltagem;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
	//Getters
	
	public String getTipo() {
		return this.tipo;
	}

	public Integer getVoltagem() {
		return voltagem;
	}

	public String getCor() {
		return cor;
	}

	public String getMarca() {
		return marca;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public Boolean getStatus() {
		return status;
	}
	
	//TooString
	public String toString() {
		return "Lampada [tipo=" + tipo + ", voltagem=" + voltagem + ", cor=" + cor + ", marca=" + marca + ", preco="
				+ preco + ", potencia=" + potencia + ", status=" + status + "]";
	}
}
