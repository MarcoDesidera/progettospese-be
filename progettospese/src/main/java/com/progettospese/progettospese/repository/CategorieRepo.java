package com.progettospese.progettospese.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progettospese.progettospese.model.Categorie;

@Repository
public interface CategorieRepo extends JpaRepository<Categorie, Integer> {
}
