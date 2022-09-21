package lp;

import java.util.Random;
// import java.util.Scanner;

public class InitOrdenacao {
    public static void main(String[] args) {
        // Declaração de vetores e matrizes em Java:
        int vetor[] = new int[5];
        int vetor2[] = { 1, 2, 3, 4, 5 };
        int matriz[][] = new int[3][3];

        // Fazendo a leitura de dados pelo teclado:
        // Classe nome_objeto = operador_gera_instância
        // Construtor_da_classe(parâmetros_para_criar_objetos)
        // Scanner in = new Scanner(System.in);

        // for (int i = 0; i < 5; i++) {
        // System.out.println(vetor[i]);
        // }

        // for (int i = 0; i < 5; i++) {
        // System.out.println("Digite o " + (i + 1) + "º número:");
        // // Lendo um número inteiro e armazenando no vetor
        // vetor[i] = in.nextInt();
        // }

        // ------------------------------------------------------------
        // (int) -> casting de dados
        // int num = (int) (Math.random());
        // Math.random() gera núeros de 0 a 1

        // Random
        int min = 2;
        int max = 10;
        Random rand = new Random();
        // System.out.println(rand.nextInt(max - min) + min);

        System.out.println("\nVETOR: ");
        for (int i = 0; i < 5; i++) {
            vetor[i] = rand.nextInt(max - min) + min;
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }

        System.out.println("\nVETOR2: ");

        for (int i = 0; i < 5; i++) {
            vetor2[i] = rand.nextInt(max - min) + min;
            System.out.println("vetor2[" + i + "] = " + vetor2[i]);
        }

        System.out.println("\nMATRIZ:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rand.nextInt(max - min) + min;
                System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }

        // ------------------------------------------------------------

        int vetor10[] = new int[10];
        int min2 = 10;
        int max2 = 20;
        int qtd = 0;

        System.out.println("\nVETOR10: ");
        for (int i = 0; i < 10; i++) {
            boolean found = true;
            int temp = 0;
            while (found) {
                found = false;
                temp = rand.nextInt(max2 - min2) + min2;
                for (int j = 0; j < qtd; j++) {
                    if (temp == vetor10[j]) {
                        found = true;
                    }
                }
            }
            vetor10[i] = temp;
            System.out.println("vetor10[" + i + "] = " + vetor10[i]);
            qtd++;
        }
        // System.out.println("\nVETOR10: ");
        // for (int i = 0; i < 10; i++) {
        // System.out.println("vetor10[" + i + "] = " + vetor10[i]);
        // }

    }
}
