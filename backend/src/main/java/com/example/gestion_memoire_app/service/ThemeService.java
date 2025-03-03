package com.example.gestion_memoire_app.service;

import com.example.gestion_memoire_app.entity.Theme;
import com.example.gestion_memoire_app.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThemeService {

    @Autowired
    private ThemeRepository themeRepository;

    public List<Theme> findAll() {
        return themeRepository.findAll();
    }

    public Optional<Theme> findById(Long id) {
        return themeRepository.findById(id);
    }

    public Theme save(Theme theme) {
        return themeRepository.save(theme);
    }

    public void deleteById(Long id) {
        themeRepository.deleteById(id);
    }
}