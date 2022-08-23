package poo.interfacess;

public class TesteInterface {
    public static void main(String[] args) {
        double a = 10, b = 20;
        Triangulo reto = new Triangulo();
        System.out.println("Área do triângulo = " + reto.areaTriangulo(a, b));

        System.out.println("Raíz do triângulo = " + reto.raiz(a, b));
    }
}
