package com.algaworks.algafood.di.service;


import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

public class AtivacaoClienteService {

    private Notificador notificador; //diminuiu acoplamento, injetando a interface

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;

        System.out.println("Chamou construtor AtivacaoClienteService: " + notificador);
    }

    public void ativar(Cliente cliente) {
        cliente.Ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema foi ativado!");
    }
}
