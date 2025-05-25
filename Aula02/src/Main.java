package Aula02.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<VeiculoBase> veiculosList = new ArrayList<>();

        veiculosList.add(new Carro( "Fusca", "azul", 1970));
        veiculosList.add(new Carro( "Civic", "preto", 2020));
        veiculosList.add(new Moto( "CB 500", "vermelha", 2021));
        veiculosList.add(new Moto( "CB 1000", "branca", 2022));
        
        for(VeiculoBase veiculoItem : veiculosList) {
            veiculoItem.partida();
            veiculoItem.acelerar();
            veiculoItem.frear();
            veiculoItem.desligar();

            System.out.println("----------------------------");
            String modelo = veiculoItem.getModelo();
            String cor = veiculoItem.getCor();
            int ano = veiculoItem.getAno();

            System.out.println("Modelo: " + modelo);
            System.out.println("Cor: " + cor);
            System.out.println("Ano: " + ano);


            System.out.println("----------------------------");


        }

    }
}