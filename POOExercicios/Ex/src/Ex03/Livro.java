package Ex03;

public class Livro {

    private Integer livroID;
    private String nomeLivro;
    private String categoria;


    //Setters
    public void setLivroID(Integer livroID) {
        this.livroID = livroID;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Getters
    public Integer getLivroID() {
        return livroID;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getCategoria() {
        return categoria;
    }
}
