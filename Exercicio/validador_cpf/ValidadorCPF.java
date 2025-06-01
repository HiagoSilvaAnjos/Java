package Exercicio.validador_cpf;

public class ValidadorCPF {

    private String cpf;

    public ValidadorCPF (String cpf) {
        this.cpf = cpf;
    }

    public boolean validar() {

        // Verifica se o CPF é nulo ou tem tamanho diferente de 11
        if (cpf == null || cpf.length() != 11) {
            return false;
        }

        // remove caracteres não numéricos (ex: pontos, traços)
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verificar se o CPF contém todos os dígitos repetidos
        if(cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // PAssa a string CPF para um array de inteiros
        int[] digitos = new int[11];
        for (int i = 0; i < 11; i++) {
            digitos[i] = Integer.parseInt(cpf.substring(i, i + 1));
        }

        // Cálculo do primeiro dígito verificador
        int soma1 = 0;

        for (int i = 0; i < 9; i++) {
            soma1 += digitos[i] * (10 - i);
        }

        int digito1 = 11 - (soma1 % 11);

        if (digito1 >= 10) {
            digito1 = 0;
        }

        if (digito1 != digitos[9]) {
            return false;
        }

        // Cálculo do segundo dígito verificador
        int soma2 = 0;

        for (int i = 0; i < 10; i++) {
            soma2 += digitos[i] * (11 - i);
        }

        int digito2 = 11 - (soma2 % 11);

        if (digito2 >= 10) {
            digito2 = 0;
        }

        if (digito2 != digitos[10]) {
            return false;
        }

        return true;
    }

}
