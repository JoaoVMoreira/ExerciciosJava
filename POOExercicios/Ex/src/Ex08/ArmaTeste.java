package Ex08;

import java.util.Scanner;

public class ArmaTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Espada espada = new Espada();


        System.out.print("Informe o tamanho da espada: ");
        espada.setTamanho(scan.next());
        scan.nextLine();

        System.out.print("Informe o tipo de lamina da espada: ");
        espada.setLamina(scan.next());
        scan.nextLine();

        System.out.println(espada.getLamina());
        System.out.println(espada.getTamanho());
    }
}
