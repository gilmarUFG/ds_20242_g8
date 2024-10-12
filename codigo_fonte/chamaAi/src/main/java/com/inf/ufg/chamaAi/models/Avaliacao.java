package com.inf.ufg.chamaAi.models;

import com.inf.ufg.chamaAi.enums.Nota;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "AVALIACOES")
@SequenceGenerator(name = "SEQ_AVALIACOES", sequenceName = "SEQ_AVALIACOES", allocationSize = 1, initialValue = 1)
public class Avaliacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_AVALIACOES")
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Nota nota;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }
}
