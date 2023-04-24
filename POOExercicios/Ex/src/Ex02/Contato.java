package Ex02;

public class Contato {
    private String nome;
    private String apelido;
    private Long numero;

    //Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public Long getNumero() {
        return numero;
    }
}
