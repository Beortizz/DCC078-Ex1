package org.projectPatterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoPayPalTest {

    @Test
    void testGetTaxa() {
        MetodoPagamento pagamento = MetodoPagamentoFactory.obterMetodoPagamento("PayPal", "BRL", 1.0f);
        float taxa = pagamento.getTaxa();
        assertEquals(1.03f, taxa, 0.0001);
    }

    @Test
    void testExecutar() {
        MetodoPagamento pagamento = MetodoPagamentoFactory.obterMetodoPagamento("PayPal", "USD", 1.5f);
        String resultado = pagamento.executar();
        assertEquals("Pagamento com PayPal executado.", resultado);
    }

    @Test
    void testCancelar() {
        MetodoPagamento pagamento = MetodoPagamentoFactory.obterMetodoPagamento("PayPal", "EUR", 2.0f);
        String resultado = pagamento.cancelar();
        assertEquals("Pagamento com PayPal cancelado.", resultado);
    }
}