package com.progettospese.progettospese.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.progettospese.progettospese.model.Categorie;
import com.progettospese.progettospese.model.ContiCorrente;

public class TransazioniDto {

    private Integer id;
    private Integer idContoCorrente;
    private String nome;
    private String descrizione;
    private CategorieDto categoria;
    private BigDecimal importo;
    private Instant dataTransazione;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getIdContoCorrente() {
        return idContoCorrente;
    }
    public void setIdContoCorrente(Integer idContoCorrente) {
        this.idContoCorrente = idContoCorrente;
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
    public CategorieDto getCategoria() {
        return categoria;
    }
    public void setCategoria(CategorieDto categoria) {
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
