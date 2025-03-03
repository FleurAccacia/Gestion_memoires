package com.example.gestion_memoire_app.service;

import com.example.gestion_memoire_app.entity.DirecteurMemoire;
import com.example.gestion_memoire_app.repository.DirecteurMemoireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirecteurMemoireService {

    @Autowired
    private DirecteurMemoireRepository directeurMemoireRepository;

    public List<DirecteurMemoire> findAll() {
        return directeurMemoireRepository.findAll();
    }

    public Optional<DirecteurMemoire> findById(Long id) {
        return directeurMemoireRepository.findById(id);
    }

    public DirecteurMemoire save(DirecteurMemoire directeurMemoire) {
        return directeurMemoireRepository.save(directeurMemoire);
    }

    public void deleteById(Long id) {
        directeurMemoireRepository.deleteById(id);
    }
}