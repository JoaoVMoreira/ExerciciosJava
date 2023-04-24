package Ex09;

public class UserTeste {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();

        personagem.setNome("Joao");
        personagem.setEmail("joao@mail.com");

        System.out.println("Nome: "+ personagem.getNome());
        System.out.println("E-mail: " + personagem.getEmail());

        personagem.setNivel(20);
        System.out.println("Nivel: "+ personagem.getNivel());

        personagem.aumentaUmNivel();

    }
}
