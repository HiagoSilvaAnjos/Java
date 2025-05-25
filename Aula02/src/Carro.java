package Aula02.src;

public class Carro extends VeiculoBase {

    // construtor
    protected Carro(String modelo, String cor, int ano) {
        super(modelo, cor, ano); // Chama o construtor da classe pai
    }

    // polimorfismo => capacidade de um objeto assumir várias formas

    @Override
    public void acelerar() {
        System.out.println(getModelo() + " acelerando");
    }

    @Override
    public void frear() {
        System.out.println(getModelo() + " freando");
    }

    @Override
    public void partida() {
        System.out.println(getModelo() + "ligado");
    }

    @Override
    public void desligar() {
        System.out.println(getModelo() + "desligado");
    }

}
