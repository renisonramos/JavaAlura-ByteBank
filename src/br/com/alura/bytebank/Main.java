package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao ByteBank");

        Funcionario renison = new Funcionario ("Renison Ramos", 1 , LocalDate.of(1998, 7 , 15));
        System.out.println(renison);

        Funcionario maria = new Funcionario("Maria José", 2 , LocalDate.of(1994 , 6 , 27));
        System.out.println(maria);





    }
}