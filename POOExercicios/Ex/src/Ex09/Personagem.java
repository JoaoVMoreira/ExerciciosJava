package Ex09;

public class Personagem extends Usuario{
    private Integer nivel;

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void aumentaUmNivel(){
        nivel = nivel + 1;
        System.out.println("Novo nivel: "+ nivel);
    }
}
