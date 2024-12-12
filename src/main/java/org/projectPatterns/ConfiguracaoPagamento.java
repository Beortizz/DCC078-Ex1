package org.projectPatterns;

public class ConfiguracaoPagamento {
    private ConfiguracaoPagamento() {};
    private String banco;
    private String conta;
    private String agencia;
    private static ConfiguracaoPagamento instance = new ConfiguracaoPagamento();

    public static ConfiguracaoPagamento getInstance() {
        return instance;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
         this.banco = banco;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

}
