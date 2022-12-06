package simulado_q4;

import java.util.Scanner;

public class Testadorq4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da sua loja!");

        String nome = scan.nextLine();
        Loja loja = new Loja(nome);

        System.out.println("Bem vindo a administração da loja " + nome);

        while (true) {
            System.out.println("-------Digite sua ação------");
        }

    }
}
