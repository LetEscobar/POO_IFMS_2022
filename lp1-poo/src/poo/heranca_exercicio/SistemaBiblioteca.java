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
    private static List<Estudante> estudantes = new ArrayList<Estudante>();
    // private static List<Autor> autores = new ArrayList<Autor>();

    private static Scanner buffer = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 1;
        while (op != 0) {
            printMenu();
            op = buffer.nextInt();
            escolha(op);
        }
    }

    // ----------------------------------------------------------------
    private static void printMenu() {
        // Limpando a tela:
        // System.out.print("\033[H\033[2J");
        // System.out.flush();
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
                System.out.println("---------- Cadastrar Livro ----------");
                Livro novoLivro = new Livro();
                System.out.println("\nLivro cadastrado com sucesso!\n\nDados do Livro:");
                System.out.println(novoLivro.toString());
                livros.add(novoLivro);
                break;
            // 2 - Cadastrar Funcionario
            case 2:
                System.out.println("---------- Cadastrar Funcionário: ----------");
                Funcionario novoFuncionario = new Funcionario();
                System.out.println("\nFuncionário cadastrado com sucesso!\n\nDados do Funcionário:");
                System.out.println(novoFuncionario.toString());
                funcionarios.add(novoFuncionario);
                break;
            // // 3 - Cadastrar Estudante
            case 3:
                System.out.println("---------- Cadastrar Estudante: ----------");
                // Estudante novoEstudante = Estudante.cadastrarEstudante();
                // System.out.println("\nEstudante cadastrado com sucesso!\n\nDados do
                // Estudante:");
                // System.out.println(novoEstudante.toString());
                // estudantes.add(novoEstudante);
                break;
            // // 4 - Cadastrar Autor
            case 4:
                System.out.println("---------- Cadastrar Autor: ----------");
                // Autor novoAutor = Autor.cadastrarAutor();
                break;
            // 5 - Realizar Emprestimo
            case 5:
                System.out.println("---------- Realizar Empréstimo: ----------");
                break;
            // 6 - Receber Emprestimo
            case 6:
                System.out.println("---------- Receber Empréstimo: ----------");
                break;
            // 0 - Sair
            default:
                System.out.println("---------- Programa encerrado! ----------");
                break;
        }
    }
}