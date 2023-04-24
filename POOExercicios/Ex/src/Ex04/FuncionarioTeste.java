package Ex04;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Informe o nome do funcionario: ");
        funcionario.setNome(scan.next());

        System.out.println("O funcionario " + funcionario.getNome() + " recebe R$1000,00");

    }
}
