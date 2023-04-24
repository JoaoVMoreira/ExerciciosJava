package Ex01;


import java.sql.SQLOutput;
import java.util.Scanner;

/********************************************************************************
 3- Fazer um programa com as seguintes características:
 • Uma classe chamada Universidade que terá como atributo um nome e terá um
 método para informar o seu nome.
 • Relacionar a classe Pessoa para com a classe Universidade. Cada pessoa poderá
 ser associada a uma Universidade.
 • A classe Pessoa, por sua vez, terá um método que dirá seu nome e em que
 universidade trabalha.
 ********************************************************************************/

public class UniversidadeTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Informe o nome da universidade: ");
        pessoa.setNome(scan.next());
        scan.nextLine();

        System.out.print("Informe seu nome: ");
        pessoa.setNomePessoa(scan.next());
        scan.nextLine();

        pessoa.retornaInfos();

    }
}
