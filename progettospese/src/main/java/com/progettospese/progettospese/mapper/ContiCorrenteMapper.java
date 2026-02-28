package com.progettospese.progettospese.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.progettospese.progettospese.dto.ContiCorrenteDto;
import com.progettospese.progettospese.model.ContiCorrente;

@Component
public class ContiCorrenteMapper {

    @Autowired
    @Lazy
    private TransazioniMapper transazioniMapper;

    public ContiCorrenteDto mapOut(ContiCorrente input) {
        if (input == null) return null;
        
        ContiCorrenteDto dto = new ContiCorrenteDto();

        dto.setId(input.getId());
        dto.setNome(input.getNome());
        dto.setDescrizione(input.getDescrizione());
        dto.setTotale(input.getTotale());
        dto.setTransazioni(input.getTransazioni().stream().map(transazioniMapper::mapOut).toList());

        return dto;
    }

    public ContiCorrente mapIn(ContiCorrenteDto dto) {
        if (dto == null) return null;
        
        ContiCorrente entity = new ContiCorrente();
        
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setDescrizione(dto.getDescrizione());
        entity.setTotale(dto.getTotale());
        entity.setTransazioni(dto.getTransazioni().stream().map(transazioniMapper::mapIn).toList());
        
        return entity;
    }

}
