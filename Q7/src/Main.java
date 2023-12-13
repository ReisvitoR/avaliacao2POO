// Interface para definir métodos comuns para formas geométricas
interface FiguraGeometrica {
    void calcularArea();
    void calcularPerimetro();
}

// Implementação específica para um Quadrado
class Quadrado implements FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do Quadrado: " + (lado * lado));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro do Quadrado: " + (4 * lado));
    }
}

// Implementação específica para um Triângulo
class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do Triângulo: " + (base * altura / 2));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro do Triângulo: " + (lado1 + lado2 + lado3));
    }
}

// Implementação específica para um Retângulo
class Retangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do Retângulo: " + (base * altura));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro do Retângulo: " + (2 * (base + altura)));
    }
}

// Script para testar diferentes formas geométricas
public class TesteFormasGeometricas {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];

        figuras[0] = new Quadrado(5);
        figuras[1] = new Triangulo(3, 4, 5, 6, 7);
        figuras[2] = new Retangulo(4, 6);

        for (FiguraGeometrica figura : figuras) {
            figura.calcularArea();
            figura.calcularPerimetro();
            System.out.println("--------------");
        }
    }
}
