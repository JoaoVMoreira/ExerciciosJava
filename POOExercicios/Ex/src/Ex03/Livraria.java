package Ex03;

import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) {
        Pessoa pessoa  = new Pessoa();

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do cliente: ");
        pessoa.setNome(scan.next());
        scan.nextLine();

        System.out.println("Informe o id do cliente: ");
        pessoa.setPessoaID(scan.nextInt());
        scan.nextLine();

        System.out.println("Informe o nome do livro: ");
        pessoa.setNomeLivro(scan.next());
        scan.nextLine();

        System.out.println("Informe o ID do livro: ");
        pessoa.setLivroID(scan.nextInt());
        scan.nextLine();

        System.out.println("Informe c categoria do livro: ");
        pessoa.setCategoria(scan.next());
        scan.nextLine();

        System.out.println("*******************************");
        System.out.println("Titulo Livro: " + pessoa.getNomeLivro());
        System.out.println("ID Livro: " + pessoa.getLivroID());
        System.out.println("Categoria Livro: " + pessoa.getCategoria());
        System.out.println("ID cliente: " + pessoa.getPessoaID());
        System.out.println("Nome cliente: " + pessoa.getNome());
        System.out.println("*******************************");

        pessoa.getNomeLivro();
    }


}
