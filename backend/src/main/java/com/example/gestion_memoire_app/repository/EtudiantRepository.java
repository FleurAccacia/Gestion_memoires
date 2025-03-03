// EtudiantRepository.java
package com.example.gestion_memoire_app.repository;

import com.example.gestion_memoire_app.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}