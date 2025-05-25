package Exercicio.ex01.src;

public class Utils {

    // A) => O método hypotenuse

    protected static double hypotenuse (double side1, double side2) {
        return  Math.sqrt(side1 * side1 + side2 * side2);
    }

    // B) => O método smallest
    protected  static int smallest (int x, int y, int z) {
        int min = x;

        if( y < min) {
            min = y;
        }

        if( z < min) {
            min = z;
        }

        return min;

    }

    // C) => O método instructions
    protected  static void instructions() {
        System.out.println("Para calcular a hipotenusa, digite os valores dos catetos.");
        System.out.println("Para encontrar o menor número, digite três números inteiros.");
        System.out.println("Para sair, digite 0.");
    }

    // D) => O método intToFloat
    protected static float intToFloat(int number) {
        return (float) number;
    }


}
