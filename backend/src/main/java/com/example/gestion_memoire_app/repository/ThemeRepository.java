// ThemeRepository.java
package com.example.gestion_memoire_app.repository;

import com.example.gestion_memoire_app.entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemeRepository extends JpaRepository<Theme, Long> {
}