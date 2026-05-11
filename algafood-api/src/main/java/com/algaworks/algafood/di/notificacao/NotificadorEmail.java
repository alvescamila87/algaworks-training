package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail {

    public NotificadorEmail() {
        System.out.println("Chamou construtor");
    }

    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificação via SMS para %s no telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
