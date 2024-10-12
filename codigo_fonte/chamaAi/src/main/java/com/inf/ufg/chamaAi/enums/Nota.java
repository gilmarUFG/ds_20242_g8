package com.inf.ufg.chamaAi.enums;

public enum Nota {
    UM(1),
    DOIS(2),
    TRES(3),
    QUATRO(4),
    CINCO(5);

    private final int valor;

    Nota(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
