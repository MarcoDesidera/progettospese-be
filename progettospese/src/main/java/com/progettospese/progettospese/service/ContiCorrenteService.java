package com.progettospese.progettospese.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettospese.progettospese.dto.ContiCorrenteDto;
import com.progettospese.progettospese.mapper.ContiCorrenteMapper;
import com.progettospese.progettospese.model.ContiCorrente;
import com.progettospese.progettospese.repository.ContiCorrenteRepo;

@Service
public class ContiCorrenteService {

    @Autowired
    private ContiCorrenteRepo contiCorrenteRepo;
    @Autowired
    private ContiCorrenteMapper contiCorrenteMapper;

    public List<ContiCorrenteDto> findAll() {
        List<ContiCorrente> contiCorrente = contiCorrenteRepo.findAll();

        return contiCorrente.stream().map(contiCorrenteMapper::mapOut).collect(Collectors.toList());
    }

}
