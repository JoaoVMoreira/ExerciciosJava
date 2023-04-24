package Ex07;

public class Camiseta {
    private String tecido;
    private Character tamanho;

    public void setTecido(String tecido){
        this.tecido = tecido;
    }

    public String getTecido(){
        return this.tecido;
    }

    public void setTamanho(Character tamanho){
        this.tamanho = tamanho;
    }

    public Character getTamanho(){
        return this.tamanho;
    }
}
