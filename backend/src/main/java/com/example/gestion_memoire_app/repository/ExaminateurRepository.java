// ExaminateurRepository.java
package com.example.gestion_memoire_app.repository;

import com.example.gestion_memoire_app.entity.Examinateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExaminateurRepository extends JpaRepository<Examinateur, Long> {
}