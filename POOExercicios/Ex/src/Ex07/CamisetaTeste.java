package Ex07;

public class CamisetaTeste {
    public static void main(String[] args) {
        Camiseta camiseta = new Camiseta();

        camiseta.setTecido("Algodao");
        System.out.println(camiseta.getTecido());

        camiseta.setTamanho('G');
        System.out.println(camiseta.getTamanho());


        Camiseta camiseta1 = new Camiseta();

        camiseta1.setTecido("Latex");
        camiseta1.setTamanho('M');

        System.out.println(camiseta1.getTecido());
        System.out.println(camiseta1.getTamanho());
    }
}
