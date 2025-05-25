package Aula01.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando lista de carros
        List<Carro> carrosLista = new ArrayList<>();

        // Criando e adicionando carros na lista
        Carro carro1 = new Carro();
        carro1.setModelo("Fiat Uno");
        carro1.setCor("Vermelho");
        carro1.setAno(2020);

        Carro carro2 = new Carro();
        carro2.setModelo("Ford Fiesta");
        carro2.setCor("Azul");
        carro2.setAno(2021);

        Carro carro3 = new Carro();
        carro3.setModelo("Chevrolet Onix");
        carro3.setCor("Branco");
        carro3.setAno(2022);

        // Adicionando os carros na lista
        carrosLista.add(carro1);
        carrosLista.add(carro2);
        carrosLista.add(carro3);

        // Percorrendo a lista
        for (Carro carroItem : carrosLista) {
            carroItem.ligar();
            carroItem.acelerar();
            carroItem.frear();
            carroItem.desligar();

            // Imprimindo informações
            System.out.println("Modelo: " + carroItem.getModelo());
            System.out.println("Cor: " + carroItem.getCor());
            System.out.println("Ano: " + carroItem.getAno());
            System.out.println("--------------------------");
        }
    }
}
