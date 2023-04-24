package Ex10;

public class Controle implements IControle{

    private Integer canal;
    private String nomeCanal;

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    public String getNomeCanal() {
        return nomeCanal;
    }

    public void setNomeCanal(String nomeCanal) {
        this.nomeCanal = nomeCanal;
    }

    public void ImprimeFuncoes(){
        System.out.println(getCanal());
        System.out.println(getNomeCanal());
    }
}
