package org.projectPatterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetodoPagamentoFactoryTest {

    void testRetornarMetodoPagamentoCorreto() {
        try {
            MetodoPagamento metodoPagamento = MetodoPagamentoFactory.obterMetodoPagamento("CartaoCredito", "BRL", 2.5f);
            assertNotNull(metodoPagamento);
        } catch (Exception e) {
            fail("Não deveria lançar exceção ao criar um método de pagamento válido");
        }
    }

    @Test
    void testRetornarExcecaoParaMetodoInexistente() {
        try {
            MetodoPagamento metodoPagamento = MetodoPagamentoFactory.obterMetodoPagamento("Boleto", "USD", 0.5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Método de pagamento inexistente", e.getMessage());
        }
    }

    @Test
    void testRetornarExcecaoParaMetodoInvalido() {
        try {
            MetodoPagamento metodoPagamento = MetodoPagamentoFactory.obterMetodoPagamento("Pix", "BRL", 0.5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Método de pagamento inválido", e.getMessage());
        }
    }
}