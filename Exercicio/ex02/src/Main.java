package Exercicio.ex02.src;

public class Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        System.out.printf("x = %d%n", x);

        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));

        System.out.printf("%d = %d%n", (x + y), (y + x));

        //Saídas
        // x = 2
        // Value of 2 + 2 is 4
        // 5 = 5

        // Exemplos adicionais de uso do printf:
        int idade = 25;
        double altura = 1.75;
        String nome = "Ana";
        char inicial = 'A';
        boolean ativo = true;

        // %d para inteiros
        System.out.printf("Idade: %d anos%n", idade);

        // %f para números de ponto flutuante (double/float)
        System.out.printf("Altura: %.2f metros%n", altura); // .2 para 2 casas decimais

        // %s para strings
        System.out.printf("Nome: %s%n", nome);

        // %c para caracteres
        System.out.printf("Inicial: %c%n", inicial);

        // %b para booleanos
        System.out.printf("Ativo: %b%n", ativo);

        // Vários formatos juntos
        System.out.printf("%s tem %d anos, altura %.1f m, inicial %c e ativo: %b%n", nome, idade, altura, inicial, ativo);

        // %n para nova linha (igual ao \n, mas mais portável)
        System.out.printf("Linha 1%nLinha 2%n");

        // %x para hexadecimal
        System.out.printf("%d em hexadecimal é %x%n", 255, 255);

        // %o para octal
        System.out.printf("%d em octal é %o%n", 8, 8);
    }

}

