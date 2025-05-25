package Aula02.src;

// Contrato para todo veiculo
public interface Veiculo {

    // Métodos abstratos que serão obrigatórios para as classes que implementarem a interface
    void partida();
    void desligar();

    // Métodos default que podem ser sobrescritos, mas não são obrigatórios

    default void acelerar() {
        System.out.println("Acelerando...");
    }

    default void frear() {
        System.out.println("Freando...");
    }
}
