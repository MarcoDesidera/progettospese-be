package com.progettospese.progettospese.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.progettospese.progettospese.dto.TransazioniDto;
import com.progettospese.progettospese.model.Transazioni;

@Component
public class TransazioniMapper {

    @Autowired
    private CategorieMapper categorieMapper;
    @Autowired
    private ContiCorrenteMapper contiCorrenteMapper;

    public TransazioniDto mapOut(Transazioni input) {
        if (input == null) return null;
        
        TransazioniDto dto = new TransazioniDto();

        dto.setId(input.getId());
        dto.setIdContoCorrente(input.getContoCorrente().getId());
        dto.setNome(input.getNome());
        dto.setDescrizione(input.getDescrizione());
        dto.setCategoria(categorieMapper.mapOut(input.getCategoria()));
        dto.setImporto(input.getImporto());
        dto.setDataTransazione(input.getDataTransazione());

        return dto;
    }

    public Transazioni mapIn(TransazioniDto dto) {
        if (dto == null) return null;
        
        Transazioni entity = new Transazioni();
        
        entity.setId(dto.getId());
        //entity.setContoCorrente(contiCorrenteMapper.mapIn(dto.getContoCorrente()));
        entity.setNome(dto.getNome());
        entity.setDescrizione(dto.getDescrizione());
        entity.setCategoria(categorieMapper.mapIn(dto.getCategoria()));
        entity.setImporto(dto.getImporto());
        entity.setDataTransazione(dto.getDataTransazione());
        
        return entity;
    }

}
