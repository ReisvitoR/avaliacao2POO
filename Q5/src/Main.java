/*
Em Java não se pode criar uma instância direta de uma classe abstrata usando o operador new.
A razão para isso é que as classes abstratas podem conter métodos abstratos,que são métodos sem implementação.
Sendo assim, não faz sentido criar uma instância de uma classe que não fornece implementação completa.
Entretanto, pode-se criar um array ou uma lista de referências a objetos da classe abstrata ou de suas subclasses.
 */
//EXEMPLO

abstract class FiguraGeometrica {
    abstract void calcularArea();
    abstract void calcularPerimetro();
}

public class Exemplo {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];

        // Você não pode criar uma instância direta da classe abstrata, mas pode criar instâncias das subclasses
        figuras[0] = new Quadrado();
        figuras[1] = new Triangulo();
        figuras[2] = new Retangulo();

        // Agora você pode chamar métodos nas instâncias usando o array
        for (FiguraGeometrica figura : figuras) {
            figura.calcularArea();
            figura.calcularPerimetro();
        }
    }
}

class Quadrado extends FiguraGeometrica {
    @Override
    void calcularArea() {
        // Implementação para calcular a área do quadrado
    }

    @Override
    void calcularPerimetro() {
        // Implementação para calcular o perímetro do quadrado
    }
}

class Triangulo extends FiguraGeometrica {
    @Override
    void calcularArea() {
        // Implementação para calcular a área do triângulo
    }

    @Override
    void calcularPerimetro() {
        // Implementação para calcular o perímetro do triângulo
    }
}

class Retangulo extends FiguraGeometrica {
    @Override
    void calcularArea() {
        // Implementação para calcular a área do retângulo
    }

    @Override
    void calcularPerimetro() {
        // Implementação para calcular o perímetro do retângulo
    }
}
