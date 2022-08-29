package lp.exercicio_robo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int sair = 0;
        Robo robo = new Robo(0, 0);

        do {
            Scanner in = new Scanner(System.in);
            
            System.out.print("Digite a direcao para a qual deseja mover o robô: ");
            char direcao = in.next().charAt(0);

            System.out.print("Digite quantas casas você deseja movimentar: ");
            int quantidadeCasas = in.nextInt();

            robo.moverRobo(direcao, quantidadeCasas);

            System.out.print("Digite '0' para continuar, ou pressione qualquer outra tecla para sair: ");
            sair = in.nextInt();
        } while (sair == 0);
    }
}
