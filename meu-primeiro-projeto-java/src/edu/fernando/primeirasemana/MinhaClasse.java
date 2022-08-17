package edu.fernando.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println();

        String nome = "Fernando";
        String sobrenome = "Barbosa";

        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
