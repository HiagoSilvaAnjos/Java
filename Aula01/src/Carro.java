package Aula01.src;

public class Carro implements Veiculo {

        private String modelo;
        private String cor;
        private int ano;

        // Construtor vazio
        protected Carro() {
        }

        // Construtor com parâmetros
        protected Carro(String modelo, String cor, int ano) {
            this.modelo = modelo;
            this.cor = cor;
            this.ano = ano;
        }

        // Implementação dos métodos da interface Veiculo
        public void ligar() {
            System.out.println("O carro " + modelo + " está ligado.");
        }

        public void desligar() {
            System.out.println("O carro " + modelo + " está desligado.");
        }

        // Métodos sobrescritos da interface Veiculo
        @Override
        public void acelerar() {
            System.out.println("O carro " + modelo + " está acelerando.");
        }
        @Override
        public void frear() {
            System.out.println("O carro " + modelo + " está freando.");
        }

        // Getters e Setters
        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

    }
