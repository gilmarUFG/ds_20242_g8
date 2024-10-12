package com.inf.ufg.chamaAi.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "CONTRATANTES")
@SequenceGenerator(name = "SEQ_CONTRATANTES", sequenceName = "SEQ_CONTRATANTES", allocationSize = 1, initialValue = 1)
public class Contratante extends Funcao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONTRATANTES")
    private Long id;

    public Contratante() {
        super(0,0);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void calcularMetricas() {

    }


}
