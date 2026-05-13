package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String servidorHostSmtp;

    public NotificadorEmail(String servidorHostSmtp) {
        this.servidorHostSmtp = servidorHostSmtp;

        System.out.println("Chamou construtor NotificacaoEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if(caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }

        System.out.printf("Notificação via email para %s no e-mail %s usando o SMTP %s: %s\n", cliente.getNome(), cliente.getEmail(), this.servidorHostSmtp, mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
