package com.progettospese.progettospese.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import com.progettospese.progettospese.dto.ContiCorrenteDto;
import com.progettospese.progettospese.service.ContiCorrenteService;


@RestController
@RequestMapping("/conti-corrente")
@PreAuthorize("hasAuthority('ROLE_USER')")
public class ContiCorrenteController {

    @Autowired
    private ContiCorrenteService contiCorrenteService;

    @GetMapping()
    public List<ContiCorrenteDto> findAll() {
        return contiCorrenteService.findAll();
    }
    

}
