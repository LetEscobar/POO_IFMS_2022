package poo.collection;

import java.io.IOException;
import java.util.Scanner;

import poo.heranca_exercicio.Livro;

public class SistemaBiblioteca {

    private static final String[] opcoes = {
            " _________ SISTEMA BIBLIOTECA ____________",
            "|  Escolha uma opção:                     |",
            "|  1 - Cadastrar Livro                    |",
            "|  2- Cadastrar Funcionario               |",
            "|  3- Cadastrar Estudante                 |",
            "|  4- Cadastrar Autor                     |",
            "|  5- Realizar Emprestimo                 |",
            "|  6- Receber Emprestimo                  |",
            "|_________________________________________|"
    };

    private static Scanner buffer = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int op = 1;
        while (op != 0) {
            printMenu();
            System.out.println("\n\n");
            op = buffer.nextInt();
            escolha(op);
            System.in.read();
        }
    }

    private static void printMenu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (String op : opcoes) {
            System.out.println(op);
        }
    }

    private static void escolha(int op) {
        switch (op) {
            // cadastrar o lirvro
            case 1:
                Livro.cadastrarLivro();
                break;

            default:
                System.out.println("Saindo da função escolha.");
        }
    }
}
