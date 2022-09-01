package lp.exercicio_robo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int sair = 0;
        Robo robo = new Robo(0, 0);

        System.out.println(
                "\nPosição inicial do robô:\n   Linha: " + robo.getPosicaoX() + "\n   Coluna: " + robo.getPosicaoY());
        System.out.println("-------------------------------------------------");
        System.out.println(
                "Para mover o robô, siga as seguintes coordenadas:\na - mover para esquerda\nd - mover para direita \nw - mover para cima\ns - mover para baixo");
        System.out.println("-------------------------------------------------");

        do {
            Scanner in = new Scanner(System.in);

            System.out.print("Digite a direção para a qual deseja mover o robô: ");
            robo.setDirecao(in.next().charAt(0));

            System.out.print("Digite quantas casas você deseja movimentar: ");
            robo.setQuantidadeCasas(in.nextInt());

            robo.moverRobo(robo.getDirecao(), robo.getQuantidadeCasas());

            System.out.println(
                    "\nPosição atual do robô:\n   Linha: " + robo.getPosicaoX() + "\n   Coluna: " + robo.getPosicaoY());

            System.out.print("\nDigite '0' para continuar, ou qualquer outro número para sair: ");
            sair = in.nextInt();

            if (sair != 0) {
                System.out.println("------------------- O programa foi encerrado! -------------------");
            }

        } while (sair == 0);
    }
}
