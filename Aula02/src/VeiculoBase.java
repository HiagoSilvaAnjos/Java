    package Aula02.src;

    public abstract class VeiculoBase implements Veiculo {

        // === Encapsulamento ===
        // Atributos privados para proteger os dados da classe
        private String modelo;
        private String cor;
        private int ano;

        // === Construtor com parâmetros ===
        // Usa o 'this' para referenciar os atributos da instância
        // 'this.modelo' é o atributo da classe, 'modelo' é o parâmetro do construtor
        protected VeiculoBase(String modelo, String cor, int ano) {
            this.modelo = modelo; // 'this' diferencia o atributo do parâmetro
            this.cor = cor;
            this.ano = ano;
        }

        // === Encapsulamento ===
        // Getters e setters públicos para controlar o acesso aos atributos privados
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

        // Método comum para imprimir informações do veículo, reaproveitamento de código
        public void imprimirInfo() {
            System.out.println("Modelo: " + modelo);
            System.out.println("Cor: " + cor);
            System.out.println("Ano: " + ano);
        }
    }
