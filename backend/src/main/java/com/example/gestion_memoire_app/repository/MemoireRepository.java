// src/main/java/com/example/gestion_memoire_app/repository/MemoireRepository.java
package com.example.gestion_memoire_app.repository;

import com.example.gestion_memoire_app.entity.Memoire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoireRepository extends JpaRepository<Memoire, Long> {
}