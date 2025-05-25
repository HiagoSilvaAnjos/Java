package Exercicio.ex01.src;

public class Main {
    public static void main(String[] args) {
        // Exibir instruções
        Utils.instructions();

        // Calcular hipotenusa
        double h = Utils.hypotenuse(3.0, 4.0);
        System.out.println("Hipotenusa: " + h);

        // Encontrar menor valor
        int menor = Utils.smallest(10, 5, 8);
        System.out.println("Menor valor: " + menor);

        // Converter inteiro para float
        float f = Utils.intToFloat(7);
        System.out.println("Float convertido: " + f);
    }
}