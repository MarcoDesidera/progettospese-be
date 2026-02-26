package com.progettospese.progettospese.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettospese.progettospese.dto.CategorieDto;
import com.progettospese.progettospese.mapper.CategorieMapper;
import com.progettospese.progettospese.model.Categorie;
import com.progettospese.progettospese.repository.CategorieRepo;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepo categorieRepo;

    @Autowired
    private CategorieMapper categorieMapper;

    public List<CategorieDto> findAll() {
        List<Categorie> categorie = categorieRepo.findAll();

        return categorie.stream().map(categorieMapper::mapOut).collect(Collectors.toList());
    }

}
