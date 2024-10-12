package com.inf.ufg.chamaAi.models;

import com.inf.ufg.chamaAi.enums.Status;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TRABALHOS")
@SequenceGenerator(name = "SEQ_TRABALHOS", sequenceName = "SEQ_TRABALHOS", allocationSize = 1, initialValue = 1)
public class Trabalho implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TRABALHOS")
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;

    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @Temporal(TemporalType.DATE)
    private Date dataFinalizacao;

    @Column(nullable = false)
    private String endereco;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @ManyToOne(targetEntity = Avaliacao.class)
    @JoinColumn(name = "AVALIACAO_ID", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_TRABALHOS_AVALIACAO_ID"))
    private Avaliacao avaliacao;

    @ManyToOne(targetEntity = Imagem.class)
    @JoinColumn(name = "IMAGEM_ID", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_TRABALHOS_IMAGEM_ID"))
    private Imagem imagem;

    @ManyToOne(targetEntity = Orcamento.class)
    @JoinColumn(name = "ORCAMENTO_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_TRABALHOS_ORCAMENTO_ID"))
    private Orcamento orcamento;

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "FORNECEDOR_ID", nullable = true, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_TRABALHOS_FORNECEDOR_ID"))
    private Usuario fornecedor;

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "SOLICITANTE_ID", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FK_TRABALHOS_SOLICITANTE_ID"))
    private Usuario solicitante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Date dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Imagem getImagem() {
        return imagem;
    }

    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public Usuario getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Usuario fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }
}
