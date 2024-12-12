package org.projectPatterns;

public class MetodoPagamentoFactory {

    public static MetodoPagamento obterMetodoPagamento(String tipo, String moeda, float taxaBase) {
        Class<?> classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.projectPatterns.Pagamento" + tipo);
            java.lang.reflect.Constructor<?> constructor = classe.getDeclaredConstructor(String.class, float.class);
            objeto = constructor.newInstance(moeda,taxaBase);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Método de pagamento inexistente");
        }
        if (!(objeto instanceof MetodoPagamento)) {
            throw new IllegalArgumentException("Método de pagamento inválido");
        }
        return (MetodoPagamento) objeto;
    }
}
