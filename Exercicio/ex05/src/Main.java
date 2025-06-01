package Exercicio.ex05.src;
import java.util.Scanner;

public class Main {

    // converte Fahrenheit paraCelsius
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    // converte Celsius paraFahrenheit
    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("O que deseja converter?");
        System.out.println("1. Fahrenheit para Celsius");
        System.out.println("2. Celsius para Fahrenheit");
        System.out.print("Escolha uma opção (1 ou 2): ");

        int opcao = scanner.nextInt();

        if (opcao != 1 && opcao != 2) {
            System.out.println("Opção inválida. Encerrando o programa.");
            scanner.close();
            return;
        }

        if (opcao == 1) {

            try {
                System.out.println("Você escolheu converter Fahrenheit para Celsius.");
                System.out.println("Digite uma temperatura em Fahrenheit:");
                double tempF = scanner.nextDouble();
                double tempC = celsius(tempF);
                System.out.printf("%.2f Fahrenheit é equivalente a %.2f Celsius%n", tempF, tempC);
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira uma entrada válida.");
            }

        }

        if (opcao == 2) {

            try {
                System.out.println("Você escolheu converter Celsius para Fahrenheit.");
                System.out.println("Digite uma temperatura em Celsius:");
                double tempC = scanner.nextDouble();
                double tempF = fahrenheit(tempC);
                System.out.printf("%.2f Celsius é equivalente a %.2f Fahrenheit%n", tempC, tempF);
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira uma entrada válida.");
            }

        }

        scanner.close();
    }


}
