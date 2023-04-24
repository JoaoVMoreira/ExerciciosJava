package Ex01;

public class Pessoa extends Universidade{
    private String nomePessoa;

    public void setNomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa;
    }

    public String getNomePessoa(){
        return this.nomePessoa;
    }


    public void retornaInfos(){
        System.out.println(getNomePessoa() + " trabalha na universidade " + getNome());
    }


}
