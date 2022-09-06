package poo.heranca_exercicio;

import java.util.Scanner;

public class SistemaBiblioteca {
    private final static String[] opcoes = {
            "----------------------------------------------------",
            "               Sistema de Biblioteca                ",
            "----------------------------------------------------",
            "  1 - Cadastrar Livro                               ",
            "  2 - Cadastrar Funcionario                         ",
            "  3 - Cadastrar Estudante                           ",
            "  4 - Cadastrar Autor                               ",
            "  5 - Realizar Emprestimo                           ",
            "  6 - Receber Emprestimo                            ",
            "  0 - Sair                                          ",
            "----------------------------------------------------",
            "  Escolha uma das opções:                           "
    };

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
        for (String op : opcoes) {
            System.out.println(op);
        }
    }

    // ----------------------------------------------------------------
    private static void escolha(int op) {
        switch (op) {

            case 1:
                System.out.println("---------- Cadastrar Livro ----------");
                Livro novoLivro = new Livro();
                System.out.print("\nLivro cadastrado com sucesso!\nDados do Livro:");
                System.out.println(novoLivro.toString());
                Livro.getLivro().add(novoLivro);
                break;

            case 2:
                System.out.println("---------- Cadastrar Funcionário: ----------");
                Funcionario novoFuncionario = new Funcionario();
                System.out.println("\nFuncionário cadastrado com sucesso!\nDados do Funcionário:");
                System.out.println(novoFuncionario.toString());
                Funcionario.getFuncionario().add(novoFuncionario);
                break;

            case 3:
                System.out.println("----------- Cadastrar Estudante: -----------");
                Estudante novoEstudante = new Estudante();
                System.out.println("\nEstudante cadastrado com sucesso!\nDados do Estudante:");
                System.out.println(novoEstudante.toString());
                Estudante.getEstudantes().add(novoEstudante);
                break;

            case 4:
                System.out.println("------------- Cadastrar Autor: -------------");
                Autor novoAutor = new Autor();
                System.out.println("Autor cadastrado com sucesso!\nDados do Autor:");
                System.out.println(novoAutor.toString());
                Autor.getAutor().add(novoAutor);
                break;

            case 5:
                System.out.println("----------- Realizar Empréstimo: -----------");
                Emprestimo novoEmprestimo = new Emprestimo();
                System.out.println("Empréstimo realizado com sucesso!\nDados do empréstimo:");
                System.out.println(novoEmprestimo.toString());
                Emprestimo.getEmprestimo().add(novoEmprestimo);
                break;

            case 6:
                System.out.println("------------ Receber Empréstimo: -----------");
                break;

            case 0:
                System.out.println("----- Programa encerrado com sucesso! ------");
                break;

            default:
                System.out.println("----------- Programa encerrado! ------------");
                break;
        }
    }
}