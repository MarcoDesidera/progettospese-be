package com.progettospese.progettospese.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettospese.progettospese.dto.TransazioniDto;
import com.progettospese.progettospese.mapper.TransazioniMapper;
import com.progettospese.progettospese.model.Transazioni;
import com.progettospese.progettospese.repository.TransazioniRepo;

@Service
public class TransazioniService {

    @Autowired
    private TransazioniRepo transazioniRepo;

    @Autowired
    private TransazioniMapper transazioniMapper;

    public List<TransazioniDto> findAll() {
        List<Transazioni> transazioni = transazioniRepo.findAll();

        return transazioni.stream().map(transazioniMapper::mapOut).collect(Collectors.toList());
    }

}
