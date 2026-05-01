package com.algaworks.di.modelo.service;


import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.notificacao.Notificador;
import com.algaworks.di.modelo.notificacao.NotificadorEmail;
import com.algaworks.di.modelo.notificacao.NotificadorSMS;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.Ativar();
        //System.out.printf("Cliente %s ativado com sucesso!\n", cliente.getNome());

        //NotificadorEmail notificador = new NotificadorEmail();
        //NotificadorSMS notificador = new NotificadorSMS();
        this.notificador.notificar(cliente, "Seu cadastro no sistema foi ativado!");
    }
}
