package com.progettospese.progettospese.dto;

import java.math.BigDecimal;
import java.util.List;

public class ContiCorrenteDto {

    private Integer id;
    private String nome;
    private String descrizione;
    private BigDecimal totale;

    private List<TransazioniDto> transazioni;
    
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
    public List<TransazioniDto> getTransazioni() {
        return transazioni;
    }
    public void setTransazioni(List<TransazioniDto> transazioni) {
        this.transazioni = transazioni;
    }

}
