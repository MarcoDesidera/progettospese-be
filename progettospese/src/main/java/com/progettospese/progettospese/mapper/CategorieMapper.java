package com.progettospese.progettospese.mapper;

import org.springframework.stereotype.Component;

import com.progettospese.progettospese.dto.CategorieDto;
import com.progettospese.progettospese.model.Categorie;

@Component
public class CategorieMapper {

    public CategorieDto mapOut(Categorie input) {
        if (input == null) return null;
        
        CategorieDto dto = new CategorieDto();

        dto.setId(input.getId());
        dto.setNome(input.getNome());

        return dto;
    }

    public Categorie mapIn(CategorieDto dto) {
        if (dto == null) return null;
        
        Categorie entity = new Categorie();
        
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        
        return entity;
    }

}
