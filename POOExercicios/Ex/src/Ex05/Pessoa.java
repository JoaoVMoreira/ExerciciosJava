package Ex05;

public class Pessoa {
    public String nome;
    public Double peso, altura, imc;

    public Pessoa(String nome, Double peso, Double altura){
        this.altura = altura;
        this.nome = nome;
        this.peso = peso;
    }

    public void calculaIMC(){
        imc = this.peso / (this.altura * this.altura);
        System.out.println(this.imc);
    }
}
