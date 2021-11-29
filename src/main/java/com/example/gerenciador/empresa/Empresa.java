package com.example.gerenciador.empresa;

public class Empresa {

    private String nome;
    private Integer id;

    public Empresa(String nome, Integer id) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
