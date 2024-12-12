package org.projectPatterns;

public class PagamentoPayPal extends MetodoPagamento {

    public PagamentoPayPal(String moeda, float taxaBase) {
        super(moeda,taxaBase);
    }
    @Override
    public String executar() {
        return "Pagamento com PayPal executado.";
    }

    @Override
    public String cancelar() {
        return "Pagamento com PayPal cancelado.";
    }

    @Override
    public float getTaxa() {
        return this.taxaBase + 0.03f;
    }
}
