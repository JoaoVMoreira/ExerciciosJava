package Ex03;

public class Pessoa extends Livro{

    private String nome;
    private Integer pessoaID;

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPessoaID(Integer pessoaID) {
        this.pessoaID = pessoaID;
    }


    //getter

    public String getNome() {
        return nome;
    }

    public Integer getPessoaID() {
        return pessoaID;
    }

    public void mostraDados(){
        System.out.println("Cliene: " + this.nome + " - " + this.pessoaID);
        System.out.println("Livros: " + getLivroID() + getNomeLivro() + getCategoria());
    }
}
