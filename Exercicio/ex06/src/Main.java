package Exercicio.ex06.src;

//6) (Distância entre pontos) Escreva um método distance para calcular a distância entre dois
//pontos (x1, y1) e (x2, y2). Todos os números e valores de retorno devem ser do tipo double.

public class Main {

    //Método Distance

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double x1 = 1.0, y1 = 2.0, x2 = 4.0, y2 = 6.0;
        double dist = distance(x1, y1, x2, y2);
        System.out.printf("A distância entre os pontos (%.2f, %.2f) e (%.2f, %.2f) é %.2f%n", x1, y1, x2, y2, dist);
    }

}
