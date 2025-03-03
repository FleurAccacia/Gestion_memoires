package com.example.gestion_memoire_app.repository;

import com.example.gestion_memoire_app.entity.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {
}