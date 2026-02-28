package com.progettospese.progettospese.model;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "transazioni")
public class Transazioni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_conto_corrente", referencedColumnName = "id")
    private ContiCorrente contoCorrente;

    private String nome;
    private String descrizione;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria", referencedColumnName = "id")
    private Categorie categoria;

    @Column(name = "importo", precision = 19, scale = 2)
    private BigDecimal importo;
    private Instant dataTransazione;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public ContiCorrente getContoCorrente() {
        return contoCorrente;
    }
    public void setContoCorrente(ContiCorrente contoCorrente) {
        this.contoCorrente = contoCorrente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public Categorie getCategoria() {
        return categoria;
    }
    public void setCategoria(Categorie categoria) {
        this.categoria = categoria;
    }
    public BigDecimal getImporto() {
        return importo;
    }
    public void setImporto(BigDecimal importo) {
        this.importo = importo;
    }
    public Instant getDataTransazione() {
        return dataTransazione;
    }
    public void setDataTransazione(Instant dataTransazione) {
        this.dataTransazione = dataTransazione;
    }
}
