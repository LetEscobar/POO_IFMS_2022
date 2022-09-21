package lp.exercicio_robo;

public class Robo {
    private char direcao;
    private int posicaoX;
    private int posicaoY;
    private int posicaoAnteriorX;
    private int posicaoAnteriorY;
    private int quantidadeCasas;

    // -------------- Método para mover as casas ---------------
    public void moverRobo(char direcao, int quantidadeCasas) {
        switch (direcao) {
            case 'w':
                // Pra cima
                posicaoY = posicaoY + quantidadeCasas;
                break;
            case 'a':
                // Pra esquerda
                posicaoX = posicaoX - quantidadeCasas;
                break;
            case 's':
                // Pra baixo
                posicaoY = posicaoY - quantidadeCasas;
                break;
            case 'd':
                // Pra direita
                posicaoX = posicaoX + quantidadeCasas;
                break;
            default:
                // Opção inválida
                System.out.println("\nDireção inválida! Não foi possível movimentar o robô ");
                break;
        }
    }

    // ------------------- Posição anterior --------------------
    public void posicaoAnterior() {
        posicaoAnteriorX = this.posicaoX;
        posicaoAnteriorY = this.posicaoY;

        System.out.println(
                "\nPosição anterior do robô:\n   Linha: " + posicaoAnteriorX + "\n   Coluna: " + posicaoAnteriorY);
    }

    // ---------------------- Construtor -----------------------
    public Robo(int posicaoX, int posicaoY) {
        this.posicaoX = 0;
        this.posicaoY = 0;
    }

    // ------------------ Getters and Setters ------------------
    public char getDirecao() {
        return this.direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public int getQuantidadeCasas() {
        return this.quantidadeCasas;
    }

    public void setQuantidadeCasas(int quantidadeCasas) {
        this.quantidadeCasas = quantidadeCasas;
    }

    public int getPosicaoX() {
        return this.posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return this.posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
}
