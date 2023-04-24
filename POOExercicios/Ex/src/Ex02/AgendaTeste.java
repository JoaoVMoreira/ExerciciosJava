package Ex02;

import java.util.Scanner;

public class AgendaTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contato contato = new Contato();
        System.out.println("**********CADASTRO DE CONTATO***********");
        System.out.print("Informe o nome do contato: ");
        contato.setNome(scan.next());
        scan.nextLine();

        System.out.print("Informe o apelido do contato: ");
        contato.setApelido(scan.next());
        scan.nextLine();

        System.out.print("Informe o numero do contato: ");
        contato.setNumero(scan.nextLong());
        scan.nextLine();

        System.out.println("Contato cadastrado!");
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Apelido: " + contato.getApelido());
        System.out.println("Numero: " + contato.getNumero());

    }
}
