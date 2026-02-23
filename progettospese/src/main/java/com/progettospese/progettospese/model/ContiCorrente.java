package com.progettospese.progettospese.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conti_corrente")
public class ContiCorrente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private Integer id;

    private String nome;
    private String descrizione;

    @Column(name = "totale", precision = 19, scale = 2)
    private BigDecimal totale;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public BigDecimal getTotale() {
        return totale;
    }
    public void setTotale(BigDecimal totale) {
        this.totale = totale;
    }
}
