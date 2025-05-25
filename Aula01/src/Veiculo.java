package Aula01.src;

public interface Veiculo {

    // Métodos abstratos
    void ligar();
    void desligar();

    // Métodos default
    default void acelerar() {
        System.out.println("Acelerando...");
    }

    default void frear() {
        System.out.println("Freando...");
    }

    // Métodos estáticos
    static void buzinar() {
        System.out.println("Buzinando...");
    }

}
