/*Em Java, não é possível instanciar classes abstratas diretamente.
Uma classe abstrata é uma classe que não pode ser instanciada por si,
pois pode conter métodos abstratos (métodos sem implementação)
que devem ser implementados pelas subclasses concretas.
Ao tentar criar uma instância de uma classe abstrata usando o operador new, você receberá um erro de compilação.*/

//EXEMPLO1:

abstract class ClasseAbstrata {
    abstract void MetodoAbstrato();
}

public class Exemplo {
    public static void main(String[] args) {
        // resulta em erro de compilação
        // ------>   ClasseAbstrata instancia = new MinhaClasseAbstrata();
    }
}

/*Sendo assim para se usar uma classe abstrata deve-se ter uma classe concreta estendendo a classe abstrata
e fornecendo implementações para todos os metodos abstrados*/
//EXEMPLO2:


abstract class ClasseAbstrata {
    abstract void MetodoAbstrato();
}

class ClasseConcreta extends ClasseAbstrata {
    @Override
    void MetodoAbstrato() {
        System.out.println("Implementação d método abstrato");
    }
}

public class Exemplo {
    public static void main(String[] args) {
        // Agora da pra  criar uma instância da classe concreta
        ClasseConcreta instancia = new ClasseConcreta();
        instancia.MetodoAbstrato(); // Saída: Implementação do método abstrato
    }
}