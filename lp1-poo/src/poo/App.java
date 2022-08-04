package poo;

public class App {
    public static void main(String[] args) throws Exception {
        Ponto p1 = new Ponto(2, 7);
        Ponto p2 = new Ponto(-2, 3);

        double result = p1.distance(p1, p2);
        System.out.println(result);
    }
}

// Criar uma classe que vai representar um ponto no plano cartesiano
// atributos x e y
// 2 construtores: 1 - construtor sem parâmetros | 2 - com as coordenadas x e y
// Criar uma função para calcular a distância entre os dois objetos (pontoP1,
// pontoP2)
// math. é a biblioteca matemática
