package Exercicio_02.classes_01.questao_03;

class Televisao {
    private int volume;
    private int canal;

    public Televisao() {
        this.volume = 10;
        this.canal = 1;
    }

    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }

    public int getCanal() { return canal; }
    public void setCanal(int canal) { this.canal = canal; }
}

class ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void aumentarVolume() {
        tv.setVolume(tv.getVolume() + 1);
    }

    public void diminuirVolume() {
        tv.setVolume(tv.getVolume() - 1);
    }

    public void aumentarCanal() {
        tv.setCanal(tv.getCanal() + 1);
    }

    public void diminuirCanal() {
        tv.setCanal(tv.getCanal() - 1);
    }

    public void trocarCanal(int canal) {
        tv.setCanal(canal);
    }

    public int consultarVolume() {
        return tv.getVolume();
    }

    public int consultarCanal() {
        return tv.getCanal();
    }
}

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto(tv);

        controle.aumentarVolume();
        controle.aumentarCanal();
        controle.trocarCanal(12);

        System.out.println("Canal atual: " + controle.consultarCanal());
        System.out.println("Volume atual: " + controle.consultarVolume());
    }
}
