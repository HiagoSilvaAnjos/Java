package Exercicio_02.classes_01.questao_02;

class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
        } else {
            System.out.println("Elevador cheio!");
        }
    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
        } else {
            System.out.println("Elevador vazio!");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Já está no último andar!");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Já está no térreo!");
        }
    }

    // Getters e Setters
    public int getAndarAtual() { return andarAtual; }
    public void setAndarAtual(int andarAtual) { this.andarAtual = andarAtual; }

    public int getTotalAndares() { return totalAndares; }
    public void setTotalAndares(int totalAndares) { this.totalAndares = totalAndares; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public int getPessoasPresentes() { return pessoasPresentes; }
    public void setPessoasPresentes(int pessoasPresentes) { this.pessoasPresentes = pessoasPresentes; }
}

public class Main {
    public static void main(String[] args) {
        Elevador e = new Elevador();
        e.inicializa(4, 5);

        e.entra();
        e.entra();
        e.sobe();
        e.entra();
        e.sobe();
        e.sai();

        System.out.println("Andar atual: " + e.getAndarAtual());
        System.out.println("Pessoas no elevador: " + e.getPessoasPresentes());
    }
}
