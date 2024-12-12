package org.projectPatterns;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagamentoCartaoCreditoTest {

    @Test
    void testGetTaxa() {
        MetodoPagamento pagamento = MetodoPagamentoFactory.obterMetodoPagamento("CartaoCredito", "BRL", 1.0f);
        float taxa = pagamento.getTaxa();
        assertEquals(1.02f, taxa, 0.0001);
    }

    @Test
    void testExecutar() {
        MetodoPagamento pagamento = MetodoPagamentoFactory.obterMetodoPagamento("CartaoCredito", "USD", 1.5f);
        String resultado = pagamento.executar();
        assertEquals("Pagamento com cartão de crédito executado.", resultado);
    }

    @Test
    void testCancelar() {
        MetodoPagamento pagamento = MetodoPagamentoFactory.obterMetodoPagamento("CartaoCredito", "EUR", 2.0f);
        String resultado = pagamento.cancelar();
        assertEquals("Pagamento com cartão de crédito cancelado.", resultado);
    }
}