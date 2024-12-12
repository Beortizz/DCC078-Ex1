package org.projectPatterns;

public class PagamentoPix {
    protected String moeda;
    protected float taxaBase;

    public PagamentoPix(String moeda, float taxaBase) {
        this.moeda = moeda;
        this.taxaBase = taxaBase;
    }
}
