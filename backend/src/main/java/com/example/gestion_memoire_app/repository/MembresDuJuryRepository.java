// MembresDuJuryRepository.java
package com.example.gestion_memoire_app.repository;

import com.example.gestion_memoire_app.entity.MembresDuJury;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembresDuJuryRepository extends JpaRepository<MembresDuJury, Long> {
}