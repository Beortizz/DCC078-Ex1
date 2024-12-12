package org.projectPatterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoPagamentoTest {

    @Test
    void testSingletonInstance() {
        ConfiguracaoPagamento instance1 = ConfiguracaoPagamento.getInstance();
        ConfiguracaoPagamento instance2 = ConfiguracaoPagamento.getInstance();
        assertSame(instance1, instance2, "getInstance() deve retornar a mesma instância");
    }

    @Test
    void testSetAndGetBanco() {
        ConfiguracaoPagamento configuracao = ConfiguracaoPagamento.getInstance();
        configuracao.setBanco("Banco do Brasil");

        assertEquals("Banco do Brasil", configuracao.getBanco(), "O método getBanco() deve retornar o valor configurado");
    }

    @Test
    void testSetAndGetConta() {
        ConfiguracaoPagamento configuracao = ConfiguracaoPagamento.getInstance();
        configuracao.setConta("123456-7");

        assertEquals("123456-7", configuracao.getConta(), "O método getConta() deve retornar o valor configurado");
    }

    @Test
    void testSetAndGetAgencia() {
        ConfiguracaoPagamento configuracao = ConfiguracaoPagamento.getInstance();
        configuracao.setAgencia("0001");

        assertEquals("0001", configuracao.getAgencia(), "O método getAgencia() deve retornar o valor configurado");
    }

    @Test
    void testSingletonBehavior() {
        ConfiguracaoPagamento configuracao = ConfiguracaoPagamento.getInstance();
        configuracao.setBanco("Caixa Econômica");

        ConfiguracaoPagamento sameConfiguracao = ConfiguracaoPagamento.getInstance();
        assertEquals("Caixa Econômica", sameConfiguracao.getBanco(), "A instância singleton deve compartilhar o mesmo estado");
    }
}