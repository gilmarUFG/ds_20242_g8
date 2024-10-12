package com.inf.ufg.chamaAi.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "ORCAMENTOS")
@SequenceGenerator(name = "SEQ_ORCAMENTOS", sequenceName = "SEQ_ORCAMENTOS", allocationSize = 1, initialValue = 1)
public class Orcamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ORCAMENTOS")
    private Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(nullable = false)
    private Double valorTotal;

    @Temporal(TemporalType.DATE)
    private Date dataRejeicao;

    @Temporal(TemporalType.DATE)
    private Date dataAceite;

    @OneToMany(mappedBy = "orcamento", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<ItemReparo> itensReparo = new ArrayList<>();

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataRejeicao() {
        return dataRejeicao;
    }

    public void setDataRejeicao(Date dataRejeicao) {
        this.dataRejeicao = dataRejeicao;
    }

    public Date getDataAceite() {
        return dataAceite;
    }

    public void setDataAceite(Date dataAceite) {
        this.dataAceite = dataAceite;
    }

    public ArrayList<ItemReparo> getItensReparo() {
        return itensReparo;
    }

    public void setItensReparo(ArrayList<ItemReparo> itensReparo) {
        this.itensReparo = itensReparo;
    }

}
