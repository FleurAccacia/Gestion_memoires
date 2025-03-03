package com.example.gestion_memoire_app.repository;

import com.example.gestion_memoire_app.entity.FicheDeStage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FicheDeStageRepository extends JpaRepository<FicheDeStage, Long> {
}