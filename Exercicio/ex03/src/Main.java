package Exercicio.ex03.src;

public class Main {

    // a) ERRO: método h() estava declarado dentro do método g(), o que não é permitido em Java.
    // SOLUÇÃO: mover o método h() para fora de g().
    static void g() {
        System.out.println("Inside method g");
        h(); // chamando o método h após correção
    }

    static void h() {
        System.out.println("Inside method h");
    }

    // b) ERRO: o método sum() estava sem return. Apesar de calcular o valor de result,
    // não havia retorno, o que causa erro de compilação.
    // SOLUÇÃO: adicionar 'return result;' ao final do método.
    static int sum(int x, int y) {
        int result;
        result = x + y;
        return result; // correção aplicada aqui
    }

    // c) ERRO: a variável 'a' foi declarada como parâmetro e redeclarada dentro do método,
    // o que gera conflito de nomes.
    // SOLUÇÃO: remover a nova declaração de 'a' e usar diretamente o parâmetro.
    static void f(float a) {
        System.out.println(a); // usa o parâmetro diretamente
    }

    // d) ERRO: o método estava declarado como void mas tentava retornar 'result',
    // o que não é permitido.
    // SOLUÇÃO: mudar o tipo de retorno de 'void' para 'int'.
    static int product() {
        int a = 6, b = 5, c = 4, result;
        result = a + b + c;
        System.out.printf("Result is %d%n", result);
        return result; // correção: agora o método retorna um inteiro
    }

    // Método principal para testar os métodos corrigidos
    public static void main(String[] args) {
        System.out.println("--- Testando método g ---");
        g();

        System.out.println("--- Testando método sum ---");
        int resultadoSoma = sum(10, 20);
        System.out.println("Soma: " + resultadoSoma);

        System.out.println("--- Testando método f ---");
        f(3.14f);

        System.out.println("--- Testando método product ---");
        int resultadoProduto = product();
        System.out.println("Produto: " + resultadoProduto);
    }
}
