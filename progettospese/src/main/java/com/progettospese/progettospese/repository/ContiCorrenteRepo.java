package com.progettospese.progettospese.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progettospese.progettospese.model.ContiCorrente;

@Repository
public interface ContiCorrenteRepo extends JpaRepository<ContiCorrente, Integer> {
}
