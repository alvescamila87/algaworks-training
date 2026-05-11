package com.algaworks.algafood.di.modelo;

public class Cliente {

    private String nome;
    private String telefone;
    private String email;
    private boolean ativo = false;

    public Cliente() {}

    public Cliente(String nome, String telefone, String email, boolean ativo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void Ativar() {
        this.ativo = true;
    }
}
