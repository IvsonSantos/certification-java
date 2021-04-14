package test;

import java.time.LocalDate;

public class Person {

    private String nome;
    private int idade;
    private LocalDate dateOfBirth;

    public Person(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Person(String nome, int idade, LocalDate dateOfBirth) {
        this(nome, idade);
        this.dateOfBirth = dateOfBirth;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
