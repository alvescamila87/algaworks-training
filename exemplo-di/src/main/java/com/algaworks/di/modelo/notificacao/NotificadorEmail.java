package com.algaworks.di.modelo.notificacao;

import com.algaworks.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificação via SMS para %s no telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
