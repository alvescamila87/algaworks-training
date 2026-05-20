package com.algaworks.algafood.di.service;


import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class AtivacaoClienteService {

    //@Qualifier("email")
    //@Autowired
    private Notificador notificador;

    @Autowired
    public AtivacaoClienteService(@Qualifier("sms") Notificador notificador) {
        this.notificador = notificador;
        System.out.println("Chamou construtor AtivacaoClienteService: " + notificador);
    }


    public void ativar(Cliente cliente) {
        cliente.Ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema foi ativado!");
    }
}