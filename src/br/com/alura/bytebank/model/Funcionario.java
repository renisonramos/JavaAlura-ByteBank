package br.com.alura.bytebank.model;

import java.time.LocalDate;

public class Funcionario {

    //Considerando atributos a classe
    //Para deixar todos os atributos privados foi usado o editor em Coluna
    //SHIFT + ALT + INSERT

    private String nome;
    private int matricula;
    private LocalDate dataNascimento;

    // Criação dos Getters and Setter
    // ALT + INSERT


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //CRIANDO CONSTRUTORES
    // ALT + INSERT

    public Funcionario(String nome, int matricula, LocalDate dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    //CRIANDO TO STRING

    @Override
    public String toString() {
        return "Funcionario: " +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
