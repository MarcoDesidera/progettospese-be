package com.progettospese.progettospese.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progettospese.progettospese.dto.TransazioniDto;
import com.progettospese.progettospese.service.TransazioniService;


@RestController
@RequestMapping("/transazioni")
@PreAuthorize("hasAuthority('ROLE_USER')")
public class TransazioniController {

    @Autowired
    private TransazioniService transazioniService;

    @GetMapping()
    public List<TransazioniDto> findAll() {
        return transazioniService.findAll();
    }
    

}
