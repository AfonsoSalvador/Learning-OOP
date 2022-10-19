import java.util.Scanner;

import biblioteca.Acervo;

public class App {
    public static void main(String[] args) throws Exception {

        Acervo estante = new Acervo();

        int index=-1;
        int veId = 0;
        int regAno = 0;
        String regNome = "";
        String regAutor = "";


        Scanner sc = new Scanner(System.in);

        System.out.print("===============Bem vindo ao acervo Cebo Veredas===============\n\n");

        while(index!=0){
            System.out.print("\n\n================================================\n");
            System.out.print("Digite o valor correspondente a sua ação\n");
            System.out.print("0 - Sair do acervo\n");
            System.out.print("1 - Adicionar Livro\n");
            System.out.print("2 - Listar livros no acervo\n");
            System.out.print("3 - Ver Detalhes do Livro\n");
            System.out.print("4 - Remover Livro\n");
            System.out.print("================================================\n\n");

            System.out.print("->");

            index = Integer.parseInt(sc.nextLine());
            
            switch(index){
                case 1:
                    System.out.print("\nREGISTRO DE LIVROS:\n");
                    System.out.print("\tDigite o nome do Livro\n");
                    System.out.print("\t->");
                    regNome = sc.nextLine();
                    System.out.print("\tDigite o nome do Autor\n");
                    System.out.print("\t->");
                    regAutor = sc.nextLine();
                    System.out.print("\tDigite o ano de lançamento\n");
                    System.out.print("\t->");
                    regAno = Integer.parseInt(sc.nextLine());

                    

                    estante.registraLivro(regNome, regAutor, regAno);

                    System.out.print("\033[H\033[2J"); 
                    System.out.print("Livro registrado com sucesso!\n");

                    break;

                case 2:
                    System.out.print("\033[H\033[2J"); 
                    estante.veLista();

                    break;

                case 3:
                    System.out.print("\033[H\033[2J"); 


                    System.out.print("\nVER DETALHES DO LIVRO:\n");
                    System.out.print("\tDigite a ID do livro a ser mostrado\n");
                    System.out.print("\t->");
                    veId = Integer.parseInt(sc.nextLine());
                    estante.veDetalhes(veId);

                    break;

                case 4:
                System.out.print("\nREMOÇÃO DE LIVROS:\n");
                    System.out.print("\tDigite a ID do livro a ser removido\n");
                    System.out.print("\t->");
                    veId = Integer.parseInt(sc.nextLine());
                    estante.removeLivro(veId);

                    System.out.print("\033[H\033[2J"); 
                    System.out.print("Livro removido com sucesso!\n");

                    break;
            }


        }
        System.out.print("\033[H\033[2J"); 
        System.out.print("Até a próxima!\n");
        sc.close();

    }
    
}
