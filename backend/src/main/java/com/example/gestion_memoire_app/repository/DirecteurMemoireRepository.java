// DirecteurMemoireRepository.java
package com.example.gestion_memoire_app.repository;

import com.example.gestion_memoire_app.entity.DirecteurMemoire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirecteurMemoireRepository extends JpaRepository<DirecteurMemoire, Long> {
}