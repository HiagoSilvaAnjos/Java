package Exercicio.ex_revisao.src;



//1) Preenchimento de lacunas
    //a) java
    //b) javac
    //c) .java
    //d) .class
    //e) bytecodes
    //f) C++
    //g) linguagens de alto nível
    //h) Linguagem assembly

//2) Fases de compilação de programas Java

//Fase 1 – Compilação:
//O código-fonte .java é compilado usando o compilador javac, que gera um arquivo .class contendo bytecodes.


//Fase 2 – Execução:
//A máquina virtual Java (JVM) carrega o .class e executa os bytecodes, traduzindo-os para instruções da máquina real durante a execução.


// 3 a 7 – Código Java com todos os exercícios

public class Exercicios {

    // 3) Maior entre dois números
    static void maior(int a, int b) {
        if (a > b) {
            System.out.println("Maior: " + a);
        } else if (b > a) {
            System.out.println("Maior: " + b);
        } else {
            System.out.println("Os números são iguais.");
        }
    }

    // 4) Contagem decrescente até 0
    static void decrescente(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 5) Soma de ímpares e multiplicação de pares entre 1 e 30
    static void somaEProduto() {
        int somaImpares = 0;
        long produtoPares = 1;

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                produtoPares *= i;
            } else {
                somaImpares += i;
            }
        }

        System.out.println("Soma dos ímpares: " + somaImpares);
        System.out.println("Produto dos pares: " + produtoPares);
    }

    // 6a) Trocar valores com variável auxiliar
    static void trocaComAuxiliar(int a, int b) {
        System.out.println("Antes: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Depois: a = " + a + ", b = " + b);
    }

    // 6b) Trocar valores sem variável auxiliar
    static void trocaSemAuxiliar(int a, int b) {
        System.out.println("Antes: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Depois: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        System.out.println("=== Maior entre dois números ===");
        maior(10, 20);

        System.out.println("\n=== Contagem decrescente ===");
        decrescente(5);

        System.out.println("\n=== Soma e produto ===");
        somaEProduto();

        System.out.println("\n=== Troca com auxiliar ===");
        trocaComAuxiliar(3, 7);

        System.out.println("\n=== Troca sem auxiliar ===");
        trocaSemAuxiliar(3, 7);

        System.out.println("\n=== Testando Agenda ===");
        Agenda agenda = new Agenda();
        agenda.adicionarContato(new Contato("Ana", "ana@email.com"));
        agenda.adicionarContato(new Contato("João", "joao@email.com"));

        Contato c = agenda.buscarContato("Ana");
        if (c != null) {
            System.out.println("Contato encontrado: " + c.nome + " - " + c.email);
        }

        agenda.excluirContato("João");
    }
}

// 7) Classe Contato
class Contato {
    String nome;
    String email;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}

// 7) Classe Agenda
class Agenda {
    private Contato[] contatos;
    private int tamanho;

    public Agenda() {
        contatos = new Contato[10];
        tamanho = 0;
    }

    public void adicionarContato(Contato novo) {
        if (tamanho < contatos.length) {
            contatos[tamanho++] = novo;
            System.out.println("Contato adicionado: " + novo.nome);
        } else {
            System.out.println("Agenda cheia.");
        }
    }

    public Contato buscarContato(String nome) {
        for (Contato c : contatos) {
            if (c != null && c.nome.equals(nome)) {
                return c;
            }
        }
        System.out.println("Contato não encontrado.");
        return null;
    }

    public void excluirContato(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].nome.equals(nome)) {
                System.out.println("Excluindo contato: " + contatos[i].nome);
                contatos[i] = contatos[tamanho - 1]; // move o último para a posição excluída
                contatos[tamanho - 1] = null;
                tamanho--;
                return;
            }
        }
        System.out.println("Contato não encontrado para exclusão.");
    }
}
