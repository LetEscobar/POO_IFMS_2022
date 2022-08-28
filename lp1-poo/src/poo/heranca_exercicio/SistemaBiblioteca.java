package poo.heranca_exercicio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaBiblioteca {
    private final static String[] opcoes = {
            " ---------------------------------------------------- ",
            "                Sistema de Biblioteca                 ",
            " ---------------------------------------------------- ",
            "   1 - Cadastrar Livro                                ",
            "   2 - Cadastrar Funcionario                          ",
            "   3 - Cadastrar Estudante                            ",
            "   4 - Cadastrar Autor                                ",
            "   5 - Realizar Emprestimo                            ",
            "   6 - Receber Emprestimo                             ",
            "   0 - Sair                                           ",
            " ---------------------------------------------------- ",
            "   Escolha uma das opções:                            "
    };

    private static List<Livro> livros = new ArrayList<Livro>();
    private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    // private static List<Autor> autores = new ArrayList<Autor>();

    private static Scanner buffer = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int op = 1;
        while (op != 0) {
            printMenu();
            op = buffer.nextInt();
            escolha(op);
            System.in.read(); // System("pause")
        }
    }

    // ----------------------------------------------------------------
    private static void printMenu() {
        // Limpando a tela:
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // Printando as opções do menu:
        for (String op : opcoes) {
            System.out.println(op);
        }
    }

    // ----------------------------------------------------------------
    private static void escolha(int op) {
        switch (op) {
            // 1 - Cadastrar Livro
            case 1:
                Livro novoLivro = Livro.cadastrarLivro();
                System.out.println("\nLivro cadastrado com sucesso!\n\nDados do livro:");
                System.out.println(novoLivro.toString());
                livros.add(novoLivro);
                break;
            // 2 - Cadastrar Funcionario
            case 2:
                Funcionario novoFuncionario = Funcionario.cadastrarFuncionario();

                // 3 - Cadastrar Estudante
                // 4 - Cadastrar Autor
                // 5 - Realizar Emprestimo
                // 6 - Receber Emprestimo
                // 0 - Sair

            default:
                System.out.println("Saindo da func escolha");
        }
    }
}