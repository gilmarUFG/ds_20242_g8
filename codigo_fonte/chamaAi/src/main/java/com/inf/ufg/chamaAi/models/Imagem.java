package com.inf.ufg.chamaAi.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "IMAGENS")
@SequenceGenerator(name = "SEQ_IMAGENS", sequenceName = "SEQ_IMAGENS", allocationSize = 1, initialValue = 1)
public class Imagem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_IMAGENS")
    private Long id;

    @Column(nullable = false)
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
