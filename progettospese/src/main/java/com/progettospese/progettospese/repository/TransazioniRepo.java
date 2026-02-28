package com.progettospese.progettospese.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progettospese.progettospese.model.Transazioni;

@Repository
public interface TransazioniRepo extends JpaRepository<Transazioni, Integer> {
}
