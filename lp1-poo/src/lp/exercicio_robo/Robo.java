package lp.exercicio_robo;

public class Robo {
    private char direcao;
    private int quantidadeCasas = 0;
    private int posicaoX;
    private int posicaoY;

    // Construtor
    public Robo(int posicaoX, int posicaoY) {
        this.posicaoX = 0;
        this.posicaoY = 0;
    }

    // Método para mover as casas
    public Robo moverRobo(char direcao, int quantidadeCasas) {
        switch (direcao) {
            case 'w':
                // Pra cima
                this.posicaoY = posicaoY + quantidadeCasas;
                break;
            case 'a':
                // Pra esquerda
                this.posicaoX = posicaoX - quantidadeCasas;
                break;
            case 's':
                // Pra baixo
                this.posicaoY = posicaoY - quantidadeCasas;
                break;
            case 'd':
                // Pra direita
                this.posicaoX = posicaoX + quantidadeCasas;
                break;
            default:
                // Opção inválida
                System.out.println("Posição inválida!");
                break;
        }
        return null;
    }
}
