package Aula02.src;

public class Moto extends VeiculoBase {
    protected Moto(String modelo, String cor, int ano) {
        super(modelo, cor, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("Moto " + getModelo() + " acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Moto " + getModelo() + " freando.");
    }

    @Override
    public void partida() {
        System.out.println("Moto " + getModelo() + " ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Moto " + getModelo() + " desligada.");
    }
}
