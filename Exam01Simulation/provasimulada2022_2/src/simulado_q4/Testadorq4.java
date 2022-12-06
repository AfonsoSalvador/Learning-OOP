package simulado_q4;

import java.util.Scanner;

public class Testadorq4 {

    public static void clear(){
        System.out.print("\033[H\033[2J");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        clear();
        System.out.println("Digite o nome da sua loja!");

        String nome = scan.nextLine();
        Loja loja = new Loja(nome);
        Tamanho size;
        Double preço;
        String cor;
        int qtd; int opção; int sizeInt;

        System.out.println("Bem vindo a administração da loja " + nome);

        while (true) {
            System.out.println("--------------Digite sua ação--------------");
            System.out.println("1 - Registre Estoque");
            System.out.println("2 - Venda");
            System.out.println("3 - Listagem de Estoque");
            System.out.println("4 - Dados da empresa");
            System.out.println("5 - Sair");

            opção = Integer.parseInt(scan.nextLine());

            clear();
            
            switch (opção) {
                case 1:
                    System.out.print("Registro de Estoque\n\nDigite qual tamanho a peça é (1-P, 2-M, 3-G)");
                    System.out.print("\n\t->");
                    sizeInt = Integer.parseInt(scan.nextLine());
                    switch (sizeInt){
                        case 1:
                        size = Tamanho.PEQUENO;
                        break;
                        case 2:
                        size = Tamanho.MEDIO;
                        break;
                        case 3:
                        size = Tamanho.GRANDE;
                        break;
                        default:
                        size = Tamanho.MEDIO;
                    }
                    System.out.println("Digite o preço da peça:");
                    System.out.print("\n\t->");
                    preço=Double.valueOf(scan.nextLine());
                    System.out.println("Digite a cor da peça:");
                    System.out.print("\n\t->");
                    cor=scan.nextLine();
                    System.out.println("Digite quantas peças são:");
                    System.out.print("\n\t->");
                    qtd=Integer.parseInt(scan.nextLine());

                    loja.registraEstoque(size, preço, cor, qtd);

                    clear();
                    System.out.println("Peça registrada com sucesso!");
                    break;

                case 2:
                    loja.listaEstoque();
                    System.out.println("Digite qual numero corresponde a peça que deseja");
                    System.out.print("\n\t->");
                    opção = Integer.parseInt(scan.nextLine());
                    System.out.println("Digite quantas peças deseja");
                    System.out.print("\n\t->");
                    qtd = Integer.parseInt(scan.nextLine());
                    preço = loja.vendeCamisa(opção, qtd);
                    clear();
                    if(preço!=null){
                        System.out.println("A compra deu um total de R$" + String.format("%.2f", preço));
                    }
                    break;
                case 3:
                    loja.listaEstoque();
                    break;
                case 4:
                    System.out.println(loja);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Valor inválido! Tente novamente");
            }
            if(opção==5){
                break;
            }
        }

        scan.close();
    }
}
