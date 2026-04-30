package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.modelo.notificacao.Notificador;
import com.algaworks.di.modelo.notificacao.NotificadorSMS;
import com.algaworks.di.modelo.service.AtivacaoClienteService;
import com.algaworks.di.modelo.service.EmissaoNotaFiscalService;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        System.out.println("Iniciando aplicação...");

        Cliente joao = new Cliente("Joao Silva", "479999-0000", "joao@email.com", true);
        Cliente maria = new Cliente("Maria Silva", "479999-1111", "maria@email.com", true);

        Notificador notificador = new NotificadorSMS();

        //AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService();
        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
        ativacaoClienteService.ativar(joao);
        ativacaoClienteService.ativar(maria);

        //Notificar
        //NotificacaoEmail notificacao = new NotificacaoEmail();
        //NotificadorSMS notificacao = new NotificadorSMS();
        //notificacao.notificar(joao, "Bem-vindo, João! Sua conta foi ativada com sucesso.");
        notificador.notificar(joao, "Bem-vindo, João! Sua conta foi ativada com sucesso.");

        //Emitir nota
        Produto tv = new Produto("TV 4K", BigDecimal.valueOf(5000));

        EmissaoNotaFiscalService notaFiscal = new EmissaoNotaFiscalService(notificador);

        notaFiscal.emitir(joao, tv);
    }
}
