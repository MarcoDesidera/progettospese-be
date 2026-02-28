package com.progettospese.progettospese.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progettospese.progettospese.dto.CategorieDto;
import com.progettospese.progettospese.service.CategorieService;


@RestController
@RequestMapping("/categorie")
@PreAuthorize("hasAuthority('ROLE_USER')")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping()
    public List<CategorieDto> findAll() {
        return categorieService.findAll();
    }
    

}
