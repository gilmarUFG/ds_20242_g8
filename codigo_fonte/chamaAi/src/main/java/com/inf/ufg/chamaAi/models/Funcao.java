package com.inf.ufg.chamaAi.models;

public abstract class Funcao {

    protected double avaliacaoMedia;
    protected double tempoMedioDeResposta;

    public Funcao(double avaliacaoMedia, double tempoMedioDeResposta) {
        this.avaliacaoMedia = avaliacaoMedia;
        this.tempoMedioDeResposta = tempoMedioDeResposta;
    }

    // Getters e Setters
    public double getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    public void setAvaliacaoMedia(double avaliacaoMedia) {
        this.avaliacaoMedia = avaliacaoMedia;
    }

    public double getTempoMedioDeResposta() {
        return tempoMedioDeResposta;
    }

    public void setTempoMedioDeResposta(double tempoMedioDeResposta) {
        this.tempoMedioDeResposta = tempoMedioDeResposta;
    }

    // Método abstrato para ser implementado pelas subclasses
    public abstract void calcularMetricas();
}

