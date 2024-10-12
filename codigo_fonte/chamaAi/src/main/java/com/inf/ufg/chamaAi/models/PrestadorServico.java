package com.inf.ufg.chamaAi.models;

import com.inf.ufg.chamaAi.enums.Especializacao;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "PRESTADORES_SERVICOS")
@SequenceGenerator(name = "SEQ_PRESTADORES_SERVICOS", sequenceName = "SEQ_PRESTADORES_SERVICOS", allocationSize = 1, initialValue = 1)
public class PrestadorServico extends Funcao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRESTADORES_SERVICOS")
    private Long id;

    @Column(nullable = false)
    private Boolean atendeDomicilio;

    @ElementCollection(targetClass = Especializacao.class)
    @CollectionTable(name = "PRESTADORES_SERVICOS_ESPECIALIZACOES", joinColumns = @JoinColumn(name = "PRESTADOR_ID"))
    @Column(name = "especializacao")
    @Enumerated(EnumType.STRING)
    private Set<Especializacao> especializacoes;

    public PrestadorServico() {
        super(0,0);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAtendeDomicilio() {
        return atendeDomicilio;
    }

    public void setAtendeDomicilio(Boolean atendeDomicilio) {
        this.atendeDomicilio = atendeDomicilio;
    }

    public void setEspecializacoes(Set<Especializacao> especializacoes) {
        this.especializacoes = especializacoes;
    }

    public Set<Especializacao> getEspecializacoes() {
        return especializacoes;
    }

    @Override
    public void calcularMetricas() {

    }
}
