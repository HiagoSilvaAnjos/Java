package Exercicio_02.classes_01.questao01;

import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private String nome;
    private String email;
    private String telefone;

    public Pessoa(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

}

class Departamento {
    private String nome;
    private List<Pessoa> pessoas = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<Pessoa> getPessoas() { return pessoas; }
    public void adicionarPessoa(Pessoa p) {
        pessoas.add(p);
    }

}

class Universidade {
    private String nome;
    private Departamento[] departamentos = new Departamento[10];
    private int contadorDepartamentos = 0;

    public Universidade(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public void adicionarDepartamento(Departamento d) {
        if (contadorDepartamentos < 10) {
            departamentos[contadorDepartamentos++] = d;
        } else {
            System.out.println("Limite de departamentos atingido!");
        }
    }

    public void mostrarDepartamentos() {
        System.out.println("Universidade: " + nome);
        for (int i = 0; i < contadorDepartamentos; i++) {
            Departamento d = departamentos[i];
            System.out.println("Departamento: " + d.getNome());
            for (Pessoa p : d.getPessoas()) {
                System.out.println("  - Nome: " + p.getNome() + ", Email: " + p.getEmail() + ", Telefone: " + p.getTelefone());
            }
            System.out.println();
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Universidade u = new Universidade("UFPA");

        Departamento d1 = new Departamento("Informática");
        d1.adicionarPessoa(new Pessoa("Alice", "alice@icen.ufpa.br", "9199999999"));
        d1.adicionarPessoa(new Pessoa("Jhon", "jhon@icen.ufpa.br", "9199999999"));

        Departamento d2 = new Departamento("Engenharia");
        d2.adicionarPessoa(new Pessoa("Hiago", "hiago@icen.ufpa.br", "9199999999"));
        d2.adicionarPessoa(new Pessoa("Ricardo", "ricardo@icen.ufpa.br", "9199999999"));

        Departamento d3 = new Departamento("Matemática");
        d3.adicionarPessoa(new Pessoa("Edivaldo", "edivaldo@icen.ufpa.br", "9199999999"));
        d3.adicionarPessoa(new Pessoa("Fernando", "fernando@icen.ufpa.br", "9199999999"));

        u.adicionarDepartamento(d1);
        u.adicionarDepartamento(d2);
        u.adicionarDepartamento(d3);

        u.mostrarDepartamentos();
    }
}
