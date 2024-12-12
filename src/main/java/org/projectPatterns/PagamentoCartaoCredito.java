package org.projectPatterns;

public class PagamentoCartaoCredito  extends MetodoPagamento {

    public PagamentoCartaoCredito(String moeda, float taxaBase) {
        super(moeda,taxaBase);
    }

    @Override
    public String executar() {
        return "Pagamento com cartão de crédito executado.";
    }

    @Override
    public String cancelar() {
        return "Pagamento com cartão de crédito cancelado.";
    }

    @Override
    public float getTaxa() {
        return this.taxaBase + 0.02f;
    }
}
