package Exercicio.ex04.src;
import java.util.Scanner;

public class Main {


    // Método que verifica se o número é par
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite números inteiros para verificar se são pares ou ímpares.");
        System.out.println("Digite '0' para encerrar.");

        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Encerrando o programa.");
                break;
            }

            if (isEven(numero)) {
                System.out.println(numero + " é PAR.");
            } else {
                System.out.println(numero + " é ÍMPAR.");
            }
        }

        scanner.close();
    }

}
