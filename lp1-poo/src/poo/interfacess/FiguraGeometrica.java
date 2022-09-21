package poo.interfacess;

// interface é um contrato feito entre classes
// interface são classes abstratas - todos os métodos também são abstratas
// métodos abstratos são de implementação obrigatória
// para ter corpo em uma interface, é necessário torná-la estática
public interface FiguraGeometrica {
    public double PI = 3.1415;

    public double areaTriangulo(double a, double b);

    public double raiz(double a, double b);
}
