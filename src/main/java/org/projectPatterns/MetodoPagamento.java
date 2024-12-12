package org.projectPatterns;

public abstract class MetodoPagamento implements MetodoPagamentoInterface {

    protected String moeda;
    protected float taxaBase;

    protected MetodoPagamento(String moeda, float taxaBase){
        this.moeda = moeda;
        this.taxaBase = taxaBase;
    }

    public String getMoeda() {
        return this.moeda;
    }

    public abstract float getTaxa();

}
